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
import moon.projectx.objectTable.Merch;
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
import moon.projectx.UI.manager.CustomerManagerUI;
import moon.projectx.UI.manager.MerchManagerUI;



/**
 *
 * @author user
 */

public class Main extends Thread{
    
    @Override
    public void run() {
        new MerchManagerUI().setVisible(true);
    }
                    
    public static void main(String[] args) {
        
        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
                
//        for (int i = 0; i < 1000; i+=100) {
//            requestDataBase.addMerch(new Merch(0, "name1", "desc1", "", 12, i, i, 30));
//        }
        Thread main = new Main();
        main.run();
    }
    
  }
