package test;


import java.util.Arrays;
import java.util.List;

public class PrintArray {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> stringList = Arrays.asList("one", "two", "three");

        numList.forEach(System.out::println);

        System.out.println("------------");

        numList.forEach(i -> System.out.println(i));


        System.out.println("=============");

        stringList.stream().map(item -> item.toUpperCase()).forEach(System.out::println);

        System.out.println("------------");

        stringList.stream().map(String::toUpperCase).forEach(System.out::println);

    }


}
