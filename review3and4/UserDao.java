import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    // This is a placeholder for actual database connection code
    private static final String INSERT_USER_SQL = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";

    public boolean registerUser(User user) {
        try (Connection connection = Database.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(INSERT_USER_SQL);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
