package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.service.CountNegative;

public class CountNegativeImpl implements CountNegative {

	@Override
	public int countNegative(int[] array) {
		int count = 0;

		for (int i : array) {
			if (i < 0) {
				count++;
			}
		}
		return count;
	}
}
