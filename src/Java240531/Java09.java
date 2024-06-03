package Java240531;

public class Java09 {
  public static void main(String[] args) {
    String result = "";

    result += "Hello";
    result += "java";
    result += "World";
//    System.out.println(result);

    StringBuilder sb = new StringBuilder();
    sb.append("Hello"); // 문자열 끝에 추가
    sb.append("java");
    sb.append("World");
    System.out.println(sb);

    StringBuffer sf = new StringBuffer();
    sf.append("Hello");
    sf.append("java");
    sf.append("World");
    System.out.println(sf);

    StringBuffer sb2 = new StringBuffer();
    sb2.append("Hello");
    sb2.insert(0, "World"); // 문자열 중간에 삽입
    System.out.println(sb2);
  }
}
