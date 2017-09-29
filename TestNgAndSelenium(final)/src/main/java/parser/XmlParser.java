package parser;

import model.User;
import model.Users;
import parser.Parser;
import properties.PropertiesUtill;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlParser implements Parser {
    public Users users;
    private PropertiesUtill utill;

    public XmlParser() {
        try {
            utill = new PropertiesUtill();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parse() {
        try {
            File file = new File(utill.getXmlPath());
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            users = (Users) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

//public List<User> users1 = users.getUsers();
    public String getLogin(int index) {
        parse();
        return users.getUsers().get(index).getLogin();
    }

    public List<String> getAllLogins() {
        parse();
        List<String> logins = new ArrayList<>();
        for (int i = 0; i < users.getUsers().size(); i++) {
            logins.add(users.getUsers().get(i).getLogin());
        }
        return logins;
    }

    @Override
    public List<String> getAllPasswords() {
        parse();
        List<String> passwords = new ArrayList<>();
        for (int i = 0; i < users.getUsers().size(); i++) {
            passwords.add(users.getUsers().get(i).getPassword());
        }
        return passwords;
    }

    public String getPassword(int index) {
        parse();
        return users.getUsers().get(index).getPassword();
    }
}