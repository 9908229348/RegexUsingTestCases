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
    void givenLongPassWord_CheckForValidation_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validatePassWord("sravanthi");
        Assertions.assertTrue(result);
    }
}
