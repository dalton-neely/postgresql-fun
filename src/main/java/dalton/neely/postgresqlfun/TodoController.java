package dalton.neely.postgresqlfun;

import dalton.neely.postgresqlfun.dao.User;
import dalton.neely.postgresqlfun.models.PostReturn;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    final String INSERT_SQL = "INSERT INTO Users (firstname, lastname) VALUES (:firstName, :lastName)";

    public TodoController(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @PostMapping(path = "/user")
    PostReturn postUser(@RequestBody User user){
        SqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("firstName", user.getFirstName())
                .addValue("lastName", user.getLastName());
        int returnValue = namedParameterJdbcTemplate.update(INSERT_SQL, namedParameters);
        if(returnValue == 1) {
            return new PostReturn(true, "Created the user: " + user.getFirstName() + " " + user.getLastName() + ".");
        } else {
            return new PostReturn(false, "Could not create user");
        }
    }
}
