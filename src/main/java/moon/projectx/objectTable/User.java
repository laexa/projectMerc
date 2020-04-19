/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.objectTable;

/**
 * Клас який поточно повторює дані з таблиці user з бази даних
 * @author user
 */

import java.util.Arrays;

public class User {
    
    private int     id;
    private String  name;
    private String  lastName;
    private int     type;
    private String  login;
    private String  password;

    public User() {
    }

    public User(String name, String lastName, int type, String login, String password) {
        this.name = name;
        this.lastName = lastName;
        this.type = type;
        this.login = login;
        this.password = password;
    }

    public User(int id, String name, String lastName, int type, String login, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.type = type;
        this.login = login;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   public String[] getUserArray() {
       String[] user = new String[6];
       user[0] = String.valueOf(id);
       user[1] = name;
       user[2] = lastName;
       user[3] = String.valueOf(type);
       user[4] = login;
       user[5] = password;
       return user;
   }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", type=" + type + ", login=" + login + ", password=" + password + '}';
    }
      
}
