
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
import moon.projectx.objectTable.DiscountCard;
import moon.projectx.objectTable.Category;
import moon.projectx.objectTable.Merch;
import moon.projectx.objectTable.Statistics;
        
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
    
    public ArrayList getAllCustomer() {
        String SQL = "SELECT * FROM maindb.customer;";
        
        try {
            statement = connection.createStatement();
            resultSet =  statement.executeQuery(SQL);
            
            ArrayList<Customer> customerList = new ArrayList<>();
            Customer customer;
            
            while(resultSet.next()){
                customer = new Customer();
                
                customer.setId(resultSet.getInt(1));
                customer.setName(resultSet.getString(2));
                customer.setLastName(resultSet.getString(3));
                customer.setNumberPhone(resultSet.getInt(4));
                customer.setDiscountCardId(resultSet.getInt(5));
                
                customerList.add(customer);
            }
            
            statement.close();
            return customerList;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }              
        
        return null;
    }
   
    public boolean addDiscountCard(DiscountCard discountCard) {
        try {
            
            preparedStatement = connection.prepareStatement("insert maindb.discountcardid (maindb.discountcardid.name, maindb.discountcardid.percent) values (?, ?);");
            preparedStatement.setString(1, discountCard.getName());
            preparedStatement.setInt(2, discountCard.getPercent());
            preparedStatement.executeUpdate();                      
            preparedStatement.close();
                
            return true;             
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public boolean updateDiscountCard(int id, DiscountCard discountCard){
        
        try {
            
            preparedStatement = connection.prepareStatement("update maindb.discountcardid "
                                                            + "set maindb.discountcardid.name= ?, "
                                                            + "maindb.discountcardid.percent = ? "
                                                            + "where maindb.discountcardid.id = ?;");
           
           preparedStatement.setString(1, discountCard.getName());
           preparedStatement.setInt(2, discountCard.getPercent());
           preparedStatement.setInt(3, id);
           preparedStatement.executeUpdate();
           
           preparedStatement.close();
                
            return true; 
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        
        return false;
    }
    
    public boolean deleteDiscountCard(int id) {
        try {
            
            if(statement.isClosed()){
                statement = connection.createStatement();
            }
            request = "";
            request = "delete from maindb.discountcardid where maindb.discountcardid.id	= " +id +"";
        
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
    
    public ArrayList getAllDiscountCard(){
       String SQL = "SELECT * FROM maindb.discountcardid;";
        
        try {
            statement = connection.createStatement();
            resultSet =  statement.executeQuery(SQL);
            
            ArrayList<DiscountCard> discountCardList = new ArrayList<>();
            DiscountCard discountCard;
            
            while(resultSet.next()){
                discountCard = new DiscountCard();
                
                discountCard.setId(resultSet.getInt(1));
                discountCard.setName(resultSet.getString(2));
                discountCard.setPercent(resultSet.getInt(3));
                discountCardList.add(discountCard);
            }
            
            statement.close();
            return discountCardList;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }              
        
        return null;   
    }
    
    public boolean addCategory(Category category){
        try {
            
            preparedStatement = connection.prepareStatement("insert maindb.category (maindb.category.name) values (?);");
            preparedStatement.setString(1, category.getName());
            preparedStatement.executeUpdate();            
            preparedStatement.close();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }        
        return false;
    }
    
    public boolean updateCategory(int id, Category category){
        try {
            preparedStatement = connection.prepareCall("update maindb.category set maindb.category.name = ? "
                                                        + "where maindb.category.id = ?");
            preparedStatement.setString(1, category.getName());
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public boolean deleteCategory(int id){
        try {
            preparedStatement = connection.prepareStatement("delete from maindb.category where maindb.category.id = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public ArrayList getAllCategory(){
        String SQL = "select * from maindb.category;";
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);
            
            ArrayList<Category> categoryList = new ArrayList<>();
            Category category;
            
            while(resultSet.next()){
                category = new Category();
                category.setId(resultSet.getInt(1));
                category.setName(resultSet.getString(2));
                categoryList.add(category);
            }
            
            statement.close();
            return categoryList;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return null;
    }
    
    public boolean addMerch(Merch merch){
        try {
            preparedStatement = connection.prepareStatement("insert maindb.merch (maindb.merch.name, maindb.merch.desc, maindb.merch.categoryId, maindb.merch.price, maindb.merch.count, maindb.merch.percent )"
                    + "values (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, merch.getName());
            preparedStatement.setString(2, merch.getDesc());
            preparedStatement.setInt(3, merch.getCategoryId());
            preparedStatement.setInt(4, merch.getPrice());
            preparedStatement.setInt(5, merch.getCount());
            preparedStatement.setInt(6, merch.getPercent());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public boolean updateMerch(int id, Merch merch){
        try {
            preparedStatement = connection.prepareStatement("update maindb.merch set "
                    + "maindb.merch.name = ?, "
                    + "maindb.merch.desc = ?, "
                    + "maindb.merch.categoryId = ?, "
                    + "maindb.merch.price = ?, "
                    + "maindb.merch.count = ?, "
                    + "maindb.merch.percent = ? "
                    + "where maindb.merch.id = ?;");
            preparedStatement.setString(1, merch.getName());
            preparedStatement.setString(2, merch.getDesc());
            preparedStatement.setInt(3, merch.getCategoryId());
            preparedStatement.setInt(4, merch.getPrice());
            preparedStatement.setInt(5, merch.getCount());
            preparedStatement.setInt(6, merch.getPercent());
            preparedStatement.setInt(7, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public boolean deleteMerch(int id){
        try {
            preparedStatement = connection.prepareStatement("delete from maindb.merch where maindb.merch.id = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public ArrayList getAllMerch(){
        String SQL = "select maindb.merch.id, maindb.merch.name, maindb.merch.desc, maindb.merch.categoryId, maindb.category.name, maindb.merch.price, maindb.merch.count, maindb.merch.percent from maindb.merch  inner join maindb.category On maindb.merch.categoryId = maindb.category.id;";
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);
            
            ArrayList<Merch> merchList = new ArrayList<>();
            Merch merch;
            
            while(resultSet.next()){
                merch = new Merch();
                merch.setId(resultSet.getInt(1));
                merch.setName(resultSet.getString(2));
                merch.setDesc(resultSet.getString(3));
                merch.setCategoryId(resultSet.getInt(4));
                merch.setCategory(resultSet.getString(5));
                merch.setPrice(resultSet.getInt(6));
                merch.setCount(resultSet.getInt(7));
                merch.setPercent(resultSet.getInt(8));
                merchList.add(merch);
            }
            statement.close();
            return merchList;
            
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean addStat(Statistics stat){
        try {
            preparedStatement = connection.prepareStatement("insert maindb.stat "
                    + "(maindb.stat.nameMerch, "
                    + "maindb.stat.categoryId, "
                    + "maindb.stat.price, "
                    + "maindb.stat.count, "
                    + "maindb.stat.date) values "
                    + "(?, ?, ?, ?, now());");
            preparedStatement.setString(1, stat.getName());
            preparedStatement.setInt(2, stat.getCategoryId());
            preparedStatement.setInt(3, stat.getPrice());
            preparedStatement.setInt(4, stat.getCount());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            
            return true;
        } catch (Exception e) {
            System.err.println("");
        }
        return false;
    }
    
    public boolean updateStat(int id, Statistics stat){
        try {
            preparedStatement = connection.prepareStatement("update maindb.stat set "
                    + "maindb.stat.nameMerch = ?, "
                    + "maindb.stat.categoryId = ?, "
                    + "maindb.stat.price = ?, "
                    + "maindb.stat.count = ?, "
                    + "maindb.stat.date = now()"
                    + "where maindb.stat.id = ?;");
            preparedStatement.setString(1, stat.getName());
            preparedStatement.setInt(2, stat.getCategoryId());
            preparedStatement.setInt(3, stat.getPrice());
            preparedStatement.setInt(4, stat.getCount());
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public boolean deleteStat(int id){
        try {
            preparedStatement = connection.prepareStatement("delete from maindb.stat where maindb.stat.id = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return false;
    }
    
    public ArrayList getAllStat(){
        String SQL = "select "
                + "maindb.stat.id, "
                + "maindb.stat.nameMerch, "
                + "maindb.stat.categoryId, "
                + "maindb.category.name, "
                + "maindb.stat.price, "
                + "maindb.stat.count, "
                + "maindb.stat.date "
                + "from maindb.stat inner join maindb.category on maindb.stat.categoryId = maindb.category.id;";
 
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);
            
            ArrayList<Statistics> statList = new ArrayList<>();
            Statistics stat;
            
            while (resultSet.next()) {
                stat = new Statistics();
                stat.setId(resultSet.getInt(1));
                stat.setName(resultSet.getString(2));
                stat.setCategoryId(resultSet.getInt(3));
                stat.setCategory(resultSet.getString(4));
                stat.setPrice(resultSet.getInt(5));
                stat.setCount(resultSet.getInt(6));
                stat.setDate(resultSet.getDate(7));
                
                statList.add(stat);
                
            }
            statement.close();
            return statList;
        } catch (Exception e) {
        }
        return null;
    }
}
