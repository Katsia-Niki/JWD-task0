package by.jwd.task0.configurator;

import by.jwd.task0.entity.CustomArray;

import java.util.List;

public interface Configurator {

    void addInRepository(CustomArray customArray);

    void addListInRepository(List<CustomArray> customArrayList);

    void addInWarehouse(CustomArray customArray);

    void addListInWarehouse(List<CustomArray> customArrayList);
}
