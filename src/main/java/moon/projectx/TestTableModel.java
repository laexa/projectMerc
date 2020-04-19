/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.AbstractTableModel;
import moon.projectx.objectTable.User;

/**
 *
 * @author user
 */
public class TestTableModel extends AbstractTableModel{
    
    private int coulumCount = 6;
    private ArrayList<String []> dataArrayList;
    
    public TestTableModel(){
        dataArrayList = new ArrayList<String []>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    public void addDate(User [] userRow){
        String[] rowTable = new String[getColumnCount()];    
        for (int i = 0; i < userRow.length; i++) {
            rowTable = userRow[i].getUserArray();
            dataArrayList.add(rowTable);
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "id";
            case 1: return "name";
            case 2: return "lastName";
            case 3: return "type";
            case 4: return "login";
            case 5: return "password";
        }
        return "";
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return coulumCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String []rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }
    
}
