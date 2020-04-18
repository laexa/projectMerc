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
import moon.projectx.objectTable.Customer;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.UI.LoginUI;



/**
 *
 * @author user
 */

public class Main {
                    
    public static void main(String[] args) {
        
//        Customer customer = new Customer("name", "lastName", 2222, 1111111);
//        
//        
//        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
//        connectionDataBase.connect();
//        RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
//        
//        System.out.println(requestDataBase.getUserLogin("login"));
//        System.out.println(requestDataBase.getUserPassword("password"));
////        
//        System.out.println(requestDataBase.addCustomer(customer));                        // OK !!!!!!
//        System.out.println(requestDataBase.updateCustomer(2, customer));                  // OK !!!!!!
//        System.out.println(requestDataBase.deleteCustomer(4));                            // OK !!!!!!
//        System.out.println(requestDataBase.getCustomer(1).toString());                    // OK !!!!!!
        
//        
//        LoginUI loginForm = new LoginUI();
//        NewJFrame ns = new NewJFrame();
//        ns.setLocationRelativeTo(null);
//        ns.setVisible(true);
        LoginUI logiWindow = new LoginUI();
        logiWindow.setVisible(true);
        
    }
}
