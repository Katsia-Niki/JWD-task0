package by.jwd.task0.repository;

import by.jwd.task0.entity.ArrayStatistics;
import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.ArraySortingService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;
import by.jwd.task0.service.impl.ArraySortingServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomRepository {

    private List<CustomArray> listOfArrays;

    public void add(int index, CustomArray element) {
        listOfArrays.add(index, element);
    }

    public CustomArray remove(int index) {
        return listOfArrays.remove(index);
    }

    public void addCustomArray(CustomArray customArray) {
        listOfArrays.add(customArray);
    }

    public void removeCustomArray(CustomArray customArray) {
        listOfArrays.remove(customArray);
    }

    public boolean addAll(List<CustomArray> customArrayList) {
        return listOfArrays.addAll(customArrayList);
    }

    public boolean removeAll(List<CustomArray> customArrayList) {
        return listOfArrays.removeAll(customArrayList);
    }

    public List<CustomArray> getListOfArrays() { return listOfArrays;  }

    public void setListOfArrays(List<CustomArray> listOfArrays) {
        this.listOfArrays = listOfArrays;
    }


    public void sort(Comparator<CustomArray> c) {
        listOfArrays.sort(c);
    }


    public List<CustomArray> query(Specification specification) {
        List<CustomArray> list = new ArrayList<>();

        for (CustomArray array : list) {
            if (specification.specify(array)) {
                list.add(array);
            }
        }
        return list;
    }
}
