package by.jwd.task0.util;

public class CustomArrayCounter {
    private static int counter = 0;

    private CustomArrayCounter() {
    }

    public static int generateCustomArrayId() {
        return ++counter;
    }
}
