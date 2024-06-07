import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*у нас есть список пользователей,
из которого мы хотим получить список возрастов этих пользователей для каких-то дальнейших вычислений или формирования данных по запросу.*/
public class App {

    public static void main(String[] args) {
        User user1 = new User(LocalDate.of(2000, 1, 6));

        List<User> users = List.of(
                user1,
                new User(LocalDate.of(1999, 1, 1)),
                new User(LocalDate.of(2010, 5, 8)),
                new User(LocalDate.of(2008, 10, 11))
        );


        System.out.println(users);

        LocalDate currentDate = LocalDate.now();
        LinkedList<Integer> ages = new LinkedList<>();

        for (User givenUser : users) {
            Period fullAge = Period.between(givenUser.getBirthday(), currentDate);
            Integer age = fullAge.getYears();
            ages.add(age);
        }

        System.out.println(ages);

        List<Book> books = List.of(
                new Book("Death on the Nile", "Agatha Christie", "Detective"),
                new Book("Murder on the Orient Express", "Agatha Christie", "Detective"),
                new Book("The Raven", "Edgar Allan Poe", "Poem")
                );

        System.out.println(countBooks(books, "Agatha Christie", "Detective"));
    }
/*Метод должен вернуть общее количество книг в библиотеке, написанных нашим автором в определенном жанре*/
    private static int countBooks(List<Book> books, String authorName, String genre) {
        int result = 0;
        ArrayList<Book> booksOfAuthor = new ArrayList<>();
        for (Book givenBook : books) {
            var author = givenBook.getAuthorName();
            var genre1 = givenBook.getGenre();
            if (author.equals(authorName) && genre1.equals(genre)) {
                result++;
            }
        }
        return result;
    }


}
