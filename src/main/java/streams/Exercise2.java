package streams;

import java.util.stream.IntStream;

public class Exercise2 {
    public static void main(String[] args) {

        int[] array = {2,9,7,4,12,6};

        long Integer = IntStream.of(array)
                .filter(num -> num % 2 == 0  )
                .mapToLong(i -> i*2)
                .sum();


        System.out.println("The even numbers multiply with 2: " + Integer);
    }

}
