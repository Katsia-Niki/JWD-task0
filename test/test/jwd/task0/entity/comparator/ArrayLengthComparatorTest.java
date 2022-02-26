package test.jwd.task0.entity.comparator;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.comparator.ArrayIdComparator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayLengthComparatorTest {

    @Test
    public void compareIdTest() {
        CustomArray customArray1 = new CustomArray(0, 0, 0, 0, 0);
        CustomArray customArray2 = new CustomArray(1, 1, 1, 1);

        ArrayIdComparator comparator = new ArrayIdComparator();

        int actual = comparator.compare(customArray1, customArray2);
        int expected = -1;

        assertEquals(actual, expected);
    }

}