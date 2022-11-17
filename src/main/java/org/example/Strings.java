package org.example;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("enter a string1: ");
        String str1 = st.next();
        System.out.println("enter a string2: ");
        String str2 = st.next();
        if(str1.equals(str2)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }


    }
}
