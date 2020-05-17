/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import moon.projectx.objectTable.CustomerAndDiscountCard;

/**
 *
 * @author alex
 */
public class CustomerAndDiscountCardTableModel extends  AbstractTableModel{
    
    private int columnCount = 6;
    private ArrayList<String []> dataArrayList;
    
    public CustomerAndDiscountCardTableModel() {
        dataArrayList = new ArrayList<>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    public void refreshData(ArrayList<CustomerAndDiscountCard> customerAndDiscountCardsRow){
        String[] rowTable = new String[getColumnCount()];
        CustomerAndDiscountCard customerAndDiscountCard = new CustomerAndDiscountCard();
        
        for (int i = 0; i < customerAndDiscountCardsRow.size(); i++) {
            rowTable = customerAndDiscountCardsRow.get(i).getCustomerArray();
            dataArrayList.add(rowTable);
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0: return "id";
            case 1: return "Імя";
            case 2: return "Призвіще";
            case 3: return "Номер телефона";
            case 4: return "Скидочна карта";
            case 5: return "Відсоток";
        }
        return "";
    }
    
    @Override
    public int getRowCount() {
        return  dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[]  rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }
    
    
}
