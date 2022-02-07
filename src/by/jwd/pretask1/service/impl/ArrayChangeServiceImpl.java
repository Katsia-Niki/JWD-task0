package by.jwd.pretask1.service.impl;

import by.jwd.pretask1.entity.CustomArray;
import by.jwd.pretask1.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService{

	@Override
	public CustomArray changeNegativeToZero(CustomArray custArr) {
		int [] array = custArr.getArray();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
		}
		return new CustomArray(array);
	}
}
