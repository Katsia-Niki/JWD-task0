package by.jwd.task0.service.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.service.ArraySortingService;

public class ArraySortingServiceImpl implements ArraySortingService{

	@Override
	public void bubbleSort(CustomArray customArr) {
		int[] array = customArr.getArray();
		
		boolean needIteration = true;
		
		while(needIteration) {
			needIteration = false;
			
			for(int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					swap(array, i, i - 1);
					needIteration = false;
				}
			}
		}
	}

	@Override
	public void insertionSort(CustomArray customArr) {
		int[] array = customArr.getArray();
		
		for(int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i;
			
			while(j > 0 && array[j - 1] > current) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = current;
		}
	}

	@Override
	public void quickSort(CustomArray customArr) {
		int[] array = customArr.getArray();
		
		arrayQuickSort(array, 0, array.length - 1);
	}
	
	private void swap (int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
	private void arrayQuickSort(int[] array, int from, int to) {
		
		if (from < to) {
			int devideIndex = partitionArray(array, from, to);
			
			arrayQuickSort(array, from, devideIndex - 1);
			arrayQuickSort(array, devideIndex, to);
		}
	}
	
	private int partitionArray(int[] array, int from, int to) {
		int leftIndex = from;
		int rightIndex = to;
		
		int pivot = from;
		
		while (leftIndex <= rightIndex) {
			
			while(array[leftIndex] < pivot) {
				leftIndex++;
			}
			
			while(array[rightIndex] > pivot) {
				rightIndex--;
			}
			
			if (leftIndex <= rightIndex) {
				swap(array, leftIndex, rightIndex);
				leftIndex++;
				rightIndex--;
			}
		}
		return leftIndex;
	}

}
