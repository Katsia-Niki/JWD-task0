package by.jwd.task0.entity;

import java.util.Map;

public class Warehouse {
    private static Warehouse instance;
    private Map<Integer, ArrayStatistics> arrayStatisticsMap;

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public ArrayStatistics get(Object key) {

        return arrayStatisticsMap.get(key); //добавить логи и исключения??
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
