package streams;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[]args){

        String[] arr = {"anne","mathew","kate","stephen"};
        List<String> newArr = Arrays.stream(arr)
                .filter(n -> n.length() > 5).sorted()
                .collect(Collectors.toList());
        newArr.forEach(System.out::println);
        System.out.println(newArr);


    }


}
