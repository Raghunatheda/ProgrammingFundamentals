package com.eda.conditional;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.println("enter student score:  ");
        score = sc.nextInt();
        if(score<25){
            System.out.println("your grade is a F");
        } else if (score>=25 && score<45) {
            System.out.println("your grade is a E");
        } else if (score>=45 && score<50) {
            System.out.println("your grade is a D");
        } else if (score>=50 && score<60) {
            System.out.println("your score is a C");
        } else if (score>=60 && score<=80) {
            System.out.println("Your grade is a B");
        } else if (score>80) {
            System.out.println("your grade is a A");
        }

    }
}
