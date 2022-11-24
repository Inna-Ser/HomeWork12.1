package HjmeWork12;

public class Book {
    private final String name;
    private final String Author;
    private int yearPublication;

    public Book (String name, String Author, int yearPublication) {
        this.name = name;
        this.Author = Author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.Author;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

