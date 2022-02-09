package by.jwd.task0.parser.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.parser.StringToIntArrayParser;

public class StringToIntArrayParserImpl implements StringToIntArrayParser {
	
	static Logger logger = LogManager.getLogger();
	private static final String STRING_SPLIT_REGEX = ", ";	

	@Override
	public int[] parseCustomArray(String arrayData) throws CustomArrayException{
		
		int[] intArray = null;

		if (arrayData.isBlank()) {
			logger.error("Correct data to parse not found.");
			throw new CustomArrayException();
		}
		
		String[] stringArray = arrayData.split(STRING_SPLIT_REGEX);
		intArray = new int[stringArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
		return intArray;
	}
}
