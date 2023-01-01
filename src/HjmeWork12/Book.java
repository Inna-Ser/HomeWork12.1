package HjmeWork12;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        int correctYear = LocalDate.now().getYear();
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Название книги \"" + this.name + "\", " + "автор " + this.author + ", " + this.yearPublication + "г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }
}

