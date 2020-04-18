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
//import moon.projectx.UI.LoginUI;



/**
 *
 * @author user
 */

public class Main {
                    
    public static void main(String[] args) {
        
        Customer customer = new Customer("name", "lastName", 2222, 1111111);
        
        
        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
//        System.out.println(requestDataBase.addCustomer(customer));                        // OK !!!!!!
//        System.out.println(requestDataBase.updateCustomer(2, customer));                  // OK !!!!!!
//        System.out.println(requestDataBase.deleteCustomer(4));                            // OK !!!!!!
//        System.out.println(requestDataBase.getCustomer(1).toString());                    // OK !!!!!!
        
//        System.out.println(requestDataBase.addUser(user));
//        user = new User("222", "222", 1, "222", "222");
//        System.out.println(requestDataBase.updateUser(5, user));
//        System.out.println(requestDataBase.deleteUser(5));
//        user = requestDataBase.getUser(1);
//        System.out.println(user.toString());
//        LoginUI loginForm = new LoginUI();
//        NewJFrame ns = new NewJFrame();
//        ns.setLocationRelativeTo(null);
//        ns.setVisible(true);
//        
    }
}
