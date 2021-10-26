package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetails {
    private final static String FirstName = "([A-Z][a-zA-Z]{2,})$";

    public boolean validateName(String name){
        Pattern pattern = Pattern.compile(FirstName);
        return pattern.matcher(name).matches();
    }
}
