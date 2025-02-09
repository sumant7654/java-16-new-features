package dev.sumantakumar.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToListMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Swastik");
        list.add("Shadab");
        list.add("Nitish");
        list.add("Sumanta");


        // Before java 16 we used Collectors.toList();
        List<String> names = list.stream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(names);


        System.out.println("########");

        // Java 16 onwards we can use toList() directly;
        List<String> startsWithS = list.stream()
                .filter(name -> name.startsWith("S"))
                .toList();

        System.out.println(startsWithS);


    }
}
