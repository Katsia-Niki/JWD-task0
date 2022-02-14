package by.jwd.task0.entity;

import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.observer.CustomArrayEvent;
import by.jwd.task0.observer.CustomArrayObservable;
import by.jwd.task0.observer.CustomArrayObserver;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray extends AbstractCustomArray implements CustomArrayObservable {

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

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public int getElementAt(int index) throws CustomArrayException {
		if (index >= this.getSize() && index < 0) {
			logger.log(Level.ERROR, "Index out of bounds. Index: " + index);
			throw new CustomArrayException("Index out of bounds. Index: " + index);

		}
		return array[index];
	}

	@Override
	public void setElementAt(int index, int element) throws CustomArrayException {

		if (index >= this.getSize() && index < 0) {
			logger.log(Level.ERROR, "Index out of bounds. Index: " + index);
			throw new CustomArrayException("Index out of bounds. Index: " + index);

		}
		array[index] = element;
		notifyObservers();
		logger.log(Level.INFO, "The element at the " + index + " has been changed to " + element);
	}

	@Override
	public int[] getArray() {

		return array.clone();
	}

	@Override
	public void setArray(int... array) {
		this.array = array;
		notifyObservers();
	}

	@Override
	public void attach(CustomArrayObserver observer) {
		if (observer != null) {
			arrayObserverList.add(observer);
		}
	}

	@Override
	public void detach(CustomArrayObserver observer) {
		arrayObserverList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		CustomArrayEvent event = new CustomArrayEvent(this);

		for (CustomArrayObserver observer : arrayObserverList) {
			observer.changeArray(event);
		}

		//or
		//arrayObserverList.forEach(o -> o.changeArray(event));

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
		return "CustomArray: " + Arrays.toString(array);
	}
}