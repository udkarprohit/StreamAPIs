package com.bridgelabz;

import java.util.*;

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

    }
}
