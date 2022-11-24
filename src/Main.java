import HjmeWork12.Author;
import HjmeWork12.Book;

public class Main {
     public static void main(String[] args) {
         Author authorName = new Author("Роджер Желязны");
         Book book = new Book("Кладбище слонов", "", 2008);
         System.out.println("book.name = " + book.getName());
         System.out.println("book.yearPublication = " + book.getYearPublication());





     }
}