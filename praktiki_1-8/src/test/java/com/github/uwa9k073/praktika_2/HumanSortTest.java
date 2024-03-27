package com.github.uwa9k073.praktika_2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HumanSortTest {

  private List<Human> humanList = Arrays.asList(
      new Human(19, "John", "Doe", LocalDate.of(2005, 1, 1), 60),
      new Human(21, "Arthur", "Morgan", LocalDate.of(2003, 1, 1), 70),
      new Human(23, "Micah", "Bell", LocalDate.of(2001, 1, 1), 80),
      new Human(25, "Bill", "Williamson", LocalDate.of(1999, 1, 1), 90));

  private List<Human> humanListSortedByFirstName = Arrays.asList(
      new Human(21, "Arthur", "Morgan", LocalDate.of(2003, 1, 1), 70),
      new Human(25, "Bill", "Williamson", LocalDate.of(1999, 1, 1), 90),
      new Human(19, "John", "Doe", LocalDate.of(2005, 1, 1), 60),
      new Human(23, "Micah", "Bell", LocalDate.of(2001, 1, 1), 80));


  private List<Human> humanListSortedByLastName = Arrays.asList(
      new Human(23, "Micah", "Bell", LocalDate.of(2001, 1, 1), 80),
      new Human(19, "John", "Doe", LocalDate.of(2005, 1, 1), 60),
      new Human(21, "Arthur", "Morgan", LocalDate.of(2003, 1, 1), 70),
      new Human(25, "Bill", "Williamson", LocalDate.of(1999, 1, 1), 90));

  private List<Human> humansFilteredByDate = Arrays.asList(
      new Human(25, "Bill", "Williamson", LocalDate.of(1999, 1, 1), 90));


  @Test
  void TEST_SORT_BY_FIRST_NAME() {
    var humans = humanList.stream().sorted(Comparator.comparing(Human::getFirstName)).collect(
        Collectors.toList());

    Assertions.assertIterableEquals(humanListSortedByFirstName, humans, "List dont equals");
  }

  @Test
  void TEST_SORT_BY_LAST_NAME() {
    var humans = humanList.stream().sorted(Comparator.comparing(Human::getLastName)).collect(
        Collectors.toList());

    Assertions.assertIterableEquals(humanListSortedByLastName, humans, "List dont equals");

  }

  @Test
  void TEST_FILTER_BY_DATE() {
    var humans = humanList.stream()
        .filter(human -> human.getBirthDate().isBefore(LocalDate.of(2000, 6, 24)))
        .collect(Collectors.toList());

    Assertions.assertIterableEquals(humansFilteredByDate, humans);
  }

  @Test
  void TEST_AGES_SUM() {
    var sumOfAges = humanList.stream().mapToInt(Human::getAge).sum();

    Assertions.assertEquals(19+21+23+25, sumOfAges);
  }

}