/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI;

import Business.Business;
import Business.Class.BioTech.BioSupplier;
import Business.UI.MedicalSupplier.MedicalSupplierJPanel;
import Validation.Validation;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 15469
 */
public class MedicalSupplierLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalSupplierLoginPanel
     */
    JPanel leftPanel;
    JPanel RightPanel;
    Business bz;
    
    String name;
    String pwd;
    String medicalSupplier;

    
    
    public MedicalSupplierLoginPanel(JPanel leftPanel,JPanel RightPanel,Business bz) {
        initComponents();
        this.leftPanel=leftPanel;
        this.RightPanel= RightPanel;
        this.bz=bz;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login Page");

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register");

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        txtpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwdActionPerformed(evt);
            }
        });

        Back.setText("back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MedTech Innovators", "HealGear Manufacturing"}));

        jLabel4.setText("Supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))))
                    .addContainerGap(138, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(94, 94, 94)
                    .addComponent(jButton1)
                    .addGap(35, 35, 35)
                    .addComponent(jButton2)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwdActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        leftPanel.remove(this);
        CardLayout layout =  (CardLayout) leftPanel.getLayout();
        layout.next(leftPanel);
    }//GEN-LAST:event_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        name = txtuser.getText();
        pwd = txtpwd.getText();
        medicalSupplier = (String) jComboBox.getSelectedItem();
        Validation v1 = new Validation(bz);
        Object o=v1.IsValidationMedicalSupplier(medicalSupplier, name, pwd);
        if(o==null){
            JOptionPane.showMessageDialog(null, "Please input correct account and password!");
            return;
        }

        MedicalSupplierJPanel pw = new MedicalSupplierJPanel(RightPanel,bz,(BioSupplier)o);
        RightPanel.add("LoginScreen",pw);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);

        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtpwd;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
