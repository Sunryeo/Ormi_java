package Java240603;

public class Java01 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 3;

    int sum = num1 + num2;
    int diff1 = num2 - num1;
    int diff2 = num1 - num2;

    int product = num1 * num2;
    int quot = num1 / num2;
    int remainder = num1 % num2;

    System.out.println("덧셈 " + sum);
    System.out.println("뺄셈1 " + diff1);
    System.out.println("뺄셈2 " + diff2);
    System.out.println("곱셈 " + product);
    System.out.println("나눗셈 " + quot);
    System.out.println("나머지 " + remainder);

    System.out.println(num1 < num2);
    System.out.println(num1 <= num2);
    System.out.println(num1 > num2);
    System.out.println(num1 >= num2);
  }
}
