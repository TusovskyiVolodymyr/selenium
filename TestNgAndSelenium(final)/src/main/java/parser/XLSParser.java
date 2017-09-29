package parser;

import model.User;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import properties.PropertiesUtill;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XLSParser implements parser.Parser{
 public     List<User> users = new ArrayList<>();
 private    List<String> logins = new ArrayList<>();
 private    List<String> passwords = new ArrayList<>();



    public    void parse() {
        PropertiesUtill utill = null;
        try {
            utill = new PropertiesUtill();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String excelPath = utill.getXlsPath();
        try(FileInputStream fileInputStream = new FileInputStream(new File(excelPath))) {
            // Create Workbook instance holding .xls file
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            // Get the first worksheet
            XSSFSheet sheet = workbook.getSheetAt(0);
            // Iterate through each rows
            Iterator rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                // Get Each Row
                Row row = (Row) rowIterator.next();
                //Leaving the first row alone as it is header
                if(row.getRowNum() == 0)
                    continue;
                // Iterating through Each column of Each Row
                Iterator cellIterator = row.cellIterator();
                User user = new User();
                while (cellIterator.hasNext()) {
                    Cell cell = (Cell) cellIterator.next();
                    int columnIndex = cell.getColumnIndex();
                    switch (columnIndex+1) {
                        case 1:
                            user.setLogin(cell.getStringCellValue());
                            break;
                        case 2:
                                if (cell.getCellTypeEnum()==CellType.NUMERIC) {
                                    user.setPassword(String.valueOf((int)cell.getNumericCellValue()));
                                }
                                else user.setPassword(cell.getStringCellValue());
                            break;
                    }
                }
                users.add(user);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    @Override
    public String getLogin(int index) throws IOException {
        return users.get(index).getLogin();
    }
    @Override
    public String getPassword(int index) throws IOException {
        return users.get(index).getPassword() ;
    }

    @Override
    public List<String> getAllLogins() {
        for (int i = 0; i < users.size(); i++) {
            logins.add(users.get(i).getLogin());
        }
        return logins;
    }

    @Override
    public List<String> getAllPasswords() {
        for (int i = 0; i < users.size(); i++) {
            passwords.add(users.get(i).getPassword());
        }
        return passwords;
    }
}
