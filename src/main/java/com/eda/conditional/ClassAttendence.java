package com.eda.conditional;

import java.util.Scanner;

public class ClassAttendence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("no of classes held");
        int x=sc.nextInt();
        System.out.println("no of classes attend");
        int y=sc.nextInt();
        float pf;
        pf=((y*100)/x);
        if(pf>=75)
            System.out.println(pf +"%"+"Class Attendence"+"The student will be allowed to sit" );
        else
            System.out.println(pf+"%"+"Class Attendence"+"The student will not be allowed to sit");
    }

}

