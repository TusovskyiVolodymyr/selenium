import parser.CSVParser;
import parser.Parser;
import parser.XLSParser;
import parser.XmlParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser parser = new CSVParser();
        System.out.println(parser.getLogin(0));
        Parser parser1 = new XLSParser();
        System.out.println(parser1.getPassword(0));
        Parser parser2  = new XmlParser();
        System.out.println(parser2.getPassword(4));
        System.out.println(parser.getAllLogins());
        System.out.println(parser1.getAllLogins());
        System.out.println(parser2.getAllLogins());
        System.out.println(parser.getAllPasswords());
        System.out.println(parser1.getAllPasswords());
        System.out.println(parser2.getAllPasswords());

    }
    public int add(int arg1,int arg2){
        return arg1+arg2;
    }
    public int multiply(int arg1,int arg2){
        return arg1*arg2;
    }
}
