package Java240605;

import java.util.*;

public class Scanner2 {
  public static void main(String[] args) {
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();

// 해쉬맵 버전 풀이
//    Set<Integer> set = new HashSet<>();
//
//    while(set.size()!=6){
//      int number = random.nextInt(45) + 1;
//      set.add(number);
//    }

    int num;
    while (list.size() < 6) {
      num = random.nextInt(45) + 1;
      if (!list.contains(num)) {
        list.add(num);
        int num2 = list.get(1);
      }
    }
    Collections.sort(list);
    System.out.print("로또 번호: ");
    for (int el: list) {
      System.out.print(el + " ");
    }
  }
}
