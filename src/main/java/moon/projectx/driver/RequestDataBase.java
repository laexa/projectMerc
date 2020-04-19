/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.driver;

import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import moon.projectx.objectTable.User;
import moon.projectx.objectTable.Customer;
        
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
    
    public int getUserLogin(String login){
        
        int tmp = 0;
        
        try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "select count(maindb.user.login) from maindb.user where maindb.user.login = '" + login + "';";
            resultSet = statement.executeQuery(request);
            
            while (resultSet.next()) {                
                tmp = resultSet.getInt(1);
                
            }
            
            resultSet.close();
            
            return tmp;
            
        } catch (Exception e) {
        }
        return 0;
    }
    
    public int getUserPassword(String password){
        
        int tmp = 0;
        
        try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "select count(maindb.user.password) from maindb.user where maindb.user.password = '" + password + "';";
            resultSet = statement.executeQuery(request);
            
            while (resultSet.next()) {                
                tmp = resultSet.getInt(1);
                
            }
            
            resultSet.close();
            
            return tmp;
            
        } catch (Exception e) {
        }
        return 0;
    }
    
    public boolean addUser(User user) {
    
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
    
    public boolean updateUser(int id, User user){
        
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
    
    public boolean deleteUser(int id) {
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
    
    public Customer getCustomer(int id){
        
        Customer customer = new Customer();
        
        try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "select maindb.customer.name, maindb.customer.lastName, maindb.customer.numberPhone, maindb.customer.discountCardId from maindb.customer where maindb.customer.id = " +id +";";
            resultSet = statement.executeQuery(request);
            
            while (resultSet.next()) {                
                customer.setName(resultSet.getString("name"));
                customer.setLastName(resultSet.getString("lastName"));
                customer.setNumberPhone(resultSet.getInt("numberPhone"));
                customer.setDiscountCardId(resultSet.getInt("discountCardId"));                               
            }
            
            resultSet.close();
            
            return customer;
            
        } catch (Exception e) {
        }
        return customer;
    }
    
    public boolean addCustomer(Customer customer){
        try {
            
           preparedStatement = connection.prepareStatement("insert maindb.customer (maindb.customer.name, maindb.customer.lastName, maindb.customer.numberPhone, maindb.customer.discountCardId) "
                    + "values (?, ?, ?, ?);");

                
           preparedStatement.setString(1, customer.getName());
           preparedStatement.setString(2, customer.getLastName());
           preparedStatement.setInt(3, customer.getNumberPhone());
           preparedStatement.setInt(4, customer.getDiscountCardId());
           preparedStatement.executeUpdate();
           
           preparedStatement.close();
                
            return true; 
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public boolean updateCustomer(int id, Customer customer){
        try {
             
           preparedStatement = connection.prepareStatement("update maindb.customer set "
                   + "maindb.customer.name = ?, "
                   + "maindb.customer.lastName = ?, "
                   + "maindb.customer.numberPhone = ?, "
                   + "maindb.customer.discountCardId = ? "
                   + "where maindb.customer.id = ?; ");
           
           preparedStatement.setString(1, customer.getName());
           preparedStatement.setString(2, customer.getLastName());
           preparedStatement.setInt(3, customer.getNumberPhone());
           preparedStatement.setInt(4, customer.getDiscountCardId());
           preparedStatement.setInt(5, id);
           preparedStatement.executeUpdate();
           
           preparedStatement.close();
                
            return true; 
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    public boolean deleteCustomer(int id){
         try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "delete from maindb.customer where maindb.customer.id = " +id +"";
        
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
    
    public ArrayList getAllUser() {
        String SQL = "SELECT * FROM maindb.user;";
        
        try {
            statement = connection.createStatement();
            resultSet =  statement.executeQuery(SQL);
            
            ArrayList<User> userList = new ArrayList<>();
            User user = new User();
            
            while(resultSet.next()){
                user = new User();
                
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setType(resultSet.getInt(4));
                user.setLogin(resultSet.getString(5));
                user.setPassword(resultSet.getString(6));
                
                userList.add(user);
                
                
            }
            
            statement.close();
            return userList;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }              
        
        return null;
    }
    
}
