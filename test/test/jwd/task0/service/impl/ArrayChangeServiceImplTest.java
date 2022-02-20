package test.jwd.task0.service.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.parser.StringToIntArrayParser;
import by.jwd.task0.parser.impl.StringToIntArrayParserImpl;
import by.jwd.task0.reader.CustomFileReader;
import by.jwd.task0.reader.impl.CustomFileReaderImpl;
import by.jwd.task0.service.ArrayChangeService;
import by.jwd.task0.service.impl.ArrayChangeServiceImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayChangeServiceImplTest {

    ArrayChangeService arrayChangeService;
    CustomArray customArray;

    @BeforeTest
    public void setUp() throws CustomArrayException {
        arrayChangeService = new ArrayChangeServiceImpl();
        CustomFileReader customFileReader = new CustomFileReaderImpl();
        StringToIntArrayParser stringToIntArrayParser = new StringToIntArrayParserImpl();
        String dataFromFile = customFileReader.readOneLineFromFile("resources\\testData\\TestCustomArrayData.txt");
        int[] data = stringToIntArrayParser.parseCustomArray(dataFromFile);
        customArray = new CustomArray(data);
    }

    @Test
    public void changeNegativeToZeroTest() {
        CustomArray expected = new CustomArray(7, 0, 5, 1, 0);
        CustomArray actual = arrayChangeService.changeNegativeToZero(customArray);

        assertEquals(expected, actual);
    }
}