/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import moon.projectx.objectTable.Statistics;

/**
 *
 * @author user
 */
public class StatisticsTableModel extends AbstractTableModel{

    private int columnCount = 6;
    private ArrayList<String []> dataArrayList;

    public StatisticsTableModel() {
        dataArrayList = new ArrayList<String []>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    public void refreshData(ArrayList<Statistics> statRow){
        String[] rowTable = new String[getColumnCount()];
        Statistics stat = new Statistics();
        
        for (int i = 0; i < statRow.size(); i++) {
            rowTable = statRow.get(i).getStatArray();
            dataArrayList.add(rowTable);
        }
    }
    @Override
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "id";
            case 1: return "name";
            case 2: return "category";
            case 3: return "price";
            case 4: return "count";
            case 5: return "date";
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
