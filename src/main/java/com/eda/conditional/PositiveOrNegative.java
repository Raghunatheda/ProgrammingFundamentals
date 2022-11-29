package com.eda.conditional;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("input number:  ");
        num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
