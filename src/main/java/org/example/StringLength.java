package org.example;

public class StringLength {
    public static void main(String[]args){

        String[]ab1={"cat", "dog", "lion", "tiger"};
        String[] ab2={"word", "count", "diamond", "blue", "green"} ;
        String[] ab3= {"board", "jack", "java", "oop", "spring"};

        String  longestString=getLongestString(ab3);
        System.out.println("String longest ::" +longestString);

    }

    public static String getLongestString(String[] array) {
        int maxLength= 0;
        String longestString=null;
        for(String s: array){
            if(s.length() > maxLength){
                maxLength=s.length();
                longestString=s;
            }
        }
        return longestString;
    }




}
