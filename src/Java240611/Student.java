package Java240611;

public class Student {
  int level;

  public Student() {
    this.level = 1;
  }

  public void levelUp() {
    level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println("현재 레벨은 = " + level + "입니다.");
  }

  public void levelDown(){
    if(level > 1) {
      level--;
    }

    System.out.println("레벨이 1감소 했습니다.");
    System.out.println("현재 레벨은 = " + level + "입니다.");
  }
}
