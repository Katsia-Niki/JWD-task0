package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.repository.Specification;

public class SumMoreThanSpecification implements Specification<CustomArray> {

    private int sum;

    public SumMoreThanSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray array) {

        int id = array.getCustomArrayId();

        Warehouse warehouse = Warehouse.getInstance();
        int arraySum = warehouse.get(id).getSum();

        return arraySum > sum;
    }
}
