/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;



import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.Date;
import moon.projectx.objectTable.User;
import moon.projectx.objectTable.Customer;
import moon.projectx.objectTable.Statistics;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.UI.LoginUI;
import moon.projectx.UI.manager.CategoryManagerUI;
import moon.projectx.UI.manager.UserManagerUI;
import moon.projectx.UI.manager.DiscountCardManagerUI;
import moon.projectx.UI.AddAndEditUI.EditUserUI;
import moon.projectx.UI.manager.CustomerManagerUI;
import moon.projectx.UI.AddAndEditUI.AddCustomerUI;
import moon.projectx.UI.AddAndEditUI.AddDiscountCardUI;
import moon.projectx.UI.manager.CategoryManagerUI;



/**
 *
 * @author user
 */

public class Main {
                    
    public static void main(String[] args) {
        
//        Customer customer = new Customer("name", "lastName", 2222, 1111111);
////        
////        User user = new User("asasdsd", "asdsd", 0, "Asdsad", "asdasd");
//        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        new LoginUI().setVisible(true);
//        new CategoryManagerUI().setVisible(true);
        
//        new AddDiscountCardUI().setVisible(true);
//        new DiscountCardManagerUI().setVisible(true);
////        new UserManagerUI().setVisible(true);
       
        
//        RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
//        Statistics statistics = new Statistics(0, "someText", 0, 0, 0);
//        System.out.println(requestDataBase.addStat(statistics));
//        java.util.Date utilDate = new java.util.Date();
//        java.sql.Date sqlDate = convert(utilDate);
//        System.out.println(utilDate.toString());
//        System.out.println(sqlDate.toString());
//        
        
        
//        requestDataBase.updateUser(31, user);
//        for (int i = 0; i < 1000; i++) {
//            requestDataBase.addUser(user);    
//        }
        
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
//        LoginUI logiWindow = new LoginUI();
//        logiWindow.setVisible(true);
//        CategoryManagerUI categoryManagerUI = new CategoryManagerUI();
//        categoryManagerUI.setVisible(true);
//
//        for (int i = 1000; i < 1137; i++) {
//            requestDataBase.deleteUser(i);
//        }

//        UserManagerUI userManagerUI = new UserManagerUI();
//        userManagerUI.setVisible(true);

//        new CustomeManagerUI().setVisible(true);
//        
////        EditUserUI editUserUI = new EditUserUI();
//        editUserUI.setVisible(true);
    
    }
    
  }
