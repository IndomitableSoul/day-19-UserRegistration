package com.uservalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String EMAIL_PATTER = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();

    }

    public boolean validateEmail(String email) {
        Pattern patter = Pattern.compile(EMAIL_PATTER);
        return false;
    }
}
