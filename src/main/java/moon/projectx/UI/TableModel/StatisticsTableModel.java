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

    private int columnCount = 9;
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
            case 1: return "Імя";
            case 2: return "Категорія";
            case 3: return "Кількість";
            case 4: return "Ціна";
            case 5: return "Дата";
            case 6: return "Покупець";
            case 7: return "Робітник";
            case 8: return "Товар";
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
