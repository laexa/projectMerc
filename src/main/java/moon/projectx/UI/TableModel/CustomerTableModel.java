/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import moon.projectx.objectTable.Customer;
/**
 *
 * @author user
 */
public class CustomerTableModel extends AbstractTableModel{

    private int columnCount = 5;
    private ArrayList<String []> dataArryaList;

    public CustomerTableModel() {
        dataArryaList = new ArrayList<>();
        for (int i = 0; i < dataArryaList.size(); i++) {
            dataArryaList.add(new String[getColumnCount()]);
        }
    }
    
    public void refreshData(ArrayList<Customer> customerRow) {
        String[] rowTable = new String[getColumnCount()];
        Customer customer = new Customer();
        
        for (int i = 0; i < customerRow.size(); i++) {
            rowTable = customerRow.get(i).getCustomerArray();
            dataArryaList.add(rowTable);
        }
    }
    
    @Override
    public String getColumnName(int coumnIndex) {
        switch(coumnIndex) {
            case 0: return "id";
            case 1: return "Імя";
            case 2: return "Призвіще";
            case 3: return "Номер телефона";
            case 4: return "Скидочна карта ID";
            
        }
        return "";
    }
    
    @Override
    public int getRowCount() {
        return dataArryaList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[]  rows = dataArryaList.get(rowIndex);
        return rows[columnIndex];
    }
    
}
