import HjmeWork12.Author;
import HjmeWork12.Book;

public class Main {
     public static void main(String[] args) {
         Author author = new Author("Роджер", "Желязны");
         Author author1 = new Author("Даниель", "Дефо");
         Book book = new Book("\"Кладбище cлонов\"", author, 2008);
         Book book1 = new Book("\"Робинзон Крузо\"", author1, 1958);
         Book book2 = new Book("\"Робинзон Крузо\"", author1, 1958);
     // изенение даты публикации
         book.setYearPublication(2020);
         book1.setYearPublication(2010);
     // новые данные
         System.out.println(book.getName() + " " + author.getFirstName() + " " + author.getLastName() + ", " + book.getYearPublication() + "г.");
         System.out.println(book1.getName() + " " + author1.getFirstName() + " " + author1.getLastName() + ", " + book1.getYearPublication() + "г.");
     // метод toString
         System.out.println(book);
         System.out.println(book1);
         System.out.println(book2);
     }
}