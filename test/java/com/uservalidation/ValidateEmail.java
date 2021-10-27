package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateEmail {

    @Test
    void givenEmailOne_CheckForValidation_ReturnTrue(){
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailTwo_CheckForValidation_ReturnTrue(){
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc-100@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailThree_CheckForValidation_ReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc.100@abc.com.au");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailFour_CheckForValidation_ReturnFalse(){
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmailFive_CheckForValidation_ReturnFalse(){
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail(".abc@abc.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmailSix_CheckForValidation_ReturnFalse(){
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.validateEmail("abc@gmail.com.1a");
        Assertions.assertFalse(result);
    }
}