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
import moon.projectx.SettingAndUser;


/**  
 * @author user
 * Connection class 
 * connect to Data Base
 */

public class ConnectionDataBase {
    
    private String URL              = SettingAndUser.Setting.URL;
    private String USERNAME         = SettingAndUser.Setting.USERNAME;
    private String PASSWORD         = SettingAndUser.Setting.PASSWORD;
    private String IPADDRESS        = SettingAndUser.Setting.IPADDRESS;
    private String PORT             = SettingAndUser.Setting.PORT;
    private String NAMEDATABASE     = SettingAndUser.Setting.NAMEDATABASE;
    private String TIMEZONESETTING  = SettingAndUser.Setting.TIMEZONESETTING;
    
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
