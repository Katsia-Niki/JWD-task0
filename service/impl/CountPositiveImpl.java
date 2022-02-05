package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.service.CountPositive;

public class CountPositiveImpl implements CountPositive{

	@Override
	public int countPositive(int[] array) {
		int count = 0;
		
		for (int i : array) {
			if (i > 0) {
				count++;
			}
		}
		return count;
	}
}
