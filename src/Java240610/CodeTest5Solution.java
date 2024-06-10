package Java240610;

public class CodeTest5Solution {
  public static boolean isCool(int n) {
    if (n >= 0) {
      return n % 11 == 0 || n % 11 == 1;
    }
    return false;
  }
}
