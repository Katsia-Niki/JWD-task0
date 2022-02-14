package by.jwd.task0.repository;

@FunctionalInterface
public interface Specification<T> {
    boolean specify(T array);
}
