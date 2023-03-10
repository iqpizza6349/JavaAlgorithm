package me.iqpizza6349.javalgorithm.algorithms;

public interface StringAlgorithm<T> {

    default String algorithm() throws AlgorithmException {
        throw new AlgorithmException();
    }

    default String algorithm(T t) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default String algorithm(String s) throws AlgorithmException {
        throw new AlgorithmException();
    }

}
