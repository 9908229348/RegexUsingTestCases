package com.uservalidation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserDetailsTest {
    @Test
    void givenFirstName_CheckValidationForFName_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateName("Sravanthi");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstLetterSmall_CheckForValidationForFName_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateName("sravanthi");
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
}
