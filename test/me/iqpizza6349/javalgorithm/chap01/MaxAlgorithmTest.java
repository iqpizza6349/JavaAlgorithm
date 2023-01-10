package me.iqpizza6349.javalgorithm.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAlgorithmTest {

    private final MaxAlgorithm maxAlgorithm = new MaxAlgorithm();

    @Test
    void max3Test() {
        assertEquals(maxAlgorithm.getMaxValue(3, 2, 1), 3);
        assertEquals(maxAlgorithm.getMaxValue(3, 2, 2), 3);
        assertEquals(maxAlgorithm.getMaxValue(3, 1, 2), 3);
        assertEquals(maxAlgorithm.getMaxValue(3, 2, 3), 3);
        assertEquals(maxAlgorithm.getMaxValue(2, 1, 3), 3);
        assertEquals(maxAlgorithm.getMaxValue(3, 3, 2), 3);
        assertEquals(maxAlgorithm.getMaxValue(3, 3, 3), 3);
        assertEquals(maxAlgorithm.getMaxValue(2, 2, 3), 3);
        assertEquals(maxAlgorithm.getMaxValue(2, 3, 1), 3);
        assertEquals(maxAlgorithm.getMaxValue(2, 3, 2), 3);
        assertEquals(maxAlgorithm.getMaxValue(1, 3, 2), 3);
        assertEquals(maxAlgorithm.getMaxValue(2, 3, 3), 3);
        assertEquals(maxAlgorithm.getMaxValue(1, 2, 3), 3);
    }

    @Test
    void max4Test() {
        assertEquals(maxAlgorithm.getMaxValue(1, 2, 3, 4), 4);
        assertEquals(maxAlgorithm.getMaxValue(1, 2, 3, 1), 3);
        assertEquals(maxAlgorithm.getMaxValue(6, 2, 3, 9), 9);
        assertEquals(maxAlgorithm.getMaxValue(0, 3, 56, 4), 56);
        assertEquals(maxAlgorithm.getMaxValue(-10, -2, 30, -4), 30);
        assertEquals(maxAlgorithm.getMaxValue(4, 4, 4, 4), 4);
        assertEquals(maxAlgorithm.getMaxValue(899, 100, 900, -400), 900);
        assertEquals(maxAlgorithm.getMaxValue(-17, -2, -3, -4), -2);
        assertEquals(maxAlgorithm.getMaxValue(100, 200, 30, 400), 400);
        assertEquals(maxAlgorithm.getMaxValue(5873, 1238, 124949, 38358), 124949);
        assertEquals(maxAlgorithm.getMaxValue(Integer.MAX_VALUE, 0, Integer.MIN_VALUE, 1), Integer.MAX_VALUE);
        assertEquals(maxAlgorithm.getMaxValue(-1, 20, -30, 404), 404);
        assertEquals(maxAlgorithm.getMaxValue(0, 0, 0, 0), 0);
    }

    @Test
    void min3Test() {
        assertEquals(maxAlgorithm.getMinValue(3, 2, 1), 1);
        assertEquals(maxAlgorithm.getMinValue(3, 2, 2), 2);
        assertEquals(maxAlgorithm.getMinValue(3, 1, 2), 1);
        assertEquals(maxAlgorithm.getMinValue(3, 2, 3), 2);
        assertEquals(maxAlgorithm.getMinValue(2, 1, 3), 1);
        assertEquals(maxAlgorithm.getMinValue(3, 3, 2), 2);
        assertEquals(maxAlgorithm.getMinValue(3, 3, 3), 3);
        assertEquals(maxAlgorithm.getMinValue(2, 2, 3), 2);
        assertEquals(maxAlgorithm.getMinValue(2, 3, 1), 1);
        assertEquals(maxAlgorithm.getMinValue(2, 3, 2), 2);
        assertEquals(maxAlgorithm.getMinValue(1, 3, 2), 1);
        assertEquals(maxAlgorithm.getMinValue(2, 3, 3), 2);
        assertEquals(maxAlgorithm.getMinValue(1, 2, 3), 1);
    }

    @Test
    void min4Test() {
        assertEquals(maxAlgorithm.getMinValue(1, 2, 3, 4), 1);
        assertEquals(maxAlgorithm.getMinValue(1, 2, 3, 1), 1);
        assertEquals(maxAlgorithm.getMinValue(6, 2, 3, 9), 2);
        assertEquals(maxAlgorithm.getMinValue(0, 3, 56, 4), 0);
        assertEquals(maxAlgorithm.getMinValue(-10, -2, 30, -4), -10);
        assertEquals(maxAlgorithm.getMinValue(4, 4, 4, 4), 4);
        assertEquals(maxAlgorithm.getMinValue(899, 100, 900, -400), -400);
        assertEquals(maxAlgorithm.getMinValue(-17, -2, -3, -4), -17);
        assertEquals(maxAlgorithm.getMinValue(100, 200, 30, 400), 30);
        assertEquals(maxAlgorithm.getMinValue(5873, 1238, 124949, 38358), 1238);
        assertEquals(maxAlgorithm.getMinValue(Integer.MAX_VALUE, 0, Integer.MIN_VALUE, 1), Integer.MIN_VALUE);
        assertEquals(maxAlgorithm.getMinValue(-1, 20, -30, 404), -30);
        assertEquals(maxAlgorithm.getMinValue(0, 0, 0, 0), 0);
    }
}