/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.manager;

import javax.swing.JOptionPane;
import moon.projectx.UI.TableModel.CustomerTableModel;
import moon.projectx.UI.TableModel.CustomerAndDiscountCardTableModel;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.UI.AddAndEditUI.AddCustomerUI;
import moon.projectx.UI.AddAndEditUI.EditCustomerUI;
import moon.projectx.UI.AddAndEditUI.EditCustomerUI;
import moon.projectx.UI.AddAndEditUI.EditCustomerUI;
import moon.projectx.objectTable.Customer;


/**
 *
 * @author user
 */
public class CustomerManagerUI extends javax.swing.JFrame {
    
    ConnectionDataBase connectionDataBase;
    RequestDataBase requestDataBase;
    CustomerAndDiscountCardTableModel customerAndDiscountCardModel;

    
    AddCustomerUI addCustomerUI = new AddCustomerUI();
    EditCustomerUI editCustomerUI = new EditCustomerUI();
    Customer customer = new Customer();
    Thread mainThread;
    EditCustomerUI editCustomerUi = new EditCustomerUI();
    
    
    
    public CustomerManagerUI() {
        
        initComponents();
        
        connectionDataBase = new ConnectionDataBase();
        customerAndDiscountCardModel = new CustomerAndDiscountCardTableModel();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        customerTable.setModel(customerAndDiscountCardModel);
        customerAndDiscountCardModel.refreshData(requestDataBase.getAllCustomerAndDiscountCard());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        addCustomerButton = new javax.swing.JButton();
        editCustomerButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Меню покупців");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.setAutoscrolls(false);
        customerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        customerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        customerTable.setShowGrid(true);
        jScrollPane1.setViewportView(customerTable);

        addCustomerButton.setText("Добавити");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        editCustomerButton.setText("Редагувати");
        editCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerButtonActionPerformed(evt);
            }
        });

        deleteCustomerButton.setText("Видалити");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Вихід");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(deleteCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(editCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(288, 288, 288)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
       
        
        mainThread = new Thread(){
            @Override
            public void run() {
                addCustomerUI.setVisible(rootPaneCheckingEnabled); 
            }
        };
        mainThread.run();
        
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void editCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerButtonActionPerformed
        if (editCustomerUi.isVisible() == false) {
            editCustomerUi.dispose();
            editCustomerUi = null;
            System.gc();
            
            editCustomerUi = new EditCustomerUI();
        }
        
        if (customerTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Виберіть Покупця");
        } else {
            
            Object tmp = new Object();
            
            tmp = customerTable.getModel().getValueAt(customerTable.getSelectedRow(), 0);
            customer.setId(Integer.valueOf(tmp.toString()));
            
            tmp = customerTable.getModel().getValueAt(customerTable.getSelectedRow(), 1);
            customer.setName(tmp.toString());
            
            tmp = customerTable.getModel().getValueAt(customerTable.getSelectedRow(), 2);
            customer.setLastName(tmp.toString());
            
            tmp = customerTable.getModel().getValueAt(customerTable.getSelectedRow(), 3);
            customer.setNumberPhone(tmp.toString());
            
            editCustomerUi.sendCustomer(customer);
            editCustomerUi.setVisible(rootPaneCheckingEnabled);
            
            
        }
    }//GEN-LAST:event_editCustomerButtonActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed
        // TODO add your handling code here:
        
        if(customerTable.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Виберіть Покупця");
        }else {
            connectionDataBase.connect();
            requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
            
            Object tmp = customerTable.getModel().getValueAt(customerTable.getSelectedRow(), 0);
            requestDataBase.deleteCustomer(Integer.valueOf(tmp.toString()));
            
            customerAndDiscountCardModel = new CustomerAndDiscountCardTableModel();
            customerTable.setModel(customerAndDiscountCardModel);
            customerAndDiscountCardModel.refreshData(requestDataBase.getAllCustomerAndDiscountCard());
        }
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if(mainThread.isAlive() == false){
            mainThread.stop();
        }
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        customerAndDiscountCardModel = new CustomerAndDiscountCardTableModel();
        customerTable.setModel(customerAndDiscountCardModel);
        customerAndDiscountCardModel.refreshData(requestDataBase.getAllCustomerAndDiscountCard());
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JButton editCustomerButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}