package Java240610;

public class CodeTest1Solution {
  static String printAt(String str) {

    if (str.length() <= 1) {
      return str;
    }

    return str.charAt(0) + "@" + printAt(str.substring(1));
  }

  static String printAt2(String str) {

    int i = 0;
    String result = "";

    if (str.length() <= i) {
      return str;
    }

    while (i < str.length() - 1) {
      result += str.charAt(i) + "@";
      i++;
    }

    result += str.charAt(i);

    return result;

    //        if(str.length() <= 1){
    //            return str;
    //        }
    //
    //        return str.charAt(0)+"@"+printAt(str.substring(1));

  }
}
