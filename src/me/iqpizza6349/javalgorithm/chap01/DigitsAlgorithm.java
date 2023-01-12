package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.algorithms.MathAlgorithm;

public class DigitsAlgorithm implements MathAlgorithm<Integer> {

    @Override
    public Integer algorithm(Integer integer) {
        return String.valueOf(integer.intValue())
                .length();
    }

    public static void main(String[] args) {
        DigitsAlgorithm digitsAlgorithm = new DigitsAlgorithm();
        System.out.println(digitsAlgorithm.algorithm(135));
    }

}
