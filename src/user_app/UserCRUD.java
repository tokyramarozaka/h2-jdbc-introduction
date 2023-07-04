package user_app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserCRUD {
    // TODO : insert a new user into the database
    public boolean insertUser(String name, String email, String password){
        return true;
    }

    // Retrieve a single User using its ID
    public User findUserById(int id){
        DataBaseConnection db = new DataBaseConnection();
        Connection connection = db.createConnection();
        try{
            String sql = "SELECT * FROM \"user\" WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if(resultSet.next()){
                return new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    // TODO : get all users in the database
    public List<User> findAllUsers(){
        return null;
    }

    // TODO : delete a single user using its ID
    public boolean deleteUser(int id){
        return true;
    }

    // TODO : update a single user by using its id, and giving the new informations.
    public boolean updateUser(int id, String newName, String newEmail, String newPassword){
        return true;
    }

    public static void main(String[] args) {
        UserCRUD crud = new UserCRUD();
        System.out.println(crud.findUserById(1));
    }
}
