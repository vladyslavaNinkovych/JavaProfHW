package hw4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    Pattern login = Pattern.compile("[A-Za-z]*");
    Pattern password = Pattern.compile("[0-9A-Za-z]*");

    public boolean loginCheck(String enteredLogin){
        Matcher matcher = login.matcher(enteredLogin);
        return matcher.matches();
    }

    public boolean passwordCheck(String enteredPassword){
        Matcher matcher = password.matcher(enteredPassword);
        return matcher.matches();
    }
}
