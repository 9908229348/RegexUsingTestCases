package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ValidatePassWordTest {

    @Test
    void givenShortPassWord_CheckForValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validatePassWord("Sravan");
        Assertions.assertFalse(result);
    }

    @Test
    void givenAllSmalls_CheckForOptions_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validatePassWord("sravanthi");
        Assertions.assertFalse(result);
    }

    @Test
    void givenOneCapital_CheckForValidation_ReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validatePassWord("Sravanthi");
        Assertions.assertFalse(result);
    }

    @Test
    void givenOneNumeric_CheckForValidation_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validatePassWord("Sravanthi@446");
        Assertions.assertTrue(result);
    }
}

