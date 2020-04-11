/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;


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
    private String NAMEDATABASE     = "testbd";
    private String TIMEZONESETTING  = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
      
    
    public boolean connect(){
        
        try {
            Connection connection;
            
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
    
}
