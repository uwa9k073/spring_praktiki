package com.github.uwa9k073.praktika_2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Human> humanList = Arrays.asList(
        new Human(19, "John", "Doe", LocalDate.of(2005, 1, 1), 60),
        new Human(21, "Arthur", "Morgan", LocalDate.of(2003, 1, 1), 70),
        new Human(23, "Micah", "Bell", LocalDate.of(2001, 1, 1), 80),
        new Human(25, "Bill", "Williamson", LocalDate.of(1999, 1, 1), 90));

    List<Human> humans = null;

    humans = humanList.stream().sorted(Comparator.comparing(Human::getFirstName)).collect(
        Collectors.toList());
    System.out.println("Сортировка по имени:");
    humans.forEach(System.out::println);

    humans = humanList.stream().sorted(Comparator.comparing(Human::getLastName)).collect(
        Collectors.toList());
    System.out.println("Сортировка по фамилии:");
    humans.forEach(System.out::println);

    humans = humanList.stream()
        .filter(human -> human.getBirthDate().isBefore(LocalDate.of(2000, 6, 24)))
        .collect(Collectors.toList());
    System.out.println("Фильтрация по дате рождения:");
    humans.forEach(System.out::println);


    int sumOfAges = humanList.stream()
        .mapToInt(Human::getAge)
        .sum();

    System.out.println("\nСумма всех возрастов: " + sumOfAges);

  }
}
