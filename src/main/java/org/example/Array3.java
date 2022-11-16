package org.example;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = new int[7];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 2;
            arr1[1] = 23;
            System.out.println(arr1[i]);
        }
    }
}
