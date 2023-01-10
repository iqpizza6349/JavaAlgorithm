package me.iqpizza6349.javalgorithm;

public interface Algorithm {

    default <T> T algorithm() throws AlgorithmException {
        throw new AlgorithmException();
    }

    default <T> T algorithm(T... t) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default <S, T> T algorithm(T t, S s) throws AlgorithmException {
        throw new AlgorithmException();
    }

}
