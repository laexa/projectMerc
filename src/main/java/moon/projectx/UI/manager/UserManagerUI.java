/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.manager;


import javax.swing.JOptionPane;
import moon.projectx.UI.TableModel.UserTableModel;
import moon.projectx.UI.UserUI.AddUserUI;
import moon.projectx.UI.UserUI.EditUserUI;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.objectTable.User;

/**
 *
 * @author user
 */
public class UserManagerUI extends javax.swing.JFrame {
    UserTableModel userTableModel;
    ConnectionDataBase connectionDataBase;
    RequestDataBase requestDataBase;
    AddUserUI addUserUI = new AddUserUI();
    EditUserUI editUserUI = new EditUserUI();

    
    /**
     * Creates new form UserManagerUI
     */
    public UserManagerUI() {
        initComponents();
        connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        userTableModel = new UserTableModel();
        userTable.setModel(userTableModel);
        userTableModel.refreshData(requestDataBase.getAllUser());
        
        
        
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
        userTable = new javax.swing.JTable();
        addUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                focusWindowRefreshData(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Меню користувачів");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userTable.setAutoscrolls(false);
        userTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userTable.setShowGrid(true);
        jScrollPane1.setViewportView(userTable);

        addUserButton.setText("Добавити");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        editUserButton.setText("Редагувати");
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        deleteUserButton.setText("Видалити");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
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
                        .addComponent(addUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(editUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
        
        if (userTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Виберіть користувача");
        } else{
            connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        Object tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 0);
        System.out.println(tmp.toString());
        
        requestDataBase.deleteUser(Integer.valueOf(tmp.toString()));
        
        
        userTableModel = new UserTableModel();
        userTable.setModel(userTableModel);
        userTableModel.refreshData(requestDataBase.getAllUser());
        
        }
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
        addUserUI.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        // TODO add your handling code here:
       if (editUserUI.isVisible() == true) {
           editUserUI.dispose();
           editUserUI = null;
           System.gc();
           editUserUI = new EditUserUI();
       }
       
        if (userTable.getSelectedRow() == -1 ){
            JOptionPane.showMessageDialog(null, "Виберіть користувача");
        } else{
           
       
            User user = new User();
            Object tmp;
            
             tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 0);
            user.setId(Integer.valueOf(tmp.toString()));
            
            tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 1);
            user.setName(tmp.toString());
            
            tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 2);
            user.setLastName(tmp.toString());
            
            tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 3);
            user.setTypeString(tmp.toString());
            if(tmp.toString() == "Адмін") {
                user.setType(0);
            } else{
                user.setType(1);
            }
            
            tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 4);
            user.setLogin(tmp.toString());
            
            tmp = userTable.getModel().getValueAt(userTable.getSelectedRow(), 5);
            user.setPassword(tmp.toString());
           
            
           
            
            editUserUI.sendUser(user);
            editUserUI.setVisible(rootPaneCheckingEnabled);
            
        }
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void focusWindowRefreshData(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_focusWindowRefreshData
        // TODO add your handling code here:
         
        connectionDataBase = new ConnectionDataBase();
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        
        userTableModel = new UserTableModel();
        userTable.setModel(userTableModel);
        userTableModel.refreshData(requestDataBase.getAllUser());
                 
    }//GEN-LAST:event_focusWindowRefreshData


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
