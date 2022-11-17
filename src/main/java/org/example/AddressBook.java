package org.example;

import java.util.Arrays;
import java.util.List;

public class AddressBook {
    public static void main(String[] args) {
        List<Contact> al = Arrays.asList(new Contact("eda", "raghunathreddy", "7658971120"), new Contact("eda", "raghunathreddy", "8341865099"));

        al.stream().filter(n -> n.firstName.equals("eda")).map(m -> m.phoneNumber).forEach(System.out::println);

    }
}
