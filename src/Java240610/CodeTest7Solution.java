package Java240610;

public class CodeTest7Solution {
  public static int sumUnique(int a, int b, int c) {
    //        3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
    //        하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
    //        기본적으로 중복되지 않는 숫자만 합산합니다.
    if (a == b && b == c) return 0;
    if (a == b) return c;
    if (a == c) return b;
    if (b == c) return a;
    return a + b + c;
  }
}
