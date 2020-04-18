/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.driver;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import moon.projectx.objectTable.User;
/**
 *
 * @author user
 */
public class RequestDataBase {
        
    private String request = "";
    private PreparedStatement preparedStatement;
    private Statement statement;
    private Connection connection;
    private ResultSet resultSet;
    
    public RequestDataBase(Connection connection) {
        try {
            this.connection = connection;
            statement = connection.createStatement();
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
    
    public Boolean addUser(User user) {
    
        try {
                       
           preparedStatement = connection.prepareStatement(""
                + "insert maindb.user (maindb.user.name, maindb.user.lastName, maindb.user.type, maindb.user.login, maindb.user.password) "
                + "values (?, ?, ?, ?, ?);");
                
           preparedStatement.setString(1, user.getName());
           preparedStatement.setString(2, user.getLastName());
           preparedStatement.setInt(3, user.getType());
           preparedStatement.setString(4, user.getLogin());
           preparedStatement.setString(5, user.getPassword());
           preparedStatement.executeUpdate();
           preparedStatement.close();
                
            return true; 
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public Boolean updateUser(int id, User user){
        //update maindb.user set maindb.user.name = 'Max', maindb.user.lastName = 'Okal', maindb.user.type = 1, maindb.user.login = 'login', maindb.user.password = 'password' where  maindb.user.id = 2;
        try {
            
            preparedStatement = connection.prepareStatement("update maindb.user set "
                    + "maindb.user.name = ?, "
                    + "maindb.user.lastName = ?, "
                    + "maindb.user.type = ?, "
                    + "maindb.user.login = ?, "
                    + "maindb.user.password = ? "
                    + "where  maindb.user.id = ?;");
           
           preparedStatement.setString(1, user.getName());
           preparedStatement.setString(2, user.getLastName());
           preparedStatement.setInt(3, user.getType());
           preparedStatement.setString(4, user.getLogin());
           preparedStatement.setString(5, user.getPassword());
           preparedStatement.setInt(6, id);
           preparedStatement.executeUpdate();
           preparedStatement.close();
                
            return true; 
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        
        return false;
    }
    
    public Boolean deleteUser(int id) {
        try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "delete from maindb.user where maindb.user.id = " +id +"";
        
            if(!statement.execute(request)){
                return true;
            }
            statement.close();
            
            return false;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public User getUser(int id) {
        User user = new User();
        
        try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "select maindb.user_table.name, maindb.user_table.lastName, maindb.user_table.type, maindb.user_table.password From maindb.user_table where maindb.user_table.id = " + id + ";";
            resultSet = statement.executeQuery(request);
            
            while (resultSet.next()) {                
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastName"));
                user.setType(resultSet.getInt("type"));
                user.setPassword(resultSet.getString("password"));                
            }
            
            resultSet.close();
            
            return user;
            
        } catch (Exception e) {
        }
        return user;
    }
    
    public void viewAllData() {
        String SQL = "SELECT * FROM maindb.user_table;";
        
        try {
            statement = connection.createStatement();
            resultSet =  statement.executeQuery(SQL);
            
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
    
}
