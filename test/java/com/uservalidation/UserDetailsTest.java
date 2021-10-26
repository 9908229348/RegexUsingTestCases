package com.uservalidation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserDetailsTest {
    @Test
    void givenFirstName_CheckValidationForFName_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateName("Savant");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstLetterSmall_CheckForValidationForFName_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateName("savant");
        Assertions.assertFalse(result);
    }

    @Test
    void givenTwoLetters_CheckForValidationForLName_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateName("Sr");
        Assertions.assertFalse(result);
    }

    @Test
    void givenTwoSmalls_CheckForValidationForLName_RerunFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateName("sr");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_CheckValidation_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc.xyz@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailWithoutTld_CheckValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc.xyz@gmail");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_CheckForValidation_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateMobileNumber("98 9908229348");
        Assertions.assertTrue(result);
    }

    @Test
    void givenNumberWithoutCC_CheckForValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateMobileNumber("9908229348");
        Assertions.assertFalse(result);
    }

    @Test
    void givenShortNumber_CheckForValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateMobileNumber("98 990822");
        Assertions.assertFalse(result);
    }
}
