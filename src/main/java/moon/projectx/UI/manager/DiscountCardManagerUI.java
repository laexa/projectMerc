/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.manager;

import javax.swing.JOptionPane;
import moon.projectx.UI.AddAndEditUI.AddDiscountCardUI;

import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.UI.TableModel.DiscountCardTableModel;
import moon.projectx.UI.AddAndEditUI.EditDiscountCardUI;
import moon.projectx.objectTable.DiscountCard;
/**
 *
 * @author user
 */
public class DiscountCardManagerUI extends javax.swing.JFrame {
    DiscountCardTableModel discountCardTableModel;
    AddDiscountCardUI addDiscountCardUI = new AddDiscountCardUI();
    EditDiscountCardUI editDiscountCardUI = new EditDiscountCardUI();
    ConnectionDataBase connectionDataBase;
    RequestDataBase requestDataBase;
    /**
     * Creates new form DiscountCardManagerUI
     */
    public DiscountCardManagerUI() {
        
        initComponents();
        connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        discountCardTableModel = new DiscountCardTableModel();
        discountCardTable.setModel(discountCardTableModel);
        discountCardTableModel.refreshData(requestDataBase.getAllDiscountCard());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        discountCardTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                DiscountCardManagerUI.this.windowActivated(evt);
            }
        });

        discountCardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        discountCardTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(discountCardTable);

        jLabel1.setText("Менеджер Знижкових Карток");

        addButton.setText("Додати");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Редагувати");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Видалити");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Вихід");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(265, 265, 265)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addDiscountCardUI.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_addButtonActionPerformed

    private void windowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowActivated
        // TODO add your handling code here:
        connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        discountCardTableModel = new DiscountCardTableModel();
        discountCardTable.setModel(discountCardTableModel);
        discountCardTableModel.refreshData(requestDataBase.getAllDiscountCard());
    
    }//GEN-LAST:event_windowActivated

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(editDiscountCardUI.isVisible() == false) {
            editDiscountCardUI.dispose();
            editDiscountCardUI = null;
            System.gc();
            editDiscountCardUI = new EditDiscountCardUI();
        }
        
        if (discountCardTable.getSelectedRow() == -1 ){
            JOptionPane.showMessageDialog(null, "Виберіть користувача");
        } else{
            
        Object tmp = new Object();
        
        tmp = discountCardTable.getModel().getValueAt(discountCardTable.getSelectedRow(), 0);
        DiscountCard discountCard = new DiscountCard();
        discountCard.setId(Integer.valueOf(tmp.toString()));
        discountCard.setName(String.valueOf(discountCardTable.getModel().getValueAt(discountCardTable.getSelectedRow(), 1)));
        tmp = discountCardTable.getModel().getValueAt(discountCardTable.getSelectedRow(), 2);
        discountCard.setPercent(Integer.valueOf(tmp.toString()));
        
        editDiscountCardUI.sendDiscountCard(discountCard);
        editDiscountCardUI.setVisible(rootPaneCheckingEnabled);
        }
        
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (discountCardTable.getSelectedRow() == -1 ){
            JOptionPane.showMessageDialog(null, "Виберіть користувача");
        } else{
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
            
            Object tmp = new Object();
            tmp = discountCardTable.getModel().getValueAt(discountCardTable.getSelectedRow(), 0);
            requestDataBase.deleteDiscountCard(Integer.valueOf(tmp.toString()));
            
            discountCardTableModel = new DiscountCardTableModel();
            discountCardTable.setModel(discountCardTableModel);
            discountCardTableModel.refreshData(requestDataBase.getAllDiscountCard());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable discountCardTable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
