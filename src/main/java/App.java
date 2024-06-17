

/*В классе App реализуйте публичный статический метод sortBooks(),
который принимает на вход список книг List<Book> и сортирует его по названию книги в обратном порядке.
Метод должен вернуть новый список*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var books = new ArrayList<>(
                List.of(
                        new Book("Dubliners", "James Joyce"),
                        new Book("Moby-Dick", "Herman Melville"),
                        new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                        new Book("Crime and Punishment", "Fyodor Dostoevsky"),
                        new Book("Don Quixote", "Miguel de Cervantes")
                )
        );
        System.out.println(sortBooks(books));

        /*      books.get(2),
                books.get(1),
                books.get(0),
                books.get(4),
                books.get(3)*/

    }

    public static List<Book> sortBooks(List<Book> books) {
        ArrayList<Book> sortedBooks = new ArrayList<>(books);
        //Comparator<Book> forTitle = Comparator.comparing(Book::getTitle);
        sortedBooks.sort(Comparator.comparing(Book::getTitle).reversed());
        return sortedBooks;
    }




}
