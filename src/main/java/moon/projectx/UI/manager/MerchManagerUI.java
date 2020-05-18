/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.manager;


import javax.swing.JOptionPane;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.objectTable.Merch;
import moon.projectx.UI.TableModel.MerchTableModel;
import moon.projectx.UI.AddAndEditUI.AddMerchUI;
import moon.projectx.UI.AddAndEditUI.EditMerchUI;


/**
 *
 * @author user
 */
public class MerchManagerUI extends javax.swing.JFrame {
    
    ConnectionDataBase connectionDataBase;
    RequestDataBase requestDataBase;
    MerchTableModel merchTableModel;
    AddMerchUI addMerchUI;
    EditMerchUI editMerchUI = new EditMerchUI();
    
    public MerchManagerUI() {
        
        initComponents();
        
        priceButtonGroup.add(priceLargeRadioButton);
        priceButtonGroup.add(priceLessRadioButton);
        
        countButtonGroup.add(countLargeRadioButton);
        countButtonGroup.add(countLessRadioButton);
        
        connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        merchTableModel = new MerchTableModel();
        table.setModel(merchTableModel);
        merchTableModel.refreshData(requestDataBase.getAllMerch());
        
        categoryList.setModel(requestDataBase.getNameCategory());
        System.out.println("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        priceButtonGroup = new javax.swing.ButtonGroup();
        countButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceLargeRadioButton = new javax.swing.JRadioButton();
        countLessRadioButton = new javax.swing.JRadioButton();
        countLargeRadioButton = new javax.swing.JRadioButton();
        priceLessRadioButton = new javax.swing.JRadioButton();
        resetFilterButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addButton.setText("Добавити");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        editButton.setText("Редагувати");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteButton.setText("Видалити");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        exitButton.setText("Вийти");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 16)); // NOI18N
        jLabel1.setText("Меню товарів");

        categoryList.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        categoryList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        categoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        categoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                categoryListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(categoryList);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Категорія");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Ціна");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Кількість");

        priceLargeRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        priceLargeRadioButton.setText("Дорогі");
        priceLargeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLargeRadioButtonActionPerformed(evt);
            }
        });

        countLessRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        countLessRadioButton.setText("Менше");
        countLessRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countLessRadioButtonActionPerformed(evt);
            }
        });

        countLargeRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        countLargeRadioButton.setText("Більше");
        countLargeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countLargeRadioButtonActionPerformed(evt);
            }
        });

        priceLessRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        priceLessRadioButton.setText("Дешеві");
        priceLessRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLessRadioButtonActionPerformed(evt);
            }
        });

        resetFilterButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        resetFilterButton.setText("Скинути фільтри");
        resetFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFilterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addGap(237, 237, 237))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(priceLargeRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(priceLessRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(countLargeRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(14, 14, 14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                .addGap(24, 24, 24))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(countLessRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resetFilterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLargeRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(countLargeRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countLessRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceLessRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(resetFilterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void priceLessRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceLessRadioButtonActionPerformed
        
        if(countLargeRadioButton.isSelected()){
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceASCandCountDESC());
            
        } else if(countLessRadioButton.isSelected()){
            //дешеві і менше кількість
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchCountAndPriceASC());
            
        } else if(countLargeRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){
            //ціна менша кільікість більше вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("asc", "desc", categoryList.getSelectedValue()));
            
        } else if(countLessRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){ 
            //ціна менше кільікість менше вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("asc", "asc", categoryList.getSelectedValue()));
            
        }else {
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceASC());
        }
    }//GEN-LAST:event_priceLessRadioButtonActionPerformed

    private void priceLargeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceLargeRadioButtonActionPerformed
        if (countLessRadioButton.isSelected()) {
            
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceDescAndCountAsc());
            
        } else if (countLargeRadioButton.isSelected()){
            // ціна більше кількість більше           
            
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceDescAndCountDesc());
            
        }else if (countLessRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){
            //ціна більше кількість менше вибрана категорія 
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("desc", "asc", categoryList.getSelectedValue()));
            
        }else if(countLargeRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){
            //ціна більше кількість більше вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("desc", "desc", categoryList.getSelectedValue()));
            
        }else{connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceDESC());
        }
    }//GEN-LAST:event_priceLargeRadioButtonActionPerformed

    private void resetFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFilterButtonActionPerformed
        priceButtonGroup.clearSelection();
        countButtonGroup.clearSelection();
        categoryList.clearSelection();
        
        connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        merchTableModel = new MerchTableModel();
        table.setModel(merchTableModel);
        merchTableModel.refreshData(requestDataBase.getAllMerch());
    }//GEN-LAST:event_resetFilterButtonActionPerformed

    private void countLargeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countLargeRadioButtonActionPerformed
        if(priceLargeRadioButton.isSelected()){
            
            //ціна більше кількість більше
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceDescAndCountDesc());
            
        }else if (priceLessRadioButton.isSelected()){
            
            //ціна менше кількість білше
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceASCandCountDESC());
            
        }else if (priceLargeRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){    
            // ціна більша кількість більше вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("desc", "desc", categoryList.getSelectedValue()));
            
        }else if (priceLessRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){
            // ціна менше кількість більше вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("asc", "desc", categoryList.getSelectedValue()));
            
        }else{
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchCountDesc());
        }
    }//GEN-LAST:event_countLargeRadioButtonActionPerformed

    private void countLessRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countLessRadioButtonActionPerformed
        
        
        if (priceLargeRadioButton.isSelected()) {
            
            //Ціна більша кілікість менша 
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceDescAndCountAsc());
            
        }else if (priceLessRadioButton.isSelected()){
            
            //ціна менше кількість менша 
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchCountAndPriceASC());
            
        }else if (priceLargeRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){
            //ціна більша кількість менша вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("desc", "asc", categoryList.getSelectedValue()));
        }else if(priceLessRadioButton.isSelected() && categoryList.getSelectedIndex() != -1){
            //ціна менша кількість менша вибрана категорія
            
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchPriceCountCategory("asc", "asc", categoryList.getSelectedValue()));
        }else{
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchCountASC());
        }
    }//GEN-LAST:event_countLessRadioButtonActionPerformed

    private void categoryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_categoryListValueChanged
            connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());

            merchTableModel = new MerchTableModel();
            table.setModel(merchTableModel);
            merchTableModel.refreshData(requestDataBase.getAllMerchCategory(categoryList.getSelectedValue()));
    }//GEN-LAST:event_categoryListValueChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addMerchUI = new AddMerchUI();
        addMerchUI.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(table.getSelectedRow() != -1 ){
            Object o = new Object();
            o = table.getModel().getValueAt(table.getSelectedRow(), 0);
            String tmp = o.toString();
            requestDataBase.deleteMerch(Integer.valueOf(tmp));
            
            merchTableModel.refreshData(requestDataBase.getAllMerch());
            
        }JOptionPane.showMessageDialog(null, "Виберіть товар який ви хочете видалити");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        merchTableModel = new MerchTableModel();
        table.setModel(merchTableModel);
        merchTableModel.refreshData(requestDataBase.getAllMerch());
    }//GEN-LAST:event_formWindowActivated

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        if(table.getSelectedRow() != -1){
            Merch merch = new Merch();
            Object o = new Object();

            o = table.getModel().getValueAt(table.getSelectedRow(), 0);
            merch.setId(Integer.valueOf(o.toString()));
            
            o = table.getModel().getValueAt(table.getSelectedRow(), 1);
            merch.setName(o.toString());
            
            o = table.getModel().getValueAt(table.getSelectedRow(), 2);
            merch.setDesc(o.toString());
            
            o = table.getModel().getValueAt(table.getSelectedRow(), 4);
            merch.setPrice(Integer.valueOf(o.toString()));
            
            o = table.getModel().getValueAt(table.getSelectedRow(), 5);
            merch.setCount(Integer.valueOf(o.toString()));
            
            o = table.getModel().getValueAt(table.getSelectedRow(), 6);
            merch.setPercent(Integer.valueOf(o.toString()));
            
            if(editMerchUI.isVisible() == false){
                editMerchUI.dispose();
                editMerchUI = null;
                System.gc();
                editMerchUI = new EditMerchUI();
            }
                editMerchUI.sendMerch(merch);
                editMerchUI.setVisible(rootPaneCheckingEnabled);
            
            
        }
    }//GEN-LAST:event_editButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JList<String> categoryList;
    private javax.swing.ButtonGroup countButtonGroup;
    private javax.swing.JRadioButton countLargeRadioButton;
    private javax.swing.JRadioButton countLessRadioButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup priceButtonGroup;
    private javax.swing.JRadioButton priceLargeRadioButton;
    private javax.swing.JRadioButton priceLessRadioButton;
    private javax.swing.JButton resetFilterButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
