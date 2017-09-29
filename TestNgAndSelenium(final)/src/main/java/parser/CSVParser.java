package parser;

import au.com.bytecode.opencsv.CSVReader;
import model.User;
import parser.Parser;
import properties.PropertiesUtill;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser implements Parser{
    public List<User> users = new ArrayList<>();
   private List<String> passwords = new ArrayList<>();
   private List<String> logins = new ArrayList<>();

    public void parse()  {
        PropertiesUtill utill = null;
        try {
            utill = new PropertiesUtill();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (CSVReader csvReader = new CSVReader(new FileReader(utill.getCsvPath()), ',', '"', 1)) {
            //employeeDetails stores the values current line
            String[] userDetails = null;
            users = new ArrayList<>();
            //Create List for holding Employee objects
            while ((userDetails = csvReader.readNext()) != null) {
                User user = new User();
                user.setLogin(userDetails[0]);
                user.setPassword(userDetails[1]);
                users.add(user);
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }

    }

//  public   List<User> users = parse();
    @Override
    public String getLogin(int index) {
        return  users.get(index).getLogin();
    }
    @Override
    public String getPassword(int index){
        return  users.get(index).getPassword();
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

    public static void main(String[] args) throws IOException {

    }
}


