package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.service.CalculateSum;

public class CalculateSumImpl implements CalculateSum{

	@Override
	public int calculateSum(int[] array) {
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}
