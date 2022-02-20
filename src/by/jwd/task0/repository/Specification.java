package by.jwd.task0.repository;

import by.jwd.task0.exception.CustomArrayException;

@FunctionalInterface
public interface Specification<T> {
    boolean specify(T array) throws CustomArrayException;
}
