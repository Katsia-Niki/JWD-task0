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

    @Override
    public CustomArray createRandomCustomArray(int numberOfElements, int maxBound) {
        int[] arrayData = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            arrayData[i] = new Random().nextInt(maxBound);
        }
        return new CustomArray(arrayData);
    }
}
