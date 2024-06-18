package Java240614;

public class Division {

  public int divide(int a, int b) throws ArithmeticException{

    if (b == 0) {
      throw new ArithmeticException("0으로 나눌 수 없습니다.");
    }

    return a / b;
  }
}
