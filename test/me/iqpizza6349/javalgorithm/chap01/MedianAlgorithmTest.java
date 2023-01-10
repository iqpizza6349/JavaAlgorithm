package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.AlgorithmException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianAlgorithmTest {

    MedianAlgorithm medianAlgorithm = new MedianAlgorithm(false);

    @Test
    void findMedianTest() throws AlgorithmException {
        assertEquals(medianAlgorithm.median(3, 2, 1), 2);
        assertEquals(medianAlgorithm.median(3, 2, 2), 2);
        assertEquals(medianAlgorithm.median(3, 1, 2), 2);
        assertEquals(medianAlgorithm.median(3, 2, 3), 3);
        assertEquals(medianAlgorithm.median(2, 1, 3), 2);
        assertEquals(medianAlgorithm.median(3, 3, 2), 3);
        assertEquals(medianAlgorithm.median(3, 3, 3), 3);
        assertEquals(medianAlgorithm.median(2, 2, 3), 2);
        assertEquals(medianAlgorithm.median(2, 3, 1), 2);
        assertEquals(medianAlgorithm.median(2, 3, 2), 2);
        assertEquals(medianAlgorithm.median(1, 3, 2), 2);
        assertEquals(medianAlgorithm.median(2, 3, 3), 3);
        assertEquals(medianAlgorithm.median(1, 2, 3), 2);
    }
}