/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.AddAndEditUI;

import javax.swing.JOptionPane;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.objectTable.Merch;
import org.apache.commons.lang3.math.NumberUtils;
import moon.projectx.UI.manager.CategoryManagerUI;


public class AddMerchUI extends javax.swing.JFrame {
    
    CategoryManagerUI categoryManagerUI = new CategoryManagerUI();
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();
    RequestDataBase requestDataBase;
    Merch merch = new Merch();
    
   
    public AddMerchUI() {
        
        initComponents();
        
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        categoryMerchList.setModel(requestDataBase.getNameCategory());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryMerchList = new javax.swing.JList<>();
        nameMerchTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descMerchTextArea = new javax.swing.JTextArea();
        priceMerchTextField = new javax.swing.JTextField();
        countMerchTextField = new javax.swing.JTextField();
        percentMerchTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        categoryManagerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        jLabel1.setText("Додавання товару");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Імя товару ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Короткий опис товару");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Кількість товару");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Ціна товару");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Знижка на товар");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Категорія товару");

        categoryMerchList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(categoryMerchList);

        descMerchTextArea.setColumns(20);
        descMerchTextArea.setRows(5);
        jScrollPane2.setViewportView(descMerchTextArea);

        addButton.setText("Додати");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Вийти");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        categoryManagerButton.setText("Меню категорій товару");
        categoryManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryManagerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(categoryManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameMerchTextField)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(priceMerchTextField)
                            .addComponent(countMerchTextField)
                            .addComponent(percentMerchTextField)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameMerchTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(priceMerchTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(countMerchTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentMerchTextField)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(93, 93, 93)
                        .addComponent(categoryManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        if(categoryMerchList.getSelectedIndex() != -1) {
            
            if(NumberUtils.isNumber(countMerchTextField.getText())){
                if(NumberUtils.isNumber(priceMerchTextField.getText())){
                    if(NumberUtils.isNumber(percentMerchTextField.getText())){
                        
                       Merch merch = new Merch();
                       merch.setName(nameMerchTextField.getText());
                       merch.setDesc(descMerchTextArea.getText());
                       
                       merch.setPercent(Integer.valueOf(percentMerchTextField.getText()));
                       merch.setPrice(Integer.valueOf(priceMerchTextField.getText()));
                       merch.setCount(Integer.valueOf(countMerchTextField.getText()));
                       merch.setCategoryId(requestDataBase.getIdCategory(categoryMerchList.getSelectedValue()));
                       
                       requestDataBase.addMerch(merch);
                       
                       JOptionPane.showMessageDialog(null, "Товар Доданий");
                       
                    }else{
                        JOptionPane.showMessageDialog(null, "В рядку знижка на товар має бути лише цілочисельне число");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "В рядку ціна товару має бути лише цілочисельне число");
                }
            } else {
                JOptionPane.showMessageDialog(null, "В рядку кількість товару має бути лише цілочисельне число");
            }
        }else {
            
            JOptionPane.showMessageDialog(null, "Виберіть категорію товару");
            
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void categoryManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryManagerButtonActionPerformed
      categoryManagerUI.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_categoryManagerButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton categoryManagerButton;
    private javax.swing.JList<String> categoryMerchList;
    private javax.swing.JTextField countMerchTextField;
    private javax.swing.JTextArea descMerchTextArea;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameMerchTextField;
    private javax.swing.JTextField percentMerchTextField;
    private javax.swing.JTextField priceMerchTextField;
    // End of variables declaration//GEN-END:variables
}
