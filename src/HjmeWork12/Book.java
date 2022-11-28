package HjmeWork12;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearPublication;

    public Book (String name, Author author, int yearPublication) {
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
        return "Название книги " + this.name + ", " + "автор " + this.author + ", " + this.yearPublication + "г.";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            System.out.println("Это новая книга. Такой книги не было в каталоге");
            return false;
        }
        else {
            Book book2 = (Book) obj;
            System.out.println("Такая книга в каталоге уже есть");
            return name.equals(book2.name) && author.equals(book2.author) && yearPublication == book2.yearPublication;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }
}

