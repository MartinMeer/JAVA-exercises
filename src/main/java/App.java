import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class App {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );
    public static void main(String[] args) {
        var emails = List.of(
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "sergey@gmail.com",
                "vovan@gmail.com",
                "vovan@hotmail.com"
        );

        var result = App.getFreeDomainsCount(emails);
        System.out.println(result); // => {gmail.com=2, yandex.ru=1, hotmail.com=1}
    }

    /*публичный статический метод getFreeDomainsCount(), который принимает на вход список емейлов List<String>.
    Метод должен вернуть Map<String, Long> — количество email, расположенных на каждом бесплатном домене.
    Список бесплатных доменов хранится в константе FREE_DOMAINS*/

    public static Map<String, Long> getFreeDomainsCount(List<String> emails) {
        var freeDomains = emails.stream()
                .map(email -> email.split("@")[1])
                .filter(domain -> FREE_DOMAINS.contains(domain))
                .collect(Collectors.groupingBy(domain -> domain, Collectors.counting()));
        return freeDomains;


    }













}
