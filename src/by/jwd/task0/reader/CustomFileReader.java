package by.jwd.task0.reader;

import by.jwd.task0.exception.CustomArrayException;

public interface CustomFileReader {
	
	String readFromFile (String pathToFile) throws CustomArrayException;
}