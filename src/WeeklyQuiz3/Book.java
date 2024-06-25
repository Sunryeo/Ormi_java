package WeeklyQuiz3;

public class Book<T> {
  private String title;
  private String author;
  private T identifier;

  public Book(String title, String author, T identifier) {
    this.title = title;
    this.author = author;
    this.identifier = identifier;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public T getIdentifier() {
    return identifier;
  }

  @Override
  public String toString() {
    return String.format("제목: %s, 저자: %s, 식별자: %s", title, author, identifier);
  }
}
