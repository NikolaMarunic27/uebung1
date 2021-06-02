package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidator {

    public static boolean checkLength(String password){

        if (password.length()<8||password.length()>25)
            return false;
        else return true;
    }

    public static boolean checkCase(String password){

        if(password.matches(".*[a-z].*")||password.matches(".*[A-Z].*"))
            return true;
        else return false;
    }
}

