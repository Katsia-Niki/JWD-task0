package by.jwd.task0.creator.impl;

import by.jwd.task0.creator.CustomArrayCreator;
import by.jwd.task0.entity.CustomArray;

import java.util.Random;
import java.util.stream.IntStream;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    @Override
    public CustomArray createCustomArray(int... intArr) {
        return new CustomArray(intArr);
    }

    public CustomArray createFullCustomArray(int numberOfElements) {
        int[] ints = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            ints[i] = new Random().nextInt(100);
        }
        return new CustomArray(ints);
    }
}
