/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;



import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import moon.projectx.PDFGenerator.PDFGeneretor;
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
    

      
       
                    
    public static void main(String[] args) {
//        JFileChooser fileopen = new JFileChooser();
//        fileopen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int ret = fileopen.showDialog(null, "");                
//        if (ret == JFileChooser.APPROVE_OPTION) {
//        File file = fileopen.getSelectedFile();
//        System.out.println(fileopen.getSelectedFile().getAbsolutePath());
//        File path = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString());
        
        
//       JOptionPane.showMessageDialog(null, path.getParent());
//        new LoginUI().setVisible(true);
        
    /*
     * Какие-то действия.
     */ 
    java.util.Date date = new java.util.Date();
        switch (Util.getOS()) {
            case WINDOWS:
                System.out.println("Windows");
                
                break;
            case MAC:
                System.out.println("Mac OS");
                break;
        }
        System.out.println();
    }  
}
