package Udemy;

import ArraysExercises.ArraysDummy;

public class RunMain {
    public static void main(String[] args) {

        ArraysDummy arrays = new ArraysDummy();

        int[] a = {1, 2, 4};
        int[] b = {4, 5, 6};

        //arrays.firstLast6((53;4));
        boolean result = arrays.commonEnd(a, b);
        System.out.println(result);
    }
}