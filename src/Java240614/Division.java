package Java240614;

public class Division {

  public int divide(int a, int b) throws CannotDivideException {

    if (b == 0) {
      throw new ArithmeticException("0으로 나눌 수 없습니다.");
    }

    if (b == 1) {
      throw new CannotDivideException("1로 나눌 수 없습니다.");
    }

    return a / b;
  }
}
