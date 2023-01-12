package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.algorithms.AlgorithmException;
import me.iqpizza6349.javalgorithm.algorithms.MathAlgorithm;

import java.util.Arrays;

public class MedianAlgorithm implements MathAlgorithm<Integer> {

    @Override
    public <S extends Number> Integer getMedian(S[] s) throws AlgorithmException {
        int[] integers = Arrays.stream(s)
                .mapToInt(Number::intValue)
                .sorted()
                .toArray();
        int length = integers.length;
        if (length == 0) {
            throw new AlgorithmException();
        }

        int center = length / 2;
        if (length % 2 == 1) {
            return integers[center];
        }
        return (integers[center - 1] + integers[center]) / 2;
    }

    public int getMedian(int... ints) throws AlgorithmException {
        return getMedian(Arrays.stream(ints).boxed().toArray(Integer[]::new));
    }

    public static void main(String[] args) throws AlgorithmException {
        MedianAlgorithm medianAlgorithm = new MedianAlgorithm();
        System.out.println(medianAlgorithm.getMedian(new Number[]{1, 3, 2}));
    }
}
