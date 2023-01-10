package me.iqpizza6349.javalgorithm.chap01;

import me.iqpizza6349.javalgorithm.Algorithm;

public interface MaxAlgorithm extends Algorithm {
    <T extends Number> T max3(T t, T t1, T t2);

    <T extends Number> T max4(T t, T t1, T t2, T t3);

    <T extends Number> T min3(T t, T t1, T t2);

    <T extends Number> T min4(T t, T t1, T t2, T t3);

}
