package user_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private String url;
    private String username;
    private String password;

    public DataBaseConnection(){
        this.url = PostgresqlConf.URL;
        this.username = PostgresqlConf.USER;
        this.password = PostgresqlConf.PASSWORD;
    }

    public Connection createConnection(){
        try{
            Connection connection = DriverManager.getConnection(
                this.url, this.username, this.password
            );
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
