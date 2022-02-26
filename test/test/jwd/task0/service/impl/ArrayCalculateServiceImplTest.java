package test.jwd.task0.service.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayCalculateServiceImplTest {

    private ArrayCalculateService arrayCalculateService;

    @BeforeTest
    public void setUp() {
        arrayCalculateService = new ArrayCalculateServiceImpl();
    }

    @Test
    public void testFindMax() {

        CustomArray customArray = new CustomArray(1, 9, 7, 3);

        int actual = arrayCalculateService.findMax(customArray);
        int expected = 9;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {

        CustomArray customArray = new CustomArray(1, 9, 7, 3);

        int actual = arrayCalculateService.findMin(customArray);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateAverage() {

        CustomArray customArray = new CustomArray(10, 20, 8, 4);

        double actual = arrayCalculateService.calculateAverage(customArray);
        double expected = 10.5;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateSum() {

        CustomArray customArray = new CustomArray(10, 20, 8, 4);

        int actual = arrayCalculateService.calculateSum(customArray);
        int expected = 42;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountNegative() {

        CustomArray customArray = new CustomArray(10, -20, 8, -4);

        int actual = arrayCalculateService.countNegative(customArray);
        int expected = 2;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountPositive() {

        CustomArray customArray = new CustomArray(10, -20, 8, 4);

        int actual = arrayCalculateService.countPositive(customArray);
        int expected = 3;

        Assert.assertEquals(actual, expected);
    }

    @AfterTest
    public void clean() {
        arrayCalculateService = null;
    }
}