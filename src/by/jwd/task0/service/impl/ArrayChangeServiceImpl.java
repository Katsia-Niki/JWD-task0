package by.jwd.task0.service.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService{

	@Override
	public CustomArray changeNegativeToZero(CustomArray customArr) {
		int [] array = customArr.getArray();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
		}
		return new CustomArray(array);
	}
}
