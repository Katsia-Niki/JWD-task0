package test.jwd.task0.creator.impl;

import by.jwd.task0.creator.CustomArrayCreator;
import by.jwd.task0.creator.impl.CustomArrayCreatorImpl;
import by.jwd.task0.entity.CustomArray;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayCreatorImplTest {

    private CustomArrayCreator creator;

    @BeforeTest
    public void setUp() {
        creator = new CustomArrayCreatorImpl();
    }

    @Test
    public void CustomArrayCreatorImplTest() {

        int[] testData = new int[] {1, 2, 3, 4};

        CustomArray expected = new CustomArray(testData);

        CustomArray actual = creator.createCustomArray(testData);

        assertEquals(actual, expected);
    }
}