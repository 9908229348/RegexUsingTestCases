package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetails {
    private final static String FIRST_NAME = "([A-Z][a-zA-Z]{2,})$";
    private final static String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public boolean validateName(String name){
        Pattern pattern = Pattern.compile(FIRST_NAME);
        return pattern.matcher(name).matches();
    }

    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
