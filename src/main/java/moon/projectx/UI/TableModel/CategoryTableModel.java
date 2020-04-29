/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import moon.projectx.objectTable.Category;
/**
 *
 * @author user
 */
public class CategoryTableModel extends AbstractTableModel{
    
    private int columnCount = 2;
    private ArrayList<String []> dataArrayList; 

    public CategoryTableModel() {
        dataArrayList = new ArrayList<String []>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);            
        }
    }
    
    public void refreshData(ArrayList<Category> categoryRow){
        String[] rowTable = new String[getColumnCount()];
        Category category = new Category();
        
        for (int i = 0; i < categoryRow.size(); i++) {
            rowTable = categoryRow.get(i).getCategoryArray();
            dataArrayList.add(rowTable);
        }
        
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "id";
            case 1: return "name";            
        }
        return "";
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }
    
}
