public class Java07 {
  public static void main(String[] args) {
    String a = "ESTSOFT";
    System.out.println(a.contains("SOFT"));

    String findChar = "What is your hobby";
    System.out.println("result: " + findChar.charAt(5));
    System.out.println(findChar.replaceAll("hobby", "job"));

    String b = "WEEEE ASKE ;ND";
    System.out.println(b.substring(0,3) + b.substring(8,10) + b.substring(12));

    String c = "a:b:c:d";
    String[] split = a.split(":");
    c.concat("!");
  }
}
