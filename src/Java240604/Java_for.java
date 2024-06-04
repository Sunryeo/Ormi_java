package Java240604;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Java_for {
  public static void main(String[] args) {
    for (int i = 0; i > -101; i--) {
      if (i % 2 == 0) {
//        System.out.println(i);
      }
    }

    long[] arr = new long[100];
    arr[0] = 1;
    arr[1] = 1;

    for(int i = 2; i < arr.length; i++) {
      arr[i] = arr[i-1] + arr[i-2];
      System.out.println(arr[i]);
    }



    Arrays.parallelSetAll(arr, i -> (i < 2)?1: arr[i-1] + arr[i-2]);
  }
}
