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

//to do: Треба переписати клас картами і добавити рядок з  процентами по карті
public class DiscountCard {
    
    private int id;
    private String name;

    public DiscountCard() {
    }

    public DiscountCard(int id, String name) {
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

    @Override
    public String toString() {
        return "DiscountCard{" + "id=" + id + ", name=" + name + '}';
    }
    
}
