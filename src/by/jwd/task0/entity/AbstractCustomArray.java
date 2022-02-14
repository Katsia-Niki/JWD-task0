package by.jwd.task0.entity;

import by.jwd.task0.creator.CustomArrayCreator;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.observer.CustomArrayObserver;
import by.jwd.task0.util.CustomArrayCounter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCustomArray {
    private int customArrayId;
    protected List<CustomArrayObserver> arrayObserverList = new ArrayList<>();

    public AbstractCustomArray() {
        this.customArrayId = CustomArrayCounter.generateCustomArrayId();
    }

    public int getCustomArrayId() {
        return customArrayId;
    }

    public abstract int getSize();

    public abstract int getElementAt(int index) throws CustomArrayException;

    public abstract void setElementAt(int index, int element) throws CustomArrayException;

    public abstract int[] getArray();

    public abstract void setArray(int... data);
}
