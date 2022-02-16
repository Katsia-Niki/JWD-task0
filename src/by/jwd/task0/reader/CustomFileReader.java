package by.jwd.task0.reader;

import by.jwd.task0.exception.CustomArrayException;

import java.util.List;

public interface CustomFileReader {

	String readOneLineFromFile(String pathToFile) throws CustomArrayException;

	List<String> readFromFile (String pathToFile) throws CustomArrayException;
}