package com.uservalidator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Narayan");
        Assert.assertEquals(true, result);
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Nara");
        Assert.assertEquals(false, result);
    }

    @Test
    void givenFirstName_WhenSpChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Nara");
        Assert.assertEquals(false, result);
    }

    @Test

    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("amarnikita09gmail.com");
        Assert.assertEquals(true, result);
    }
}
