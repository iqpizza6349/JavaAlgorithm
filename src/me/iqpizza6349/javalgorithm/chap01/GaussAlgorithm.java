package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.MathAlgorithm;

public class GaussAlgorithm implements MathAlgorithm<Integer> {

    @Override
    public Integer getSum(Integer a, Integer b) {
        return (a + b) * (b - a + 1) / 2;
    }

    public static void main(String[] args) {
        GaussAlgorithm gaussAlgorithm = new GaussAlgorithm();
        System.out.println(gaussAlgorithm.getSum(1, 100));
    }
}
