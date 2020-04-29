/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import moon.projectx.objectTable.Merch;
/**
 *
 * @author user
 */
public class MerchTableModel extends AbstractTableModel{
    
    private int columnCount  = 7;
    private ArrayList<String []> dataArrayList;

    public MerchTableModel() {
        dataArrayList = new ArrayList<String []>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    public void refreshData(ArrayList<Merch> merchRow){
        String[] rowTable = new String[getColumnCount()];
        Merch merch = new Merch();
        
        for (int i = 0; i < merchRow.size(); i++) {
            rowTable = merchRow.get(i).getMerchArray();
            dataArrayList.add(rowTable);
            
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "id";
            case 1: return "name";
            case 2: return "desc";
            case 3: return "category";
            case 4: return "price";
            case 5: return "count";
            case 6: return "percent";            
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
