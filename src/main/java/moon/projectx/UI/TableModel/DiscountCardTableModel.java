/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import moon.projectx.objectTable.DiscountCard;

/**
 *
 * @author user
 */
public class DiscountCardTableModel extends AbstractTableModel{

    int columnCount = 3;
    ArrayList<String[]> dataArrayList;

    public DiscountCardTableModel() {
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    public void refreshData(ArrayList<DiscountCard> disCardRow) {
        String[] rowTable = new String[getColumnCount()];
        DiscountCard discountCard = new DiscountCard();
        
        for (int i = 0; i < disCardRow.size(); i++) {
            rowTable = disCardRow.get(i).getDiscountCardArray();
            dataArrayList.add(rowTable);
        }
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