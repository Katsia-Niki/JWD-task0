package test.jwd.task0.service.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.service.ArraySortingService;
import by.jwd.task0.service.impl.ArraySortingServiceImpl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortingServiceImplTest {

    private ArraySortingService arraySortingService;

    @BeforeTest
    public void setUp() {
        arraySortingService = new ArraySortingServiceImpl();
    }

    @Test
    public void testBubbleSort() {
        CustomArray actual = new CustomArray(5, 4, -1, 8, 3);
        CustomArray expected = new CustomArray(-1, 3, 4, 5, 8);

        arraySortingService.bubbleSort(actual);

        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        CustomArray actual = new CustomArray(5, 4, -1, 8, 3);
        CustomArray expected = new CustomArray(-1, 3, 4, 5, 8);

        arraySortingService.bubbleSort(actual);

        assertEquals(actual, expected);
    }

    @Test
    public void testQuickSort() {
        CustomArray actual = new CustomArray(5, 4, -1, 8, 3);
        CustomArray expected = new CustomArray(-1, 3, 4, 5, 8);

        arraySortingService.bubbleSort(actual);

        assertEquals(actual, expected);
    }

    @AfterTest
    public void clean() {
        arraySortingService = null;
    }
}