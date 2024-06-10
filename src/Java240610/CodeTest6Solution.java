package Java240610;

public class CodeTest6Solution {
  public static String secomDalcom(int n) {
    //       if(n % 3 == 0 && n %5 == 0){
    //           return "새콤달콤";
    //       }else if( n%3 == 0 ){
    //           return "새콤!";
    //       } else if(n%5 == 0){
    //           return "달콤!";
    //       } else{
    //           return n + "!";
    //       }

    boolean secom = n % 3 == 0;
    boolean dalcom = n % 5 == 0;

    if (secom && dalcom) return "새콤달콤";
    if (secom) return "새콤!";
    if (dalcom) return "달콤!";
    return n + "!";
  }
}
