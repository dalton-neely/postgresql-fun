package dalton.neely.postgresqlfun.models;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;
import org.springframework.lang.Nullable;

@AllArgsConstructor
@Value
public class PostReturn {
    @NonNull
    boolean success;
    @Nullable
    String message;
}
