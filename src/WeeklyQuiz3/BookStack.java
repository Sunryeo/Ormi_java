package WeeklyQuiz3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
  private Stack<Book<T>> books;

  public BookStack() {
    this.books = new Stack<Book<T>>();
  }

  public void pushBook(Book<T> book) {
    books.push(book);
  }

  public Book<T> popBook() throws EmptyStackException {
    return books.pop();
  }

  public Book<T> peekBook() throws EmptyStackException {
    return books.peek();
  }

  public boolean isEmpty() {
    if (books.empty()) {
      return true;
    } else return false;
  }
}
