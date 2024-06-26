package WeeklyQuiz3;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BookShelf<String> bookShelf = new BookShelf<>();
    BookStack<Integer> bookStack = new BookStack<>();

    // dummy books
    Book<String> bookD = new Book<>("Dune", "Frank Herbert", "D");
    Book<String> bookJ = new Book<>("Justice", "Michael Sandel", "J");
    Book<String> bookS = new Book<>("Sapiens", "Yuval Noah Harari", "S");

    Book<Integer> book2 = new Book<>("Dune", "Frank Herbert", 2);
    Book<Integer> book3 = new Book<>("Justice", "Michael Sandel", 3);
    Book<Integer> book4 = new Book<>("Sapiens", "Yuval Noah Harari", 4);

    bookShelf.addBook(bookD);
    bookShelf.addBook(bookJ);
    bookShelf.addBook(bookS);

    bookStack.pushBook(book2);
    bookStack.pushBook(book3);
    bookStack.pushBook(book4);

    Scanner sc = new Scanner(System.in);

    System.out.print("도서 제목을 입력하세요: ");
    String title = sc.nextLine();

    System.out.print("도서 저자를 입력하세요: ");
    String author = sc.nextLine();

    sc.close();

    Book<String> bookA = new Book<>(title, author, "A");
    Book<Integer> book1 = new Book<>(title, author, 1);

    bookShelf.addBook(bookA);
    bookStack.pushBook(book1);

    List<Book<String>> searchResult1 = bookShelf.searchByTitle("dune");
    System.out.println("제목으로 도서 검색 결과: " + searchResult1.get(0).toString());

    List<Book<String>> searchResult2 = bookShelf.searchByAuthor("frank");
    System.out.println("저자로 도서 검색 결과: " + searchResult2.get(0).toString());

    bookShelf.removeBook(searchResult2.get(0));
    List<Book<String>> result = bookShelf.searchByAuthor("frank");
    System.out.println("삭제 후 도서 검색 결과: " + result.size());

    try {
      Book<Integer> peekedBook = bookStack.peekBook();
      System.out.println("peekBook: " + peekedBook.toString());
    } catch (EmptyStackException e) {
      System.out.println("스택이 비었습니다.");
    }

    try {
      Book<Integer> poppedBook = bookStack.popBook();
      System.out.println("popBook: " + poppedBook.toString());

      // book stack 비우기
      bookStack.popBook();
      bookStack.popBook();
      bookStack.popBook();
    } catch (EmptyStackException e) {
      System.out.println("스택이 비었습니다.");
    }

    System.out.println("스택이 비었나요?: " + bookStack.isEmpty());
  }
}
