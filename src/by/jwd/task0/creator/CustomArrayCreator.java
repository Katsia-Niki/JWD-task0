package by.jwd.task0.creator;

import by.jwd.task0.entity.CustomArray;

public interface CustomArrayCreator {

    CustomArray createCustomArray (int ... intArr);
    CustomArray createRandomCustomArray(int numberOfElements, int maxBound);
}
