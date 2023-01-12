package me.iqpizza6349.javalgorithm.algorithms;

public interface ArrayAlgorithm<T> extends Algorithm<T[]> {

    default void copy(T[] arr1, T[] arr2) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default void rcopy(T[] arr1, T[] arr2) throws AlgorithmException {
        throw new AlgorithmException();
    }

    default boolean arrayEquals(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

}
