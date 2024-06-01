/*В файле создайте класс Book, который будет представлять собой книгу в нашем приложении. Класс содержит следующие поля:

title — название книги, строка
author — имя автора книги, строка
published — год публикации, целое число
Реализуйте в классе конструктор

Так как наш класс неявно наследуется от класса Object, ему уже доступен метод toString() со стандартным поведением.
Переопределите метод toString() так, чтобы чтобы сделать собственное текстовое представление книги:*/

public class Book {
    String title;
    String author;
    int published;

    Book(String title, String author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }
    @Override
    public String toString() {
        return "Book \"" + title + "\" written by " + author + " published in " + published;
     }
}
