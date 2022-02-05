package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.entity.CustomArray;
import by.jwd.pretask1.service.CountNegative;

public class CountNegativeImpl implements CountNegative {

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
}
