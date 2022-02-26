package test.jwd.task0.observer.impl;

import by.jwd.task0.entity.ArrayStatistics;
import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.observer.CustomArrayEvent;
import by.jwd.task0.observer.CustomArrayObserver;
import by.jwd.task0.observer.impl.CustomArrayObserverImpl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayObserverImplTest {

    private CustomArrayObserver observer;
    private CustomArray customArray;
    private CustomArrayEvent event;
    private Warehouse warehouse;

    @BeforeTest
    public void setUp() {
        observer = new CustomArrayObserverImpl();
        customArray = new CustomArray(1, 2, 3, 4);
        customArray.attach(observer);
        event = new CustomArrayEvent(customArray);

        warehouse = Warehouse.getInstance();
        warehouse.put(customArray.getCustomArrayId(), new ArrayStatistics(4, 1, 2.5, 10, 0, 4));
    }

    @Test
    public void changeArrayTest() throws CustomArrayException {
        observer.changeArray(event);
        customArray.setElementAt(0, 3);

        ArrayStatistics actual = warehouse.get(customArray.getCustomArrayId());
        ArrayStatistics expected = new ArrayStatistics(4,2, 3, 12, 0, 4);

        assertEquals(actual, expected);
    }

    @AfterTest
    public void tearDown() {
        observer = null;
        customArray = null;
        event = null;
        warehouse = null;
    }

}