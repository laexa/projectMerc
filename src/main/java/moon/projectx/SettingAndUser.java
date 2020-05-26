/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;

import java.io.File;

/**
 *
 * @author user
 */
public class SettingAndUser {
    
    public static class Setting{
        
        File path = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString());
        public static String URL              = "jdbc:mysql://";
        public static String USERNAME         = "root";
        public static String PASSWORD         = "12345678";
        public static String IPADDRESS        = "localhost";
        public static String PORT             = "3306";
        public static String NAMEDATABASE     = "maindb";
        public static String TIMEZONESETTING  = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//        public static String PATHE            = path.getParent();
       
    }
    
    public static class User{
        public static int userId;
        public static String userName = "TestName";
        public static String userLastName = "TestLastName";
        public static int userType;
        public static String userLogin;
        public static String userPassword;
    }
    
}
