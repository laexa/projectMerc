/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.driver;

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
    
    public Connection getConnection() {
        return connection;
    }
    
}
