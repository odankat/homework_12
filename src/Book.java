import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int releaseData;

    public Book(String name, Author author, int releaseData) {
        this.name = name;
        this.author = author;
        this.releaseData = releaseData;
    }

    public String getName() {
        return this.name;
    }

    public int getReleaseData() {
        return this.releaseData;
    }

    public void setReleaseData(int releaseData) {
        this.releaseData = releaseData;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Название книги " + getName() + ", год публикации " + getReleaseData() + ", автор - " + getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(releaseData, book.releaseData) && Objects.equals(author, book.author);

    } @Override
    public int hashCode() {
        return Objects.hash(name, author, releaseData);
    }


}
