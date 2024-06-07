import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Locale;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private LocalDate birthday;
    private String name;


}
