package me.iqpizza6349.javalgorithm.algorithms;

import java.io.Serializable;

public class AlgorithmException extends Exception implements Serializable {
    private static final long serialVersionUID = 7334307427242175751L;

    public AlgorithmException() {
        super("A method not implemented in the implementation was called.");
    }
}
