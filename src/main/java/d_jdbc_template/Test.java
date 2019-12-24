package d_jdbc_template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-12-24 21:31
 **/
@SpringBootApplication
public class Test implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(Test.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "select * from customer";
        List<Customer> query = jdbcTemplate.query(sql, new RowMapper<Customer>() {
            Customer c = new Customer();

            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                c.setId(Long.valueOf(resultSet.getString("id")));
                c.setFirstName(resultSet.getString("first_name"));
                c.setLastName(resultSet.getString("last_name"));
                return c;
            }
        });
        if(Objects.nonNull(query)){
            query.forEach(e->{
                logger.info(e.toString());
            });
        }
    }
}
