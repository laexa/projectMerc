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
import moon.projectx.UI.SaleMenuUI;
import moon.projectx.UI.manager.CategoryManagerUI;
import moon.projectx.UI.manager.CustomerManagerUI;
import moon.projectx.UI.manager.MerchManagerUI;
import moon.projectx.UI.manager.StatManagerUI;



/**
 *
 * @author user
 */

public class Main extends Thread{
    
    @Override
    public void run() {
        new StatManagerUI().setVisible(true);
//        new StatManagerUI().setVisible(true);
//        new SaleMenuUI().setVisible(true);
//        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
//        connectionDataBase.connect();
//        RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
//        Statistics stat = new Statistics(0,"name",9, 2, 22, null, 5,1, 22);
//        requestDataBase.addStat(stat);
//        System.out.println(stat.toString());

    }
                    
    public static void main(String[] args) {
        Thread main = new Main();
        main.run();
    }
    
  }
