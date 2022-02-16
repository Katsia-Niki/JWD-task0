package by.jwd.task0.observer;

import by.jwd.task0.exception.CustomArrayException;

public interface CustomArrayObservable {
    void attach(CustomArrayObserver observer);
    void detach(CustomArrayObserver observer);
    void notifyObservers();
}
