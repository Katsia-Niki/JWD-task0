package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.service.FindMax;

public class FindMaxImpl implements FindMax {

	@Override
	public int findMax(int[] array) {
		int max = array[0];
		
		for(int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
