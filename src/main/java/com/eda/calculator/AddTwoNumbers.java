package com.eda.calculator;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int sum = 0;
        System.out.println("Hello,This is my sample calculator to add two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        numberOne = sc.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = sc.nextInt();
        sum = numberOne + numberTwo;
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + sum);
    }
}
