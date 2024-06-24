

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class App {


    public static void main(String[] args){
/* У каждого фильма есть название и жанр. Так как фильм может быть снят в нескольких жанрах, это поле представлено списком.
Вам предстоит посчитать, какое количество фильмов было снято в каждом из жанров

В классе App реализуйте публичный статический метод getGenres(),
который принимает в качестве параметра список фильмов List<Film>. Метод должен вернуть Map<String, Long>,
в котором ключ — это название жанра, а значение — количество фильмов в этом жанре.
Нормализуйте название жанра перед подсчетом*/

        var films = List.of(
                new Film("Liquid Sky", List.of("thriller", "Action")),
                new Film("Superman", List.of("Action", "fantasy", "thriller")),
                new Film("Norwegian Ninja", List.of("THRILLER"))
        );

        var genresByFilms  = films.stream()
                .map(film -> film.getGenres())
                .collect(Collectors.toList());

        System.out.println(genresByFilms);

        var genresList = films.stream()
                .flatMap(film -> film.getGenres().stream())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(genre -> genre, Collectors.counting()));

        System.out.println(genresList);

        var result = App.getGenres(films);
        System.out.println(result); // => {"action"=2,"thriller"=3,"fantasy"=1}
        }

        public static Map<String, Long> getGenres(List<Film> films) {
            var filmsByGenre = films.stream()
                    .flatMap(film -> film.getGenres().stream())
                    .map(String::toLowerCase)
                    .sorted()
                    .collect(Collectors.groupingBy(genre ->genre, Collectors.counting()));

            return filmsByGenre;

        }



    }















