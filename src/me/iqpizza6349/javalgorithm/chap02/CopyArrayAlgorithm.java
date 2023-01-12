package me.iqpizza6349.javalgorithm.chap02;

import me.iqpizza6349.javalgorithm.algorithms.ArrayAlgorithm;

import java.util.Arrays;

public class CopyArrayAlgorithm implements ArrayAlgorithm<Integer> {

    @Override
    public void copy(Integer[] arr1, Integer[] arr2) {
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
    }

    @Override
    public void rcopy(Integer[] arr1, Integer[] arr2) {
        final int length = arr1.length - 1;
        for (int i = 0; i <= length; i++) {
            arr2[i] = arr1[length - i];
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 3, 22, 4590};
        Integer[] arr2 = new Integer[4];
        CopyArrayAlgorithm arrayAlgorithm = new CopyArrayAlgorithm();

        arrayAlgorithm.rcopy(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
//        System.out.println(arrayAlgorithm.arrayEquals(arr1, arr2));
    }



}
