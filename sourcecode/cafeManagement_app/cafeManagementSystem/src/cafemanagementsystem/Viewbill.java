/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

/**
 *
 * @author PC
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Viewbill extends javax.swing.JFrame {

    /**
     * Creates new form Viewbill
     */
    public Viewbill() {
        initComponents();
        ShowProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewBill_tb = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        StartDate_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        managedrink = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        signout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 77, 26));
        jPanel1.setForeground(new java.awt.Color(129, 77, 26));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewBill_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CREATED_DATE", "STATUS", "NOTE", "PHONE", "ADDRESS", "TOTAL_COST"
            }
        ));
        jScrollPane1.setViewportView(ViewBill_tb);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 660, 360));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(129, 77, 26));
        jButton2.setText("DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 77, 26));
        jLabel3.setText("Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        StartDate_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDate_tfActionPerformed(evt);
            }
        });
        jPanel2.add(StartDate_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 77, 26));
        jLabel6.setText("Sort by Total");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 77, 26));
        jLabel1.setText("VIEW BILL");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Increase", "Decrease" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 130, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(129, 77, 26));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGER");

        managedrink.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        managedrink.setForeground(new java.awt.Color(255, 255, 255));
        managedrink.setText("MANAGE DRINK");
        managedrink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedrinkMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIEW BILL");

        report.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("REPORT");
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });

        signout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signout.setForeground(new java.awt.Color(255, 255, 255));
        signout.setText("SIGN OUT");
        signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MANAGE EMPLOYEE");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(signout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(report)
                            .addComponent(jLabel2)
                            .addComponent(managedrink)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addContainerGap(788, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 270, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addGap(118, 118, 118)
                .addComponent(managedrink)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(report)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(signout)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 557, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ShowProducts(){
        try{
            Connection Con = JDBC_Connection.getConnection();
            Statement ps = Con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM order_bill");
            ViewBill_tb.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }
    private void managedrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managedrinkMouseClicked
        new managedrink().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_managedrinkMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        new report().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportMouseClicked

    private void signoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutMouseClicked
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signoutMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if (StartDate_tf.getText().isEmpty() || ComboBox.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Missing Information");
    } else if ("Decrease".equals(ComboBox.getSelectedItem().toString())) {
        try {
            Connection Con = JDBC_Connection.getConnection();
            PreparedStatement ps = Con.prepareStatement("SELECT * FROM order_bill WHERE DATE(CREATED_DATE) = ? order by TOTAL_COST DESC ");
            LocalDate startDate = LocalDate.parse(StartDate_tf.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            ps.setDate(1, java.sql.Date.valueOf(startDate));
            ResultSet rs = ps.executeQuery();
            ViewBill_tb.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Date is not found");
        }
    } else {
        try {
            Connection Con = JDBC_Connection.getConnection();
            PreparedStatement ps = Con.prepareStatement("SELECT * FROM order_bill WHERE DATE(CREATED_DATE) = ? order by TOTAL_COST");
            LocalDate startDate = LocalDate.parse(StartDate_tf.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            ps.setDate(1, java.sql.Date.valueOf(startDate));
            ResultSet rs = ps.executeQuery();
            ViewBill_tb.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Date is not found");
        }
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        orderdetails order = new orderdetails();
        order.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        order.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void StartDate_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDate_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDate_tfActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new manageemployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Viewbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewbill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField StartDate_tf;
    private javax.swing.JTable ViewBill_tb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel managedrink;
    private javax.swing.JLabel report;
    private javax.swing.JLabel signout;
    // End of variables declaration//GEN-END:variables
}
