import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**В файле создайте класс Film, который будет представлять собой фильм. Класс содержит следующие поля:
 title — название фильма, строка
 director — имя режиссера, строка
 produced — год выпуска, целое число
 genre — жанр фильма, строка
 actors — имена актеров, массив строк
 duration — длительность фильма в минутах, целое число
 Реализуйте в классе пустой конструктор и конструктор со всеми полями.
 Добавьте в класс геттеры и сеттеры для всех полей.
 Переопределите методы equals() и hashCode() так, чтобы сравнение фильмов происходило по содержимому всех полей объекта, кроме поля duration
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"duration"})
public class Film {
    private String title;
    private String director;
    private int produced;
    private String genre;
    private String[] actors;
    private int duration;

}
