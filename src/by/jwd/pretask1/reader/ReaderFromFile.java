package by.jwd.pretask1.reader;

import java.util.List;

import by.jwd.pretask1.exception.AppException;

public interface ReaderFromFile {
	
	List<String> readFile (String pathToFile) throws AppException;
}
