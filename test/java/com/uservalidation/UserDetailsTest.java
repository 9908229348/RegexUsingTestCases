package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
    @Test
    public void givenDetails_CheckForValidation_ReturnHappy(){
        UserDetails userDetails = new UserDetails();
        String result = userDetails.validateDetails("Kallavai","Sravanthi","kalavaisravanthi99@gmail.com","98 9908229348","Sravanthi@446");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void givenNonMatchingDetails_CheckForValidation_ReturnSad() {
        UserDetails userDetails = new UserDetails();
        String result = userDetails.validateDetails("kallavai","Sravanthi","kalavaisravanthi99@gmail.com","98 9908229348","Sravanthi@446");
        Assert.assertEquals("Sad",result);
    }
}