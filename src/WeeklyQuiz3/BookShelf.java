package WeeklyQuiz3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {

  private List<Book<T>> books;

  public BookShelf() {
    this.books = new ArrayList<>();
  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).equals(book)) {
        books.remove(book);
      }
    }
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    List<Book<T>> result = new ArrayList<>();

    for (int i = 0; i < books.size(); i++) {
      String lowerCaseTitle = books.get(i).getTitle().toLowerCase();
      if (lowerCaseTitle.contains(title.toLowerCase())) {
        result.add(books.get(i));
      }
    }
    return result;
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    List<Book<T>> result = new ArrayList<>();

    for (int i = 0; i < books.size(); i++) {
      String lowerCaseAuthor = books.get(i).getAuthor().toLowerCase();
      if (lowerCaseAuthor.contains(author.toLowerCase())) {
        result.add(books.get(i));
      }
    }
    return result;
  }
}
