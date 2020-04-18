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
public class Customer {
    
    private int id;
    private String name;
    private String lastName;
    private int numberPhone;
    private int discountCardId;

    public Customer() {
    }
    
    public Customer(String name, String lastName, int numberPhone, int discountCardId) {
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.discountCardId = discountCardId;
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

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getDiscountCardId() {
        return discountCardId;
    }

    public void setDiscountCardId(int discountCardId) {
        this.discountCardId = discountCardId;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", numberPhone=" + numberPhone + ", discountCardId=" + discountCardId + '}';
    }
    
}
