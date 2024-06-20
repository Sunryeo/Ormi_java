package Java240620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));
    Thread thread3 = new Thread(new MyRunnable(3));
    Thread thread4 = new Thread(new MyRunnable(4));
    Thread thread5 = new Thread(new MyRunnable(5));

    thread1.start();
    thread2.start();
    thread3.start();
    Thread.sleep(3000);
    thread4.start();
    thread5.start();

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    callList(list);

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 5, 6));
    Iterator<Integer> iterator = numbers.iterator();

    // 람다식
    numbers.removeIf(el -> el % 2 == 0);
    System.out.println(numbers);

    numbers.stream().filter(el -> el % 2 == 0).forEach(el -> System.out.println(el));

    List<Integer> collect = numbers.stream().map(el -> el * 2).collect(Collectors.toList());

    numbers.stream().sorted().forEach(el -> System.out.println(el));

    while (iterator.hasNext()) {
      Integer next = iterator.next();
      if (next % 2 == 0) {
        iterator.remove();
      }
    }
  }

  public static void callList(List<Integer> integerList) {
    for (int i : integerList) {
      System.out.println(i);
    }
  }
}
