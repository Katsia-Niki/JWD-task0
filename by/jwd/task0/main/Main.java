package by.jwd.task0.main;


import java.util.Arrays;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.parser.StringToIntArrayParser;
import by.jwd.task0.parser.impl.StringToIntArrayParserImpl;
import by.jwd.task0.reader.CustomFileReader;
import by.jwd.task0.reader.impl.CustomFileReaderImpl;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;



public class Main {

	public static void main(String[] args) {
		
		CustomFileReader reader = new CustomFileReaderImpl();
		StringToIntArrayParser parser = new StringToIntArrayParserImpl();
		
		ArrayCalculateService calcService = new ArrayCalculateServiceImpl();
		
		try {
			String arrayData = reader.readFromFile("src\\resources\\CustomArrayData.txt");
			
			int [] parseData = parser.parseCustomArray(arrayData);
			
			CustomArray testArr = new CustomArray(parseData);
			
			int maxValue = calcService.findMax(testArr);
			int sum = calcService.calculateSum(testArr);
			
		} catch (CustomArrayException e) {
			e.printStackTrace();
		}	
	}
}
