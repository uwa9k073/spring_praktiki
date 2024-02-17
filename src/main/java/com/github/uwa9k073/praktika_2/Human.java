package com.github.uwa9k073.praktika_2;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Human {
  int age;
  String firstName;
  String lastName;
  LocalDate birthDate;
  int weight;

}