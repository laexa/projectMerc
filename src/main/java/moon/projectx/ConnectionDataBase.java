/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
import moon.projectx.objectTable.User;


/**  
 * @author user
 * Connection class 
 * connect to Data Base
 */

public class ConnectionDataBase {
    
    private String URL              = "jdbc:mysql://";
    private String USERNAME         = "root";
    private String PASSWORD         = "root";
    private String IPADDRESS        = "localhost";
    private String PORT             = "3306";
    private String NAMEDATABASE     = "maindb";
    private String TIMEZONESETTING  = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private Statement statement;
    private Connection connection;
    
    public boolean connect() {
        
        try {
            
            
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            connection = DriverManager.getConnection(URL + IPADDRESS + ":" + PORT+ "/" + NAMEDATABASE + TIMEZONESETTING, 
                                                     USERNAME, 
                                                     PASSWORD);
            
            if(!connection.isClosed()){
                return true;
            }
            return false;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    public void viewAllData() {
        String SQL = "SELECT * FROM maindb.user_table;";
        
        try {
            statement = connection.createStatement();
            ResultSet resultSet =  statement.executeQuery(SQL);
            
            while(resultSet.next()){
                int id = resultSet.getInt("ID_USER");
                String userName = resultSet.getString("USER_NAME");
                String userLastName = resultSet.getString("USER_LAST_NAME");
                String userStatusName = resultSet.getString("USER_STATUS");
                String userPassword = resultSet.getString("USER_PASSWORD");
                
                System.out.println("\n================\n");
                System.out.println("id: " + id);
                System.out.println("Name: " + userName);
                System.out.println("userLastName: " + userLastName);
                System.out.println("userStatus: $" + userStatusName);
                System.out.println("passwor: $" + userPassword);
            }                        
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }              
    }
    //insert maindb.user_table (maindb.user_table.name, maindb.user_table.lastName, maindb.user_table.type, maindb.user_table.password) values ('alex', 'cheipesh', 0, '1999c');
    public void addUser(User user) {
 
        try {
            statement = connection.createStatement();
            String request = "insert maindb.user_table " 
                    + "(maindb.user_table.name, maindb.user_table.lastName, maindb.user_table.type, maindb.user_table.password)"
                    + " values ('" + user.getName() + "', '" + user.getLastName()+ "', " + user.getType()+ ", ' " + user.getPassword() + "');";
            
            statement.execute(request);
            statement.close();
            
        } catch (Exception e) {
            System.err.println(e.getCause());
        }
    }
}
