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
import moon.projectx.driver.RequestDataBase;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.UI.LoginUI;
import moon.projectx.UI.NewJFrame;


/**
 *
 * @author user
 */

public class Main {
                    
    public static void main(String[] args) {
        
        User user = new User("11111", "1111", 1, "111", "111");
        
        
        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
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
