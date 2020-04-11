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
 *
 * @author user
 */

public class Main {
                    
    public static void main(String[] args) {
     
     ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        System.out.println(connectionDataBase.connect());
    }
}
