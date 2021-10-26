package com.uservalidation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserDetailsTest {
    @Test
    void givenFirstName_CheckValidation_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateFirstName("Sravanthi");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateFirstName("sravanthi");
        Assertions.assertFalse(result);
    }

    @Test
    void givenTwoLetters_CheckForValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateFirstName("Sr");
        Assertions.assertFalse(result);
    }
}
