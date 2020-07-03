package dalton.neely.postgresqlfun.dao;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;
import org.springframework.lang.Nullable;

@AllArgsConstructor
@Value
public class User {
    @NonNull
    String firstName;
    @NonNull
    String lastName;
    @Nullable
    Long id;
}
