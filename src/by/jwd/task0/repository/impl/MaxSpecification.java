package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.repository.Specification;

public class MaxSpecification implements Specification<CustomArray> {

    private int max;

    public MaxSpecification(int max) {
        this.max = max;
    }

    @Override
    public boolean specify(CustomArray array) {
        int id = array.getCustomArrayId();

        Warehouse warehouse = Warehouse.getInstance();
        int arrayMax = warehouse.get(id).getMax();

        return arrayMax >= max;
    }
}
