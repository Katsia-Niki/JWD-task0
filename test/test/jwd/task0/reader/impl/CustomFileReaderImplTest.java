package test.jwd.task0.reader.impl;

import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.reader.CustomFileReader;
import by.jwd.task0.reader.impl.CustomFileReaderImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CustomFileReaderImplTest {

    private String PATH_TO_FILE = "resources\\testData\\TestCustomArrayData.txt";
    private CustomFileReader customFileReader;

    @BeforeClass
    public void setUp() {
        customFileReader = new CustomFileReaderImpl();
    }

    @Test
    public void readOneLineFromFileTest() throws CustomArrayException {
        String actual = customFileReader.readOneLineFromFile(PATH_TO_FILE);
        String expected = "7, -4, 5, 1, -7, ";

        assertEquals(actual, expected);
    }

    @Test
    public void readFromFileTest() throws CustomArrayException {
        List<String> actual = customFileReader.readFromFile(PATH_TO_FILE);
        List<String> expected = new ArrayList<>();
        expected.add("7, -4, 5, 1, -7, ");
        expected.add("9, -7, 8, 7, 3, ");
        expected.add("1, 2, 3, 4, 5, ");
        expected.add("6, -8, 7, 3, ");
        expected.add("4, 3, -1, 8, 6, ");


        assertEquals(actual, expected);
    }
}