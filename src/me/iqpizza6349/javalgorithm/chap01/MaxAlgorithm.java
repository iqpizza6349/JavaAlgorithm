package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.MathAlgorithm;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxAlgorithm implements MathAlgorithm<Integer> {

    @Override
    public <S extends Number> Integer getMaxValue(S[] s) {
        OptionalInt max = Arrays.stream(s)
                .mapToInt(Number::intValue)
                .max();
        return (max.isPresent()) ? max.getAsInt() : -1;
    }

    public int getMaxValue(int... ints) {
        return getMaxValue(Arrays.stream(ints).boxed().toArray(Integer[]::new));
    }

    @Override
    public <S extends Number> Integer getMinValue(S[] s) {
        OptionalInt min = Arrays.stream(s)
                .mapToInt(Number::intValue)
                .min();
        return (min.isPresent()) ? min.getAsInt() : -1;
    }

    public int getMinValue(int... ints) {
        return getMinValue(Arrays.stream(ints).boxed().toArray(Integer[]::new));
    }

    public static void main(String[] args) {
        MaxAlgorithm algorithm = new MaxAlgorithm();
        System.out.println(algorithm.getMaxValue(new Number[]{3, 2, 1}));
        System.out.println(algorithm.getMaxValue(new Number[]{3, 2, 1, 5}));
        System.out.println(algorithm.getMinValue(new Number[]{3, 2, 1}));
        System.out.println(algorithm.getMinValue(new Number[]{3, 2, 1, -1}));
    }
}
