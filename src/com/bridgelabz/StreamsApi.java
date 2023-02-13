package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

//We Use StreamAPI To perform operation on collections more efficiently with reduced code
public class StreamsApi {

    public static void main(String[] args) {
//        Java Streams can be visualized as streaming/sequencing of data from a Source. A stream is
//        not a data structure and does not store elements.
//        Consumer<Integer> consumer = var -> System.out.println(var);
//        consumer.accept(6);
//        Function<Integer,Integer> ref2 = x -> x*100;
//        System.out.println(ref2.apply(7));

        List<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(30);
        list.add(38);
        list.add(55);
        list.add(88);
        //forEach method is used to iterate through each element of the stream and print it to the console.
        list.stream().forEach(num -> System.out.print(num + " , "));

        System.out.println();
        List<Double> result = list.stream().map(num -> num * 2.0).toList();
        System.out.println("Double : " + result);
        //Store the Transformed double value into a new List
        List<Double> doubleNumber = list.stream().map(num -> num * 2.0).collect(ArrayList::new, (list1,number) -> list1.add(number) , (list2,list3) -> list2.addAll(list3));
        System.out.println("Another List : " + doubleNumber);
        //Filter the even numbers from then umber Stream and store the result
        List<Integer> evenNumber = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers : " + evenNumber);
        //First Even Number
        Optional<Integer> firstEvenNumber = list.stream().filter(num -> num % 2 == 0).findFirst();
        if (firstEvenNumber.isPresent()) {
            System.out.println("First even number: " + firstEvenNumber.get());
        } else {
            System.out.println("No even numbers found.");
        }
    }
}
