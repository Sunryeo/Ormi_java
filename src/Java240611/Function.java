package Java240611;

public class Function {
  public static void main(String[] args) {
    //    Function2 function2 = new Function2();
    //
    //    int arg1 = Integer.parseInt(args[0]);
    //    int arg2 = Integer.parseInt(args[1]);
    //
    //    int result1 = function2.add(arg1, arg2);
    //    int result2 = function2.sub(arg1, arg2);
    //
    //    System.out.println(result1);
    //    System.out.println(result2);

    Person person1 = new Person("sunryeo", "01088889999", 20000, 34);
//    person1.sayMoney();
    Person person2 = new Person("minsoo", "01088889998", 30000, 33);
//    person2.sayMoney();
    Person person3 = new Person("wooseok", "01088889997", 40000, 32);
//    person3.sayMoney();

    Student student = new Student();
    person1.teaching(student);
    person1.cheating(student);
  }
}
