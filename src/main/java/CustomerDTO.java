import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/*В файле создайте класс CustomerDTO, который будет служить в нашем приложении для получения извне данных о покупателе. Класс содержит следующие поля:

firstName — имя покупателя, строка
lastName — фамилия покупателя, строка
email — адрес электронной почты, строка
Сделайте поля класса неизменяемыми и реализуйте в классе конструктор и геттеры*/
@Data
@AllArgsConstructor
@Getter
public class CustomerDTO {
    private String firstName;
    private String lastName;
    private String email;

}
