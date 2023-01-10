package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.Algorithm;
import me.iqpizza6349.javalgorithm.AlgorithmException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MedianAlgorithm implements Algorithm {

    private final int a;
    private final int b;
    private final int c;

    public MedianAlgorithm() {
        this(true);
    }

    public MedianAlgorithm(boolean input) {
        int a = 0, b = 0, c = 0;
        if (input) {
            try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                a = Integer.parseInt(reader.readLine());
                b = Integer.parseInt(reader.readLine());
                c = Integer.parseInt(reader.readLine());
            } catch (IOException ignored) {}
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int median() throws AlgorithmException {
        return algorithm();
    }

    public int median(Integer... arguments) throws AlgorithmException {
        return algorithm(arguments);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T algorithm() throws AlgorithmException {
        Integer[] ints = new Integer[3];
        ints[0] = a;
        ints[1] = b;
        ints[2] = c;

        return algorithm((T[]) ints);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T algorithm(T[] ts) throws AlgorithmException {
        if (!(ts instanceof Integer[])) {
            throw new IllegalArgumentException();
        }

        Integer[] integers = (Integer[]) ts.clone();
        final int a = integers[0], b = integers[1], c = integers[2];

        if (a >= b) {
            if (b >= c) {
                return (T) new Integer(b);
            }
            return (T) new Integer(Math.min(a, c));
        }
        else if (a > c) {
            return (T) new Integer(a);
        }

        return (T) new Integer(Math.min(b, c));
    }

    public static void main(String[] args) throws AlgorithmException {
        MedianAlgorithm medianAlgorithm = new MedianAlgorithm();
        System.out.println(medianAlgorithm.median());
    }
}
