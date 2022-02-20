package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.repository.Specification;

public class RangePositiveNumbersSpecification implements Specification<CustomArray> {

    private int minPositiveNumbers;
    private int maxPositiveNumbers;


    public RangePositiveNumbersSpecification(int minPositiveNumbers, int maxPositiveNumbers) {
        this.minPositiveNumbers = minPositiveNumbers;
        this.maxPositiveNumbers = maxPositiveNumbers;
    }

    @Override
    public boolean specify(CustomArray array) throws CustomArrayException {
        int id = array.getCustomArrayId();

        Warehouse warehouse = Warehouse.getInstance();
        int arrayPositiveNumbers = warehouse.get(id).getCountPositiveNumbers();

        boolean result = (minPositiveNumbers <= arrayPositiveNumbers && arrayPositiveNumbers <= maxPositiveNumbers);
        return result;
    }
}
