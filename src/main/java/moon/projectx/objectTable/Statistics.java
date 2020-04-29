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
    private int categoryId;
    private int price;
    private int count;
    private Date date;

    public Statistics() {
        
    }

    public Statistics(int id, String name, int categoryId, int price, int count) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.price = price;
        this.count = count;
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
    
    public String[] getStatArray() {
        String[] stat = new String[6];
        stat[0] = String.valueOf(id);
        stat[1] = name;
        stat[2] = category;
        stat[3] = String.valueOf(count);
        stat[4] = String.valueOf(price);
        stat[5] = date.toString();
        return stat;
    }

    @Override
    public String toString() {
        return "Statistics{" + "id=" + id + ", name=" + name + ", category=" + category + ", categoryId=" + categoryId + ", price=" + price + ", count=" + count + ", date=" + date + '}';
    }
    
    
}
