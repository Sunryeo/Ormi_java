package Java240613;

public abstract class Animal {
  protected String kind;

  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  public abstract void sound(); // 추상메서드
}
