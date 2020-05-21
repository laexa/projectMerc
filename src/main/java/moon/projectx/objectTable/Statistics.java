/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.objectTable;

import java.sql.Date;

/**
 *
 * @author user
 */
public class Statistics {
    
    private int id;
    private String name;    
    private String category;
    private String customer;
    private String user;
    private int categoryId;
    private int price;
    private int count;
    private Date date;
    private int customerId;
    private int userId;
    private int merchId;
    private String dateString;
    

    public Statistics() {
        
    }

    public Statistics(int id, String name, int categoryId, int price, int count, Date date, int customerId, int userId, int merchId) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.price = price;
        this.count = count;
        this.date = date;
        this.customerId = customerId;
        this.userId = userId;
        this.merchId = merchId;
    }
    
    

    public Statistics(int id, String name, String category, int categoryId, int price, int count, Date date, int customerId, int userId, int merchId) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.categoryId = categoryId;
        this.price = price;
        this.count = count;
        this.date = date;
        this.customerId = customerId;
        this.userId = userId;
        this.merchId = merchId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMerchId() {
        return merchId;
    }

    public void setMerchId(int merchId) {
        this.merchId = merchId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    
    
    public String[] getStatArray() {
        String[] stat = new String[9];
        stat[0] = String.valueOf(id);
        stat[1] = name;
        stat[2] = category;
        stat[3] = String.valueOf(count);
        stat[4] = String.valueOf(price);
        stat[5] = date.toString();
        stat[6] = customer;
        stat[7] = user;
        stat[8] = String.valueOf(merchId);
        return stat;
    }

    @Override
    public String toString() {
        return "Statistics{" + "id=" + id + ", name=" + name + ", category=" + category + ", categoryId=" + categoryId + ", price=" + price + ", count=" + count + ", date=" + date + ", customerId=" + customerId + ", userId=" + userId + ", merchId=" + merchId + '}';
    }  
    
}
