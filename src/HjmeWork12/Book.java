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
    public boolean equals(Object obj) {
        if (obj == this)
            return true;   // true выходит в консоль, не знаю как исправить
        if (obj == null || getClass() != obj.getClass()) {
            System.out.println("Это разные книги");
        } else {
            System.out.println("Это одинаковые книги");
        }
        Book book = (Book) obj;
        return book.equals(book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }
}

