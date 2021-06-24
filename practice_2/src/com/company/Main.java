package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>(); // создание списка из объектов класса Human
        Human max = new Human(18, "Макс", "Костин", LocalDate.of(2002, 12, 1), 71);
        Human andrey = new Human(19, "Андрей", "Троицкий", LocalDate.of(2001, 10, 10), 80);
        Human katya = new Human(21, "Екатерина", "Канадская", LocalDate.of(1999, 2, 5), 60);
        Human vladimir = new Human(90, "Владимир", "Владимирович", LocalDate.of(1952, 6, 7), 70);

        humanList.add(max); // добавление объектов
        humanList.add(andrey);
        humanList.add(katya);
        humanList.add(vladimir);

        System.out.println("===LAST LETTER SORT===");
        System.out.println(); // сравнение по последней букве имени
        Comparator<Human> letter = Comparator.comparing(h -> h.getFirstName().substring(h.getFirstName().length() -1));
        humanList.stream()
                .sorted(letter)
                .forEach(System.out::println); // вывод потока

        System.out.println();
        System.out.println("===AGE IS MORE THAN WEIGHT===");
        System.out.println(); // сравнение возраст больше веса
        humanList.stream()
                .filter(a -> a.getAge() > a.getWeight())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("===DATE OF BIRTH===");
        System.out.println(); // сравнение по дате рождения
        Comparator<Human> date = Comparator.comparing(Human::getBirthDate);
        humanList.stream()
                .sorted(date)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("===AGE SUM===");
        System.out.println(); // сумма всех возрастов
        Stream<Human> stream = humanList.stream();
        int ageSum; // переменная где будет лежать сумма возрастов
        ageSum = stream.mapToInt(Human::getAge).reduce(0, Integer::sum);
        System.out.println("Sum of all ages: "+ ageSum);

    }
}
