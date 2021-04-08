package Controller;
 
import java.sql.*;

import Model.User;
 
public class SQLController {
    private static Connection connection;
    
    public void connect() throws ClassNotFoundException, SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/cz3002_auth_db";
        String dbUser = "sqladmin";
        String dbPassword = "sqladmin_password";
 
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    }
    
    public User checkLogin(String username, String password) throws SQLException,
            ClassNotFoundException {
        String sql = "SELECT * FROM users WHERE username = ? and password = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
 
        ResultSet result = statement.executeQuery();
 
        User user = null;
 
        if (result.next()) {
            user = new User();
            user.setFullname(result.getString("full_name"));
            user.setUsername(username);
        }
 
        connection.close();
 
        return user;
    }
}