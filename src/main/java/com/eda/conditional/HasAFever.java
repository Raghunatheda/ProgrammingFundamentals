package com.eda.conditional;

import java.util.Scanner;

public class HasAFever {
    public static void main(String[] args){
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your temperature:  ");
        temp = sc.nextInt();
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
    }
}
