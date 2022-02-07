package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.entity.CustomArray;
import by.jwd.pretask1.service.CalculateSum;

public class CalculateSumImpl implements CalculateSum{

	@Override
	public int calculateSum(CustomArray custArr) {
		int[] array = custArr.getArray();
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}
