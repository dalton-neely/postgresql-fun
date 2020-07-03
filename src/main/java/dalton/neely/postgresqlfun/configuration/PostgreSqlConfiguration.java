package dalton.neely.postgresqlfun.configuration;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import javax.sql.DataSource;

//@Configuration
//@EnableJdbcRepositories
//public class PostgreSqlConfiguration extends AbstractJdbcConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        PGSimpleDataSource dataSource = new PGSimpleDataSource();
//        dataSource.setDatabaseName("todo");
//        dataSource.setUser("postgres");
//        dataSource.setPassword("ceatlame");
//        dataSource.setPortNumbers(new int[]{5432});
//        return dataSource;
//    }
//}
