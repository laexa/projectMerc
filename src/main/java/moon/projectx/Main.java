/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import moon.projectx.objectTable.User;

/**
 *
 * @author user
 */

public class Main {
                    
    public static void main(String[] args) {
        User user = new User("m11ax", "oka11l", 1, "xyul11o");
        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        connectionDataBase.addUser(user);
        
        
    }
}
