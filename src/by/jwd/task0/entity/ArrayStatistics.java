package by.jwd.task0.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class ArrayStatistics {
    private int max;
    private int min;
    private double average;
    private int sum;
    private int countNegativeNumbers;
    private int countPositiveNumbers;

    public ArrayStatistics(int max, int min, double average, int sum, int countNegativeNumbers, int countPositiveNumbers) {
        this.max = max;
        this.min = min;
        this.average = average;
        this.sum = sum;
        this.countNegativeNumbers = countNegativeNumbers;
        this.countPositiveNumbers = countPositiveNumbers;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCountNegativeNumbers() {
        return countNegativeNumbers;
    }

    public void setCountNegativeNumbers(int countNegativeNumbers) {
        this.countNegativeNumbers = countNegativeNumbers;
    }

    public int getCountPositiveNumbers() {
        return countPositiveNumbers;
    }

    public void setCountPositiveNumbers(int countPositiveNumbers) {
        this.countPositiveNumbers = countPositiveNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayStatistics that = (ArrayStatistics) o;
        return max == that.max && min == that.min && Double.compare(that.average, average) == 0 && sum == that.sum && countNegativeNumbers == that.countNegativeNumbers && countPositiveNumbers == that.countPositiveNumbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, average, sum, countNegativeNumbers, countPositiveNumbers);
    }

    @Override
    public String toString() {

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("max=" + max);
        joiner.add("min=" + min);
        joiner.add("average=" + average);
        joiner.add("sum=" + sum);
        joiner.add("countNegativeNumbers=" + countNegativeNumbers);
        joiner.add("countPositiveNumbers=" + countPositiveNumbers);

        return joiner.toString();
    }
}
