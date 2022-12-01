package streams;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String [] args){

        String[] arr = {"anne","mathew","kate","stephen"};

        long val= Arrays.stream(arr)
                .filter(n -> n.length() > 5)
                .count();


        System.out.println(val);
    }

}
