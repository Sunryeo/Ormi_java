package Java240610;

public class CodeTest4Solution {
  public static boolean isOrdered(int first, int second, int third, boolean opt) {
    //        if(opt){
    //            return second < third;
    //        }
    //        return (first < second) && (second < third);

    return opt ? second < third : (first < second) && (second < third);
  }
}
