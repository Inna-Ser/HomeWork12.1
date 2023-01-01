import HjmeWork12.Author;
import HjmeWork12.Book;

public class Main {
     public static void main(String[] args) {
         Author author = new Author("Роджер", "Желязны");
         Author author1 = new Author("Даниель", "Дефо");
         Author author2 = new Author("Иван", "Тургенев");
         Book book = new Book("Кладбище cлонов", author, 2008);
         Book book1 = new Book("Робинзон Крузо", author1, 1958);
         Book book2 = new Book("Робинзон Крузо", author1, 1958);
         Book book3 = new Book("Му-Му", author2,1996);
         Book book4 = new Book("Психолаавка", author,2005);
         Book book5 = new Book("Отцы и дети", author2, 1899);
     // изенение даты публикации
         book.setYearPublication(2020);
         book1.setYearPublication(2010);
     // новые данные
         System.out.println(book.getName() + " " + author.getFirstName() + " " + author.getLastName() + ", " + book.getYearPublication() + "г.");
         System.out.println(book1.getName() + " " + author1.getFirstName() + " " + author1.getLastName() + ", " + book1.getYearPublication() + "г.");
     // вывод на печать объектов каталога
         System.out.println(book);
         System.out.println(book1);
         System.out.println(book2);
         System.out.println(book3);
         System.out.println(book4);
         System.out.println(book5);
     // результат сравнивания книг
         System.out.println("Эти книги одинаковые? " + book5.equals(book2));
     }
}