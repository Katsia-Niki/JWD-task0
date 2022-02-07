package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.entity.CustomArray;
import by.jwd.pretask1.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService{

	@Override
	public int findMax(CustomArray custArr) {
		int[] array = custArr.getArray();
		int max = array[0];
		
		for(int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	@Override
	public int findMin(CustomArray custArr) {
		int[] array = custArr.getArray();
		int min = array[0];
		
		for(int i : array) {
			if (i < min) {
				min = i;
			}
		}
			return min;
	}

	@Override
	public double calculateAverage(CustomArray custArr) {
		double sum = 0.0;
		int[] array = custArr.getArray();
		
		for (int i : array) {
			sum += i;
		}
		
		double average = sum / array.length;
		
		return average;
	}

	@Override
	public int calculateSum(CustomArray custArr) {
		int[] array = custArr.getArray();
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int countNegative(CustomArray custArr) {
		int[] array = custArr.getArray();
		int count = 0;

		for (int i : array) {
			if (i < 0) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int countPositive(CustomArray custArr) {
		int[] array = custArr.getArray();
		int count = 0;
		
		for (int i : array) {
			if (i > 0) {
				count++;
			}
		}
		return count;
	}
}
