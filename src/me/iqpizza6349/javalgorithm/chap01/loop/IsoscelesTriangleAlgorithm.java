package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.AlgorithmException;
import me.iqpizza6349.javalgorithm.StringAlgorithm;

public class IsoscelesTriangleAlgorithm implements StringAlgorithm<Integer> {

    @Override
    public String algorithm(Integer integer) throws AlgorithmException {
        final StringBuilder stringBuilder = new StringBuilder();
        return triangleRU(stringBuilder, integer);
    }

    protected String triangleLB(final StringBuilder stringBuilder, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("%n");
        }

        return stringBuilder.toString();
    }

    protected String triangleLU(final StringBuilder stringBuilder, int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                stringBuilder.append("*");
            }
            stringBuilder.append("%n");
        }

        return stringBuilder.toString();
    }

    protected String triangleRU(final StringBuilder stringBuilder, int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < n-i; j++) {
                stringBuilder.append("*");
            }

            stringBuilder.append("%n");
        }

        return stringBuilder.toString();
    }

    protected String triangleRB(final StringBuilder stringBuilder, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("%n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) throws AlgorithmException {
        IsoscelesTriangleAlgorithm algorithm = new IsoscelesTriangleAlgorithm();
        System.out.printf(algorithm.algorithm(5));
    }
}
