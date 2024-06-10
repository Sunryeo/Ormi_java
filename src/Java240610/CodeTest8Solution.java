package Java240610;

public class CodeTest8Solution {
  static String repeatChar(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      char theChar = str.charAt(i);
      result += "" + theChar + theChar;
    }

    return result;
  }
}
