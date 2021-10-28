package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetails {
    private final static String NAME = "^([A-Z][a-zA-Z]{2,})$";
    private final static String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private final static String MOBILE_NUMBER = "^(\\d{2})( )([6-9]{1})(\\d{9})";
    private final static String PASSWORD = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1})(?=\\S+$).{8,}";

    public String validateDetails(String fName, String lName, String email, String mobileNumber, String passWord){
        Pattern patternFName = Pattern.compile(NAME);
        Pattern patternLName = Pattern.compile(NAME);
        Pattern patternEmail = Pattern.compile(EMAIL_PATTERN);
        Pattern patternMobileNumber = Pattern.compile(MOBILE_NUMBER);
        Pattern patternPassWord = Pattern.compile(PASSWORD);
        boolean matcherFName = patternFName.matcher(fName).matches();
        boolean matcherLName = patternLName.matcher(lName).matches();
        boolean matcherEmail = patternEmail.matcher(email).matches();
        boolean matcherMobileNumber = patternMobileNumber.matcher(mobileNumber).matches();
        boolean matcherPassWord = patternPassWord.matcher(passWord).matches();

        if(matcherFName == true && matcherLName == true && matcherEmail == true && matcherMobileNumber == true && matcherPassWord == true)
            return "Happy";
        else
            return "Sad";
    }
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
