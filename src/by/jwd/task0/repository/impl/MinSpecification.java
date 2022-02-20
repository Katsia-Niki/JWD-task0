package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.repository.Specification;

public class MinSpecification implements Specification<CustomArray> {

    private int min;

    public MinSpecification(int min) {
        this.min = min;
    }

    @Override
    public boolean specify(CustomArray array) throws CustomArrayException {
        int id = array.getCustomArrayId();

        Warehouse warehouse = Warehouse.getInstance();
        int arrayMin = warehouse.get(id).getMin();

        return arrayMin <= min;
    }
}
