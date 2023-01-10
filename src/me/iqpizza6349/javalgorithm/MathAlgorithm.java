package me.iqpizza6349.javalgorithm;

public interface MathAlgorithm<T extends Number> extends Algorithm<T> {

    default <S extends Number> T getMaxValue(S[] s) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default <S extends Number> T getMinValue(S[] s) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default <S extends Number> T getMedian(S[] s) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default T getSum(T a, T b) throws AlgorithmException {
        throw new AlgorithmException();
    }
}
