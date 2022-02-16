package by.jwd.task0.observer.impl;

import by.jwd.task0.creator.CustomArrayCreator;
import by.jwd.task0.entity.ArrayStatistics;
import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.observer.CustomArrayEvent;
import by.jwd.task0.observer.CustomArrayObserver;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObserverImpl implements CustomArrayObserver {

    static Logger logger = LogManager.getLogger();

    @Override
    public void changeArray(CustomArrayEvent event) {

        CustomArray customArray = event.getSource();

        ArrayCalculateService arrayCalculateService = new ArrayCalculateServiceImpl();
        int min = arrayCalculateService.findMin(customArray);
        int max = arrayCalculateService.findMax(customArray);
        int sum = arrayCalculateService.calculateSum(customArray);
        double average = arrayCalculateService.calculateAverage(customArray);
        int positiveNumbers = arrayCalculateService.countPositive(customArray);
        int negativeNumbers = arrayCalculateService.countNegative(customArray);

        int id = customArray.getCustomArrayId();

        ArrayStatistics arrayStatistics = new ArrayStatistics(max, min, average, sum, negativeNumbers, positiveNumbers);

        Warehouse warehouse = Warehouse.getInstance();

        warehouse.replace(id, arrayStatistics);

        logger.log(Level.INFO, "Parameters of CustomArray " + id + " were changed. " + arrayStatistics);

    }
}
