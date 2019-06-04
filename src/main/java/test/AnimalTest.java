package test;

import entity.Animal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal0 = new Animal("Dog", 1);
        Animal animal1 = new Animal("Cat", 1);
        Animal animal2 = new Animal("Person", 2);
        List<Animal> animals = Arrays.asList(animal0, animal1, animal2);

        List<Animal> list = animals.stream().filter((animal) -> animal.getNum() > 0).collect(Collectors.toList());

        //打印结果 1 1 2
        list.forEach(i -> System.out.println(i.getNum()));


    }

    public static List<Animal> getByAgeByfunction(int num,
                                                  List<Animal> animals,
                                                  BiFunction<Integer, List<Animal>, List<Animal>> biFunction) {
        return biFunction.apply(num, animals);
    }
}
