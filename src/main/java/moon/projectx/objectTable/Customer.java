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
    private String numberPhone;
    private int discountCardId;

    public Customer() {
    }
    
    public Customer(String name, String lastName, String numberPhone, int discountCardId) {
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getDiscountCardId() {
        return discountCardId;
    }

    public void setDiscountCardId(int discountCardId) {
        this.discountCardId = discountCardId;
    }
    
    public String[] getCustomerArray() {
        String[] customer = new String[5];
        customer[0] = String.valueOf(id);
        customer[1] = name;
        customer[2] = lastName;
        customer[3] = numberPhone;
        customer[4] = String.valueOf(discountCardId);
                
        return customer;        
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", numberPhone=" + numberPhone + ", discountCardId=" + discountCardId + '}';
    }
    
}
