package com.eda.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[]args){
        int numberOne;
        int numberTwo;

        Scanner st = new Scanner(System.in);
        System.out.println("Input 1st integer");
        numberOne = st.nextInt();
        System.out.println("Input 2nd integer");
        numberTwo = st.nextInt();

         int sum = numberOne + numberTwo;
         System.out.println("Sum of two integers: "+sum+" ");
         int diff =  numberOne - numberTwo;
         if (diff<0) {
             diff = numberTwo - numberOne;
         }
         System.out.println("Difference between two integers: "+diff+" ");
         int product = numberOne * numberTwo;
         System.out.println("Product of two integers : "+product+" ");
         int avg = sum/2;
         System.out.println("Average of two integers: "+avg+" ");
         int distance = Math.abs(numberOne - numberTwo);
         System.out.println("The Distance : "+distance+" ");
         int max = Math.max(numberOne ,numberTwo);
         System.out.println("The Maximum : "+max+" ");
         int min = Math.min(numberOne ,numberTwo);
         System.out.println("The Minimum : "+min+" ");

    }
}
