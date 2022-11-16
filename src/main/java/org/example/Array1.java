package org.example;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int [] arr1 = new int[4];

        for(int i=0;i<arr1.length;i++) {
            arr1[i] = i;
        }
        System.out.println(Arrays.toString(arr1));
    }

}


