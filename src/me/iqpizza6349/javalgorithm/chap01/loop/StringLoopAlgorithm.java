package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.algorithms.StringAlgorithm;

public class StringLoopAlgorithm implements StringAlgorithm<Integer> {

    @Override
    public String algorithm(Integer integer) {
        final StringBuilder stringBuilder = new StringBuilder();
        int count = 1, sum = 0;
        while (count <= integer) {
            stringBuilder.append(count);
            if (count != integer) {
                stringBuilder.append(" + ");
            }
            else {
                stringBuilder.append(" = ");
            }
            sum += (count++);
        }

        return stringBuilder.append(sum)
                .toString();
    }

    public static void main(String[] args) {
        StringLoopAlgorithm loopAlgorithm = new StringLoopAlgorithm();
        System.out.println(loopAlgorithm.algorithm(7));
    }
}
