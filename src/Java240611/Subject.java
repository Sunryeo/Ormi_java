package Java240611;

public class Subject {
  String subjectName;
  int level;

  public Subject(String subjectName, int level) {
    this.subjectName = subjectName;
    if (level >= 0) {
      this.level = level;
    }
  }

  public void levelUp() {
    level++;
    System.out.println(String.format("%s 과목의 레벨이 1 상승하였습니다.", subjectName));
  }

  public void levelDoubleUp() {
    level *= 2;
    System.out.println(String.format("%s 과목의 레벨이 2배 상승하였습니다.", subjectName));
  }
}
