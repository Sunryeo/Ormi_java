package Java240607;

public class CodeTest {
  public static void main(String[] args) {
    test1("Monitor");
  }

  public static String test1(String str) {
    int startIdx;
    int endIdx;
    int length = str.length();
    String result = "";

    if (length <= 3) {
      result = str;
    } else {
      startIdx = length / 2 - 1;
      endIdx = length / 2 + 2;
      result = str.substring(startIdx, endIdx);

      System.out.println("result: " + result);
    }

    return result;
  }
}
