package by.jwd.pretask1.service;

import by.jwd.pretask1.entity.CustomArray;

public interface ArrayCalculateService {

	int findMax(CustomArray custArr);
	
	int findMin(CustomArray custArr);
	
	double calculateAverage(CustomArray custArr);
	
	int calculateSum(CustomArray custArr);
	
	int countNegative(CustomArray custArr);
	
	int countPositive(CustomArray custArr);
}
