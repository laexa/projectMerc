/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.TableModel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import moon.projectx.objectTable.User;

/**
 *
 * @author user
 */
public class UserTableModel extends AbstractTableModel{
    
    private int columnCount = 6;
    private ArrayList<String []> dataArrayList;

    public UserTableModel() {
        dataArrayList = new ArrayList<String []>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    public void refreshDate(ArrayList<User> userRow) {
        String[] rowTable = new String[getColumnCount()];
        User user = new User();
        
        for (int i = 0; i < userRow.size(); i++) {
            user = userRow.get(i);
            if(user.getType() == 0){
                user.setTypeString("Адмін");
            }
            else user.setTypeString("Користувач");
            userRow.remove(i);
            userRow.add(i, user);
            user = null;
        }
        
        for (int i = 0; i < userRow.size(); i++) {
            rowTable = userRow.get(i).getUserArray();
            dataArrayList.add(rowTable);
        }
    }
    
    @Override
    public String getColumnName(int coumnIndex) {
        switch(coumnIndex) {
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
        return  dataArrayList.size();
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
