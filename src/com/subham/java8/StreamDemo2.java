package com.subham.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<String> listOfname = new ArrayList<>();
        listOfname.add("subham");
        listOfname.add("Rahul");
        listOfname.add("Tjens");
        listOfname.add("DemoPrya");

        List<String> result = listOfname.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
