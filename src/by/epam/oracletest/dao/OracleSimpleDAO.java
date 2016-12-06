package by.epam.oracletest.dao;

import by.epam.oracletest.domain.Request;
import by.epam.oracletest.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Uladzislau_Kastsevic on 12/6/2016.
 */
public class OracleSimpleDAO implements SimpleDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query("select * from railway_user", new UserMapper());
    }

    @Override
    public List<Request> getRequestsByUser(int userId) {
        return null;
    }

    private static class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            return user;
        }
    }
}
