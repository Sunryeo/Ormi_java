package Java240610;

public class CodeTest2Solution {
  static int speedRacer(int speed, boolean isHoliday) {
    // 휴일인 경우
    if (isHoliday == true && speed > 65 && speed <= 85) {
      return 100;
    }
    if (isHoliday == true && speed >= 86) {
      return 200;
    }
    if (isHoliday == true && speed <= 65) {
      return 0;
    }

    // 휴일이 아닌 경우
    if (speed > 60 && speed <= 80) {
      return 100;
    }
    if (speed >= 81) {
      return 200;
    } else {
      return 0;
    }
  }

  static int speedRacer2(int speed, boolean isHoliday) {
    int safeSpeed = 60;
    int dangerSpeed = 80;
    int tax = 0;

    if (isHoliday) {
      safeSpeed += 5;
      dangerSpeed += 5;
    }
    if (speed > dangerSpeed) {
      tax = 200;
    }
    if (speed <= safeSpeed) {
      tax = 0;
    }
    if (speed > safeSpeed && speed <= dangerSpeed) {
      tax = 100;
    }
    return tax;
  }
}
