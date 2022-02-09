package by.jwd.task0.service;

import by.jwd.task0.entity.CustomArray;

public interface ArrayCalculateService {

	int findMax(CustomArray customArr);
	
	int findMin(CustomArray customArr);
	
	double calculateAverage(CustomArray customArr);
	
	int calculateSum(CustomArray customArr);
	
	int countNegative(CustomArray customArr);
	
	int countPositive(CustomArray customArr);
}
