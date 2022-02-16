package by.jwd.task0.entity.comparator;

import by.jwd.task0.entity.CustomArray;

import java.util.Comparator;

public class ArrayIdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getCustomArrayId() - o2.getCustomArrayId();
    }
}
