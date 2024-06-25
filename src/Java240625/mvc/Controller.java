package Java240625.mvc;

public class Controller {
    public static void main(String[] args){
        Student student = new Student("홍길동", 25);
        OutputView.printProfile(student);
    }
}
