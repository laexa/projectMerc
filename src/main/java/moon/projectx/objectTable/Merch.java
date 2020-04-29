/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.objectTable;

/**
 *
 * @author user
 */
public class Merch {
    private int id;
    private String name;
    private String desc;
    private String category;
    private int categoryId;
    private int price;
    private int count;
    private int percent;

    public Merch() {
    }

    public Merch(int id, String name, String desc, String category, int categoryId, int price, int count, int percent) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.categoryId = categoryId;
        this.price = price;
        this.count = count;
        this.percent = percent;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Merch{" + "id=" + id + ", name=" + name + ", desc=" + desc + ", category=" + category + ", categoryId=" + categoryId + ", price=" + price + ", count=" + count + ", percent=" + percent + '}';
    }
    
}
