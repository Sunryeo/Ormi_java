package Java240619;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(5);

    Iterator<Integer> iterator = integerSet.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (int a : integerSet) {
      System.out.println(a);
    }

    Set<String> stringSet = new HashSet<>();

    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("JSP");
    stringSet.add("Java");
    stringSet.add("DBMS");

    System.out.println(stringSet.size());

    stringSet.remove("Java");

    Iterator<String> iterator2 = stringSet.iterator();
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
    //    stringSet.clear();

    if (stringSet.isEmpty()) {
      System.out.println("비었습니다.");
    } else {
      System.out.println("비지 않았습니다.");
    }

    Map<String, List<String>> map = new HashMap<>();
    Set<Map.Entry<String, List<String>>> entries = map.entrySet();

    for (Map.Entry<String, List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
    }

    // 모든 Map.Entry 삭제
    map.clear();
  }
}
