package Java240605;

import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    String[] arr = new String[2];
    arr[0] = "A";
    arr[1] = "B";
    //        arr[2] = "C"; // 에러 발생

    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);

    int value1 = al.get(0);
    int value2 = al.get(1);

    System.out.println(value1); // 1
    System.out.println(value2); // 2
  }
}
