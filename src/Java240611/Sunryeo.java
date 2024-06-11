package Java240611;

public class Sunryeo {
  String firstName = "순려";
  String lastName = "문";
  String gender = "여자";
  int age = 320;
  int workingExperience = 1;

  // 생성자
  public Sunryeo() {}

  public void introduce() {
    System.out.println(
        String.format("나는 %s%s이고 %s이며, 나이는 %s세 이다.", lastName, firstName, gender, age));
  }

  public void study(Subject subject) {
    subject.levelUp();
  }

  public void studyAbroad(Subject subject){
    subject.levelDoubleUp();
  }

  public void work() {
    workingExperience++;
    System.out.println("개발자 경력이 1 상승하였습니다.");
    System.out.println("현재 경력치: " + workingExperience);
  }

  public void socializingWith(Friend[] friends) {
    for (Friend friend : friends) {
      friend.intimacyUp();
    }
  }

  public void conflictWith(Friend[] friends) {
    for (Friend friend : friends) {
      friend.intimacyDown();
    }
  }
}
