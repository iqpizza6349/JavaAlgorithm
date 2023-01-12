package me.iqpizza6349.javalgorithm.chap01.loop;

import me.iqpizza6349.javalgorithm.algorithms.MathAlgorithm;

import java.util.Scanner;

public class ConditionLoopAlgorithm implements MathAlgorithm<Integer> {

    @Override
    public Integer algorithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a의 값: ");
        final int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();
        while (a >= b) {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값: ");
            b = scanner.nextInt();
        }
        return b - a;
    }

    private void printf(int i) {
        System.out.printf("b - a는 %d입니다.%n", i);
    }

    public static void main(String[] args) {
        ConditionLoopAlgorithm loopAlgorithm = new ConditionLoopAlgorithm();
        loopAlgorithm.printf(loopAlgorithm.algorithm());
    }
}
