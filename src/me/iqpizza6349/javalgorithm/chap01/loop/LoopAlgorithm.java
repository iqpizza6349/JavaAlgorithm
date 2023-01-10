package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.Algorithm;

public class LoopAlgorithm implements Algorithm<Integer> {

    @Override
    public Integer algorithm(final Integer integer) {
        int count = 1, sum = 0;

        while (count <= integer) {
            sum += count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopAlgorithm loopAlgorithm = new LoopAlgorithm();
        System.out.println(loopAlgorithm.algorithm(5));
    }
}
