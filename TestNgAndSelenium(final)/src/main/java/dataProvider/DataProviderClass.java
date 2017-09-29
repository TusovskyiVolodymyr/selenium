package dataProvider;

import model.Users;
import org.testng.annotations.DataProvider;
import parser.CSVParser;
import parser.Parser;
import parser.XLSParser;
import parser.XmlParser;

import java.io.IOException;

public class DataProviderClass {
    private static XmlParser parse = new XmlParser();
//    private static CSVParser parse = new CSVParser();
//    private static XLSParser parse = new XLSParser();

    private static Users users = new Users();
    @DataProvider(name = "dataProvider",parallel = true)
    public static Object[][] dataProviderMethod() throws IOException {
        parse.parse();
        Object[][] data = new Object[parse.users.getUsers().size()][2];
        for (int i = 0; i <parse.users.getUsers().size(); i++) {
            data [i][0] = parse.getLogin(i);
            data [i][1] = parse.getPassword(i);
        }
        return data;
    }

    public static void main(String[] args) {
        Parser parser = new XmlParser();
        System.out.println(parser.getAllLogins().size());
    }
}

