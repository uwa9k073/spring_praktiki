package com.github.uwa9k073.praktika_1;

import java.util.Arrays;
import java.util.function.Function;

public class SmallestUniqueNumber implements Function<int[], String> {
  @Override
  public String apply(int[] numbers){
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Input array cannot be null or empty");
    }

    // Create an array to keep track of the number of times each digit appears in the input
    int[] count = new int[10];

    // Count the occurrences of each digit in the input
    for (int number : numbers) {
      if (number < 0 || number > 9) {
        throw new IllegalArgumentException("Each number in the input array must be a value from 0 to 9");
      }
      count[number]++;
    }

    // Build the smallest unique number by traversing the count array
    StringBuilder result = new StringBuilder();
    for (int i = 1; i < 10; i++) {
      if(count[i]!=0) {
        result.append(i);
      }
    }

    return result.toString();
  }


  public static void main(String[] args) {
    var function = new SmallestUniqueNumber();

    int[] numbers = {1,3,1};
    System.out.println("Array: " + Arrays.toString(numbers));
    System.out.println(function.apply(numbers));
  }

}
