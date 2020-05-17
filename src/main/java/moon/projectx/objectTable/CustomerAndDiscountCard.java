/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.objectTable;

/**
 *
 * @author alex
 */
public class CustomerAndDiscountCard {
    private int id;
    private String name;
    private String lastName;
    private String numberPhone;
    private String nameDiscountCard;
    private int percentDiscountCard;

    public CustomerAndDiscountCard() {
        
    }

    public CustomerAndDiscountCard(int id, String name, String lastName, String numberPhone, String nameDiscountCard, int percentDiscountCard) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.nameDiscountCard = nameDiscountCard;
        this.percentDiscountCard = percentDiscountCard;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNameDiscountCard() {
        return nameDiscountCard;
    }

    public void setNameDiscountCard(String nameDiscountCard) {
        this.nameDiscountCard = nameDiscountCard;
    }

    public int getPercentDiscountCard() {
        return percentDiscountCard;
    }

    public void setPercentDiscountCard(int percentDiscountCard) {
        this.percentDiscountCard = percentDiscountCard;
    }
    
    
    public String[] getCustomerArray() {
        String[] customer = new String[6];
        customer[0] = String.valueOf(id);
        customer[1] = name;
        customer[2] = lastName;
        customer[3] = numberPhone;
        customer[4] = nameDiscountCard;
        customer[5] = String.valueOf(percentDiscountCard);
        return customer;        
    }
}
