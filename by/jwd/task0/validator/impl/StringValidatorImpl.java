package by.jwd.task0.validator.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jwd.task0.validator.StringValidator;

public class StringValidatorImpl implements StringValidator{
	
	private static final StringValidatorImpl instance = new StringValidatorImpl();
	
	private StringValidatorImpl() {
		
	}
	
	public static StringValidatorImpl getInstance() {
		return instance;
	}

	@Override
	public boolean validateString(String stringAsInt) {
		
		Pattern pattern = Pattern.compile(STRING_AS_INT_ARRAY_REGEX);
		Matcher matcher = pattern.matcher(stringAsInt);
		
		return matcher.matches();
	}
}
