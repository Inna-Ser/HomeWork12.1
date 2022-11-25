package HjmeWork12;

import java.time.LocalDate;

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
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        int correctYear = LocalDate.now().getYear();
        if(yearPublication)
        this.yearPublication = yearPublication;
    }
}

