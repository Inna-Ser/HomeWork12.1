package HjmeWork12;

public class CatalogBook {
    private final Book[] books;
    private int size;

    public CatalogBook() {
        this.books = new Book[5];
    }

    public void addBook(String name, Author author, int yearPublication) {
        if(size >= books.length) {
            System.out.println("Каталог заполнен. Создайте новый каталог");
        }
    }

}


