package Java240604;

import java.util.stream.IntStream;

public class Java_while {
  public static void main(String[] args) {
    int n = 1;
    int sum = 0;
    while (n <= 100) {
      sum += n;
      n++;
    }
    System.out.println("sum: " + sum);

    sum = IntStream.rangeClosed(1, 100).sum(); // java 8버전 이후부터 생김

    int[] numbers = {5,2,9,1,7,4,6,3,8};
    int i = 0;
    int sum2 = 0;
    int average;
    while (i < numbers.length) {
      sum2 += numbers[i];
      i++;
    }
    average = sum2 / numbers.length;
    System.out.println("average: " + average);
  }
}
