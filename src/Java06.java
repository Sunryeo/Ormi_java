public class Java06 {
  public static void main(String[] args) {
    int a = 10;

    String firstName = "sunryeo";
    String lastName = "moon";

    System.out.println(firstName == lastName);

    String c = "hello";
    String d = new String("hello");

    System.out.println(c.indexOf("h"));

    System.out.println(c.equals(d));
    System.out.println(c == d);
  }
}
