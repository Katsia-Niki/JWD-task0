package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.entity.Warehouse;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.repository.Specification;
import by.jwd.task0.service.ArrayCalculateService;
import by.jwd.task0.service.impl.ArrayCalculateServiceImpl;

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

        ArrayCalculateService service = new ArrayCalculateServiceImpl();
        int countPositive = service.countPositive(array);

        boolean result = (minPositiveNumbers <= countPositive && countPositive <= maxPositiveNumbers);
        return result;
    }
}
