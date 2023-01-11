package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.AlgorithmException;
import me.iqpizza6349.javalgorithm.StringAlgorithm;

public class PyramidAlgorithm implements StringAlgorithm<Integer> {

    @Override
    public String algorithm(Integer integer) throws AlgorithmException {
        StringBuilder stringBuilder = new StringBuilder();
        drawTextPyramid(stringBuilder, integer);
        return stringBuilder.toString();
    }

    protected void drawStarPyramid(final StringBuilder stringBuilder, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < i; j++) {
                stringBuilder.append("*");
            }
            for (int j = 0; j < i - 1; j++) {
                stringBuilder.append("*");
            }

            stringBuilder.append("%n");
        }
    }

    protected void drawTextPyramid(final StringBuilder stringBuilder, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < i; j++) {
                stringBuilder.append(i);
            }
            for (int j = 0; j < i - 1; j++) {
                stringBuilder.append(i);
            }

            stringBuilder.append("%n");
        }
    }


    public static void main(String[] args) throws AlgorithmException {
        PyramidAlgorithm pyramidAlgorithm = new PyramidAlgorithm();
        System.out.printf(pyramidAlgorithm.algorithm(5));
    }
}
