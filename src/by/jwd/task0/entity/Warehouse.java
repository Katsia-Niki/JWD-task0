package by.jwd.task0.entity;

import by.jwd.task0.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    static Logger logger = LogManager.getLogger();

    private static Warehouse instance;
    private Map<Integer, ArrayStatistics> arrayStatisticsMap;

    private Warehouse() {
        arrayStatisticsMap = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public ArrayStatistics get(Object key) throws CustomArrayException {
        if(arrayStatisticsMap.containsKey(key)) {
            return arrayStatisticsMap.get(key);
        } else {
            logger.error("Element " + key + " not found.");
            throw new CustomArrayException("Element " + key + " not found.");
        }

    }

    public void put(Integer key, ArrayStatistics value) {

        arrayStatisticsMap.put(key, value);
    }

    public ArrayStatistics replace(Integer key, ArrayStatistics value) {

        return arrayStatisticsMap.replace(key, value);
    }

    public ArrayStatistics remove(Object key) {

        return arrayStatisticsMap.remove(key);
    }
}
