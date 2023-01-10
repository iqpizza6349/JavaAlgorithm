package me.iqpizza6349.javalgorithm.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPracticeTest {

    private final MaxAlgorithm maxAlgorithm = new MaxPractice();

    @Test
    void max3Test() {
        assertEquals(maxAlgorithm.max3(3, 2, 1), 3);
        assertEquals(maxAlgorithm.max3(3, 2, 2), 3);
        assertEquals(maxAlgorithm.max3(3, 1, 2), 3);
        assertEquals(maxAlgorithm.max3(3, 2, 3), 3);
        assertEquals(maxAlgorithm.max3(2, 1, 3), 3);
        assertEquals(maxAlgorithm.max3(3, 3, 2), 3);
        assertEquals(maxAlgorithm.max3(3, 3, 3), 3);
        assertEquals(maxAlgorithm.max3(2, 2, 3), 3);
        assertEquals(maxAlgorithm.max3(2, 3, 1), 3);
        assertEquals(maxAlgorithm.max3(2, 3, 2), 3);
        assertEquals(maxAlgorithm.max3(1, 3, 2), 3);
        assertEquals(maxAlgorithm.max3(2, 3, 3), 3);
        assertEquals(maxAlgorithm.max3(1, 2, 3), 3);
    }

    @Test
    void max4Test() {
        assertEquals(maxAlgorithm.max4(1, 2, 3, 4), 4);
        assertEquals(maxAlgorithm.max4(1, 2, 3, 1), 3);
        assertEquals(maxAlgorithm.max4(6, 2, 3, 9), 9);
        assertEquals(maxAlgorithm.max4(0, 3, 56, 4), 56);
        assertEquals(maxAlgorithm.max4(-10, -2, 30, -4), 30);
        assertEquals(maxAlgorithm.max4(4, 4, 4, 4), 4);
        assertEquals(maxAlgorithm.max4(899, 100, 900, -400), 900);
        assertEquals(maxAlgorithm.max4(-17, -2, -3, -4), -2);
        assertEquals(maxAlgorithm.max4(100, 200, 30, 400), 400);
        assertEquals(maxAlgorithm.max4(5873, 1238, 124949, 38358), 124949);
        assertEquals(maxAlgorithm.max4(Integer.MAX_VALUE, 0, Integer.MIN_VALUE, 1), Integer.MAX_VALUE);
        assertEquals(maxAlgorithm.max4(-1, 20, -30, 404), 404);
        assertEquals(maxAlgorithm.max4(0, 0, 0, 0), 0);
    }

    @Test
    void min3Test() {
        assertEquals(maxAlgorithm.min3(3, 2, 1), 1);
        assertEquals(maxAlgorithm.min3(3, 2, 2), 2);
        assertEquals(maxAlgorithm.min3(3, 1, 2), 1);
        assertEquals(maxAlgorithm.min3(3, 2, 3), 2);
        assertEquals(maxAlgorithm.min3(2, 1, 3), 1);
        assertEquals(maxAlgorithm.min3(3, 3, 2), 2);
        assertEquals(maxAlgorithm.min3(3, 3, 3), 3);
        assertEquals(maxAlgorithm.min3(2, 2, 3), 2);
        assertEquals(maxAlgorithm.min3(2, 3, 1), 1);
        assertEquals(maxAlgorithm.min3(2, 3, 2), 2);
        assertEquals(maxAlgorithm.min3(1, 3, 2), 1);
        assertEquals(maxAlgorithm.min3(2, 3, 3), 2);
        assertEquals(maxAlgorithm.min3(1, 2, 3), 1);
    }

    @Test
    void min4Test() {
        assertEquals(maxAlgorithm.min4(1, 2, 3, 4), 1);
        assertEquals(maxAlgorithm.min4(1, 2, 3, 1), 1);
        assertEquals(maxAlgorithm.min4(6, 2, 3, 9), 2);
        assertEquals(maxAlgorithm.min4(0, 3, 56, 4), 0);
        assertEquals(maxAlgorithm.min4(-10, -2, 30, -4), -10);
        assertEquals(maxAlgorithm.min4(4, 4, 4, 4), 4);
        assertEquals(maxAlgorithm.min4(899, 100, 900, -400), -400);
        assertEquals(maxAlgorithm.min4(-17, -2, -3, -4), -17);
        assertEquals(maxAlgorithm.min4(100, 200, 30, 400), 30);
        assertEquals(maxAlgorithm.min4(5873, 1238, 124949, 38358), 1238);
        assertEquals(maxAlgorithm.min4(Integer.MAX_VALUE, 0, Integer.MIN_VALUE, 1), Integer.MIN_VALUE);
        assertEquals(maxAlgorithm.min4(-1, 20, -30, 404), -30);
        assertEquals(maxAlgorithm.min4(0, 0, 0, 0), 0);
    }
}