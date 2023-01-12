package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.algorithms.AlgorithmException;
import me.iqpizza6349.javalgorithm.algorithms.StringAlgorithm;

public class RectangleAlgorithm implements StringAlgorithm<Integer> {

    @Override
    public String algorithm(Integer integer) throws AlgorithmException {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < integer; i++) {
            for (int j = 0; j < integer; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("%n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws AlgorithmException {
        RectangleAlgorithm rectangleAlgorithm = new RectangleAlgorithm();
        System.out.printf(rectangleAlgorithm.algorithm(5));
    }
}
