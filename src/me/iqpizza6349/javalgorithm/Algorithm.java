package me.iqpizza6349.javalgorithm;

public interface Algorithm<T> {

    default T algorithm() throws AlgorithmException {
        throw new AlgorithmException();
    }

    default T algorithm(T t) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default T algorithm(T[] ts) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default <S> T algorithm(T t, S s) throws AlgorithmException {
        throw new AlgorithmException();
    }

}
