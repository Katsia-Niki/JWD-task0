package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.repository.Specification;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;

public class SumMoreThanSpecification implements Specification<CustomArray> {

    private int sum;

    public SumMoreThanSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray array) throws CustomArrayException {

        int id = array.getCustomArrayId();

        ArrayCalculateService service = new ArrayCalculateServiceImpl();

        return service.calculateSum(array) > sum;
    }
}
