import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

// Used one normal test and a parameterized test just for training

class PasswordValidatorTest {

    @Test
    @DisplayName("Method should check for a specific length of the given password")

    public void passwordLengthTest(){

        // Given
        String testPassword = "strongPassword112";

        // When

        boolean actualLength = PasswordValidator.passwordLength(testPassword);
        boolean expectedLength = true;


        // Then

        assertEquals(expectedLength, actualLength);

    }

    @ParameterizedTest(name="Method should check if the password contains digits {0} should give {1}")
    @CsvSource({"strongPassword112, true",
            "weakPw, false",
            "$$$deklmNop, false"
    })
    public void passwordContainsDigitsTest(String testPassword, boolean expectedResult){

        // When

        boolean actualDigits = PasswordValidator.passwordContainsDigits(testPassword);

        // Then

        assertEquals(expectedResult, actualDigits);

    }

    @ParameterizedTest(name="Method should check if the given password has lower or upper case letters {0} should give {1}")
    @CsvSource({"strongPassword112, true",
            "weakPw, true",
            "$$$deklmnop, false"})
    public void passwordContainsLowerOrHigherCaseTest(String testPassword, boolean expectedResult){

        // When

        boolean actualLowerHigher = PasswordValidator.passwordContainsLowerHigher(testPassword);

        // Then

        assertEquals(expectedResult, actualLowerHigher);

    }

    @ParameterizedTest(name="Method should check if the given password is valid {0} should give {1}")
    @CsvSource({"strongPassword112, true",
            "weakPw, false",
            "$$$deklmnop, false"})
    public void isValidPasswordTest(String testPassword, boolean expectedResult){

        // When

        boolean actualPassword = PasswordValidator.isValidPassword(testPassword);

        // Then

        assertEquals(expectedResult, actualPassword);

    }





}