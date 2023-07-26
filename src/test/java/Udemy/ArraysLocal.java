package Udemy;

import java.util.Arrays;
import java.util.Random;

public class ArraysLocal {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];

        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);
        System.out.println(myIntArray.length);

        // array initializer

        int[] firstFivePositive = new int[]{1, 2, 3, 4, 5};
        int[] secoundPositive = {1, 2, 3, 4, 5};
        System.out.println("first element of array is: " + firstFivePositive[0]);
        System.out.println("length of array is: " + firstFivePositive.length);
        int count = firstFivePositive[firstFivePositive.length - 1];
        System.out.println(("last element of array is: " + count));

        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }

        System.out.println(" ");

        int[] myNewArray;
        myNewArray = new int[5];
//        for (int i = 0; i < myNewArray.length; i++) {
//            System.out.print(myNewArray[i] + " ");
//
//            System.out.println(" ");
//
//        }
        for (int i = 0; i < myNewArray.length; i++) {
            myNewArray[i] = myNewArray.length - i;
            //System.out.print(myNewArray[i] + " ");
        }


        /**
         * for-each
         * for ( declaration : collection ) { }
         * declaration - var de tipul array ului
         * collection - arrayul sau alta variabila de 'colectie'
         * for normal
         * for ( init ; expression ; increment ) { }
         */

        System.out.println("from for each: ");

        for (int i : myNewArray) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
        System.out.println(java.util.Arrays.toString(myNewArray));

        Object objectVar = newArray;
        if (objectVar instanceof int[]) {
            System.out.println("obj is relly an int array");
        }
        Object[] objectsArray = new Object[3];
        objectsArray[0] = "hello";
        objectsArray[1] = new StringBuilder("World");
        objectsArray[2] = newArray;
        System.out.println(objectsArray);

        // ------- Sort / Fill / CopyOf -------


        int[] methodArray = getRandmArray(10);
        System.out.println(java.util.Arrays.toString(methodArray) + "-------------");
        java.util.Arrays.sort(methodArray);
        System.out.println(java.util.Arrays.toString(methodArray) + "-------------");

        int[] fillArray = new int[10];
        System.out.println(java.util.Arrays.toString(fillArray));
        java.util.Arrays.fill(fillArray, 5);
        System.out.println(java.util.Arrays.toString(fillArray));

        int[] thirdArrya = getRandmArray(10);
        System.out.println(java.util.Arrays.toString(thirdArrya));

        int[] forthArray = java.util.Arrays.copyOf(thirdArrya, thirdArrya.length);
        System.out.println(java.util.Arrays.toString(forthArray));
        Arrays.sort(forthArray);
        System.out.println(java.util.Arrays.toString(forthArray));
        System.out.println(java.util.Arrays.toString(thirdArrya));

        int[] smallArray = java.util.Arrays.copyOf(thirdArrya, 5);
        System.out.println(java.util.Arrays.toString(smallArray));

        int[] largeArray = java.util.Arrays.copyOf(thirdArrya, 15);
        System.out.println(java.util.Arrays.toString(largeArray));

        String[] stringArray = {"M", "B", "L", "N", "A", "C", "F", "E", "D"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        if (Arrays.binarySearch(stringArray, "A") >= 0) {
            System.out.println("A was found!");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("arrays are equals");
        } else {
            System.out.println("arrays are not equals");
        }

        int[] arr = {106, 26, 81, 5, 15};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.println(arr[i] + "aici ---------");
        }


    }


    private static int[] getRandmArray(int len) {

        Random randm = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = randm.nextInt(100);
        }
        return newInt;
    }

    public String lastChars(String a, String b) {


        if (a.length() == 0 && b.length() == 0) {
            return "@" + "@";

        } else if (a.length() == 0) {
            return "@" + b.charAt(b.length() - 1);
        } else if (b.length() == 0) {
            return a.substring(0) + "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String seeColor(String str) {
        if (str.length() == 3 && str == "red") {
            return str;
        } else if (str.length() == 4 && str == "blue") {
            return str;
        } else if (str.length() > 4 && str.substring(0, 4) == "red") {
            return str.substring(0, 4);
        } else if (str.length() > 5 && str.substring(0, 5) == "blue") {
            return str.substring(0, 5);
        } else if (str.length() > 4 && str.substring(0, 4) != "red" || str.length() > 5 && str.substring(0, 5) == "blue") {
            return " ";
        }
        return " ";

    }


}