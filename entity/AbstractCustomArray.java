package by.jwd.task0.entity;

import by.jwd.task0.creator.CustomArrayCreator;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.observer.CustomArrayEvent;
import by.jwd.task0.observer.CustomArrayObservable;
import by.jwd.task0.observer.CustomArrayObserver;
import by.jwd.task0.util.CustomArrayCounter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCustomArray implements CustomArrayObservable {
    private int customArrayId;
    private List<CustomArrayObserver> arrayObserverList = new ArrayList<>();

    public AbstractCustomArray() {
        this.customArrayId = CustomArrayCounter.generateCustomArrayId();
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

    public int getCustomArrayId() {
        return customArrayId;
    }

    public abstract int getSize();

    public abstract int getElementAt(int index) throws CustomArrayException;

    public abstract void setElementAt(int index, int element) throws CustomArrayException;

    public abstract int[] getArray();

    public abstract void setArray(int... data);
}
