package by.jwd.task0.entity;

import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.observer.CustomArrayEvent;
import by.jwd.task0.observer.CustomArrayObservable;
import by.jwd.task0.observer.CustomArrayObserver;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray extends AbstractCustomArray {

	static Logger logger = LogManager.getLogger();

	private int[] array;

	public CustomArray() {
		logger.log(Level.INFO, "Custom array was created");
		this.array = new int[0];
	}

	public CustomArray(int... array) {
		this.array = array;
		logger.log(Level.INFO, "Custom array was created");
	}


	public int getSize() {
		return array.length;
	}


	public int getElementAt(int index) throws CustomArrayException {
		if (index >= this.getSize() && index < 0) {
			logger.log(Level.ERROR, "Index out of bounds. Index: " + index);
			throw new CustomArrayException("Index out of bounds. Index: " + index);

		}
		return array[index];
	}


	public void setElementAt(int index, int element) throws CustomArrayException {

		if (index >= this.getSize() && index < 0) {
			logger.log(Level.ERROR, "Index out of bounds. Index: " + index);
			throw new CustomArrayException("Index out of bounds. Index: " + index);

		}
		array[index] = element;
		notifyObservers();
		logger.log(Level.INFO, "The element at the " + index + " has been changed to " + element);
	}


	public int[] getArray() {

		return array.clone();
	}


	public void setArray(int... array) {
		this.array = array;
		notifyObservers();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomArray other = (CustomArray) obj;
		return Arrays.equals(array, other.array);
	}

	@Override
	public String toString() {
		return "CustomArray id: " + this.getCustomArrayId() + Arrays.toString(array);
	}
}