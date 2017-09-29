package parser;

import java.io.IOException;
import java.util.List;

public interface Parser {
     String getLogin(int index) throws IOException;
    String getPassword(int index) throws IOException;
    List<String> getAllLogins();
    List<String> getAllPasswords();
}
