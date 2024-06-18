package Java240618;

public class Test {
  public static void main(String[] args) {
    System.out.println(compare(1, 2));
    compareString("apple", "apple");
  }

  public static <T extends Number> int compare(T t1, T t2) {
    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();
    return Double.compare(v1, v2);
  }

  public static <T extends String> void compareString(T t1, T t2){
    if(t1.equals(t2)) {
      System.out.println("ok");
    } else System.out.println("no");
  }
}
