package test.jwd.task0.validator.impl;

import by.jwd.task0.validator.StringValidator;
import by.jwd.task0.validator.impl.StringValidatorImpl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringValidatorImplTest {

    StringValidator validator;

    @BeforeTest
    public void setUp() {
        validator = StringValidatorImpl.getInstance();
    }

    @Test
    public void incorrectValidateStringTest() {
        boolean actual = validator.validateString("1, 5k, 7, 9!, ");
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    public void correctValidateStringTest() {
        boolean actual = validator.validateString("1, 5, 7, 9, ");

        assert(true);
    }

}