package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.entity.CustomArray;
import by.jwd.pretask1.service.CalculateAverage;

public class CalculateAverageImpl implements CalculateAverage{

	@Override
	public int calculateAverage(CustomArray custArr) {
		
		int sum = 0;
		int[] array = custArr.getArray();
		
		for (int i : array) {
			sum += i;
		}
		
		int average = sum / array.length;
		
		return average;
	}

}
