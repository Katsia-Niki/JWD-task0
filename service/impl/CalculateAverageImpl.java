package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.service.CalculateAverage;

public class CalculateAverageImpl implements CalculateAverage{

	@Override
	public int calculateAverage(int[] array) {
		int average;
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		
		average = sum / array.length;
		
		return average;
	}

}
