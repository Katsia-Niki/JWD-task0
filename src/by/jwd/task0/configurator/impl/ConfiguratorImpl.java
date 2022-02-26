package by.jwd.task0.configurator.impl;

import by.jwd.task0.configurator.Configurator;
import by.jwd.task0.entity.ArrayStatistics;
import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.repository.CustomRepository;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;

import java.util.List;

public class ConfiguratorImpl implements Configurator {

    CustomRepository repository = CustomRepository.getInstance();
    Warehouse warehouse = Warehouse.getInstance();

    @Override
    public void addInRepository(CustomArray customArray) {
        repository.add(customArray);
    }

    @Override
    public void addListInRepository(List<CustomArray> customArrayList) {
        repository.addAll(customArrayList);
    }

    @Override
    public void addInWarehouse(CustomArray customArray) {
        int customArrayId = customArray.getCustomArrayId();

        ArrayCalculateService service = new ArrayCalculateServiceImpl();
        int sum = service.calculateSum(customArray);
        int min = service.findMin(customArray);
        int max = service.findMax(customArray);
        double average = service.calculateAverage(customArray);
        int countPositive = service.countPositive(customArray);
        int countNegative = service.countNegative(customArray);

        ArrayStatistics statistics = new ArrayStatistics(max, min, average, sum, countNegative, countPositive);

        warehouse.put(customArrayId, statistics);
    }

    @Override
    public void addListInWarehouse(List<CustomArray> customArrayList) {

        for(CustomArray customArray : customArrayList) {
            addInWarehouse(customArray);
        }

    }
}
