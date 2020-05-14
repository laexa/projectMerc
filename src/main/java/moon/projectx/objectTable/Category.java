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
public class Category {
    
    private int id;
    private String name;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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
    
    public String[] getCategoryArray(){
        String[] category = new String[2];
        category[0] = String.valueOf(id);
        category[1] = name;
        
        return category;
    }
    
    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + '}';
    }
    
}
