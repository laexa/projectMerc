/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.UI.manager;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import moon.projectx.objectTable.Statistics;
import moon.projectx.UI.TableModel.StatisticsTableModel;
import moon.projectx.driver.*;


public class StatManagerUI extends javax.swing.JFrame {
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();
    RequestDataBase requestDataBase;
    StatisticsTableModel statisticsTableModel;
   
    public StatManagerUI() {
        initComponents();
        
        toDateChooser.setDate(new java.util.Date());
        fromDateChooser.setDate(new java.util.Date());
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        statisticsTableModel = new StatisticsTableModel();
        jTable1.setModel(statisticsTableModel);
        statisticsTableModel.refreshData(requestDataBase.getAllStat());
//        toDateChooser = new JDateChooser
    }
    
      /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil3 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        sqlDateModel1 = new net.sourceforge.jdatepicker.impl.SqlDateModel();
        dateComponentFormatter1 = new net.sourceforge.jdatepicker.impl.DateComponentFormatter();
        dateComponentFormatter2 = new net.sourceforge.jdatepicker.impl.DateComponentFormatter();
        jDatePickerUtil4 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fromDateChooser.setDateFormatString("y MMM d");
        fromDateChooser.setMaxSelectableDate(new java.util.Date(253370761267000L));
        fromDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fromDateChooserPropertyChange(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Від");

        jLabel2.setText("До");

        toDateChooser.setDateFormatString("y MMM d");
        toDateChooser.setMaxSelectableDate(new java.util.Date(253370761267000L));
        toDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                toDateChooserPropertyChange(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(toDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fromDateChooserPropertyChange
        System.out.println(fromDateChooser.getDate());
    }//GEN-LAST:event_fromDateChooserPropertyChange

    private void toDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_toDateChooserPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_toDateChooserPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        connectionDataBase.connect();
        requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
        statisticsTableModel = new StatisticsTableModel();
        jTable1.setModel(statisticsTableModel);
        
        
        
       
        
//      java.sql.Date sqlDate = new java.sql.Date(ERROR, WIDTH, xWIDTH);
        java.util.Date utilDateFrom = new java.util.Date();
        java.util.Date utilDateTo = new java.util.Date();
        
        utilDateFrom = fromDateChooser.getDate();
        utilDateTo = toDateChooser.getDate();
        
        java.sql.Date fromSqlDate = convert(utilDateFrom);
        java.sql.Date toSqlDate   = convert(utilDateTo);
        
        System.out.println(fromSqlDate.toString());
        
       statisticsTableModel.refreshData(requestDataBase.getAllStatDate(fromSqlDate, toSqlDate));
       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private net.sourceforge.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private net.sourceforge.jdatepicker.impl.DateComponentFormatter dateComponentFormatter2;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JButton jButton1;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil3;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private net.sourceforge.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private com.toedter.calendar.JDateChooser toDateChooser;
    // End of variables declaration//GEN-END:variables
}
