package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordValidatorTest {
    @Test
    public void testPasswordTooShort(){

        boolean output = PasswordValidator.checkLength("123");
        assertFalse(output);  // Testcase tests returnvalue of method checklength

    }

    @Test
    public void testPasswordTooLong(){

        boolean output = PasswordValidator.checkLength("123456789112345678921234568458486");
        assertFalse(output);

    }

    @Test
    public void testPasswordValidLength(){

        boolean output = PasswordValidator.checkLength("123456789");
        assertTrue(output);
    }
}
