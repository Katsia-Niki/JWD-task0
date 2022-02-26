package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.repository.Specification;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;

public class MaxSpecification implements Specification<CustomArray> {

    private int max;

    public MaxSpecification(int max) {
        this.max = max;
    }

    @Override
    public boolean specify(CustomArray array) throws CustomArrayException {
        int id = array.getCustomArrayId();

        ArrayCalculateService service = new ArrayCalculateServiceImpl();

        return service.findMax(array) >= max;
    }
}
