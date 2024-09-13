package com.inf.DB.Repo;

import org.springframework.stereotype.Repository;
import java.sql.*;


import com.inf.DB.Model.User;
@Repository
public class BuchRepo {
    private final String URL = "jdbc:postgresql://localhost:5432/app";
    private final String USER = "user";
    private final String PASSWD = "postgres";
    
    public User getUserById(String id){
        final String querey = "SELECT * FROM user_table WHERE id='" + id + "'";
        User user = new User();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWD)){
            try (PreparedStatement q = connection.prepareStatement(querey)) {
                ResultSet result = q.executeQuery();
                while (result.next()) {
                    user.setAge(result.getInt("age"));
                    user.setName(result.getString("name"));
                    user.setId(result.getString("id"));
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    
}
