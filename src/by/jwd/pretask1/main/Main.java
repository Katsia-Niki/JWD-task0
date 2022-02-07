package by.jwd.pretask1.main;

import by.jwd.pretask1.entity.CustomArray;
import by.jwd.pretask1.service.CalculateAverage;
import by.jwd.pretask1.service.ChangeNegativeToZero;
import by.jwd.pretask1.service.CountNegative;
import by.jwd.pretask1.service.CountPositive;
import by.jwd.pretask1.service.FindMax;
import by.jwd.pretask1.service.FindMin;
import by.jwd.pretask1.service.impl.CalculateAverageImpl;
import by.jwd.pretask1.service.impl.ChangeNegativeToZeroImpl;
import by.jwd.pretask1.service.impl.CountNegativeImpl;
import by.jwd.pretask1.service.impl.CountPositiveImpl;
import by.jwd.pretask1.service.impl.FindMaxImpl;
import by.jwd.pretask1.service.impl.FindMinImpl;

public class Main {

	public static void main(String[] args) {
		int[] array = {1, -2, -4, 5, 10, 18};
		
		CustomArray ca = new CustomArray(array);
		
		
		
		
		CalculateAverage calcAverage = new CalculateAverageImpl();
		
		int average = calcAverage.calculateAverage(ca);
		
		
		FindMax fMax = new FindMaxImpl();
		
		int max = fMax.findMax(ca);
		

		FindMin fMin = new FindMinImpl();
		
		int min = fMin.findMin(ca);
		
		CountPositive cn = new CountPositiveImpl();
		int count = cn.countPositive(ca);
		
		System.out.println(count);
		
	}

}
