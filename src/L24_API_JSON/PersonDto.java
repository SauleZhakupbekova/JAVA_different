package L24_API_JSON;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;

//https://randomuser.me/api/?nat=us,dk,fr,gb&results=1 - qwery in web page is written after sigh "/?"//

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Accessors //дает возможность создать сетороподобный класс типа setGender в Main//


public class PersonDto {
    private Character gender;//usually should be final. Final give us throws safe. //
    private String firstName;
    private final String lastName;
    private final String city;
    private final String country;
    private final String email;
    @ToString.Exclude //switch off ToString for Date methode//
    private final ZonedDateTime birthday;
    private final Integer age;

}
