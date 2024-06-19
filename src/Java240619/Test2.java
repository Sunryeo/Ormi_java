package Java240619;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
  public static void main(String[] args) {
    Map<Student, Integer> map = new HashMap<>();

    map.put(new Student(1, "김기범"), 95);
    map.put(new Student(2, "김건우"), 90);

    Set<Map.Entry<Student, Integer>> entries = map.entrySet();

    for (Map.Entry<Student, Integer> entry : entries) {
      Student key = entry.getKey();
      int value = entry.getValue();

      System.out.println("key: " + key.getName());
      System.out.println("value: " + value);
    }
  }
}
