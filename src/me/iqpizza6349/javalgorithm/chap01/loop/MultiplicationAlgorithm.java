package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.algorithms.AlgorithmException;
import me.iqpizza6349.javalgorithm.algorithms.StringAlgorithm;

public class MultiplicationAlgorithm implements StringAlgorithm<Void> {

    @Override
    public String algorithm() throws AlgorithmException {
        StringBuilder stringBuilder = new StringBuilder("\t|");
        preprocessor(stringBuilder);
        for (int i = 1; i < 10; i++) {
            head(stringBuilder, i);
            column(stringBuilder, i);
        }

        return stringBuilder.toString();
    }

    private void preprocessor(final StringBuilder stringBuilder) {
        for (int i = 1; i < 10; i++) {
            stringBuilder.append("\t")
                    .append(i);
        }
        stringBuilder.append("%n")
                .append("----+");
        for (int i = 0; i < 38; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("%n");
    }

    private void head(final StringBuilder stringBuilder, Object o) {
        stringBuilder.append(String.format(" %s  |", o));
    }

    private void column(final StringBuilder stringBuilder, int i) {
        for (int j = 1; j < 10; j++) {
            stringBuilder.append(String.format("\t%d", plus(i, j)));
        }
        stringBuilder.append("%n");
    }

    private long multiple(int a, int b) {
        return (long) a * b;
    }

    private long plus(int a, int b) {
        return (long) a + b;
    }

    public static void main(String[] args) throws AlgorithmException {
        MultiplicationAlgorithm algorithm = new MultiplicationAlgorithm();
        System.out.printf(algorithm.algorithm());
    }
}
