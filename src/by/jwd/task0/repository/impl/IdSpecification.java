package by.jwd.task0.repository.impl;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.repository.Specification;

public class IdSpecification implements Specification<CustomArray> {

    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray array) {
        return  array.getCustomArrayId() == this.id;
    }
}
