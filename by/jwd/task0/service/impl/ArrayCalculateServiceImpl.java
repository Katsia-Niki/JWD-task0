package by.jwd.task0.service.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService{

	@Override
	public int findMax(CustomArray customArr) {
		int[] array = customArr.getArray();
		int max = array[0];
		
		for(int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	@Override
	public int findMin(CustomArray customArr) {
		int[] array = customArr.getArray();
		int min = array[0];
		
		for(int i : array) {
			if (i < min) {
				min = i;
			}
		}
			return min;
	}

	@Override
	public double calculateAverage(CustomArray customArr) {
		double sum = 0.0;
		int[] array = customArr.getArray();
		
		for (int i : array) {
			sum += i;
		}
		
		double average = sum / array.length;
		
		return average;
	}

	@Override
	public int calculateSum(CustomArray customArr) {
		int[] array = customArr.getArray();
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int countNegative(CustomArray customArr) {
		int[] array = customArr.getArray();
		int count = 0;

		for (int i : array) {
			if (i < 0) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int countPositive(CustomArray customArr) {
		int[] array = customArr.getArray();
		int count = 0;
		
		for (int i : array) {
			if (i > 0) {
				count++;
			}
		}
		return count;
	}
}
