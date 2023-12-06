/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Admin;

import Business.Business;
import Business.Class.Delivery.Order;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Doctor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15469
 */
public class ManageHDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHDoctorPanel
     */
    Business bz;

    public ManageHDoctorPanel(Business bz) {
        initComponents();
        this.bz=bz;
    }
    
    public void refreshTable1(Hospital h){
        DefaultTableModel model = (DefaultTableModel)HospitalTable.getModel();
        model.setRowCount(0);

        if(h==null) return;
        for(Doctor s : h.getDoctorList()) {
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getName();
            row[2] = s.getPwd();
            row[3] = s.getGender();
            row[4] = s.getEnabled();
            model.addRow(row);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hoCombox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalTable = new javax.swing.JTable();
        Disable = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        IDtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwdtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gendertxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enabletxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        hoCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Boston Rehabilitation Center", "Future Medical Institute", "Verdant Health Hospital" }));
        hoCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoComboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Hospital");

        HospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Gender", "Enabled"
            }
        ));
        HospitalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospitalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HospitalTable);

        Disable.setText("Disable");
        Disable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableActionPerformed(evt);
            }
        });

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        IDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtxtActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        pwdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdtxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        gendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender");

        enabletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enabletxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Enable");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Add)
                                .addGap(18, 18, 18)
                                .addComponent(Disable))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(hoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(enabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(pwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Disable)
                    .addComponent(Add)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDtxtActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void pwdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdtxtActionPerformed

    private void gendertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertxtActionPerformed

    private void enabletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enabletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enabletxtActionPerformed

    private void hoComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoComboxActionPerformed
        // TODO add your handling code here:
        String ho = (String)hoCombox.getSelectedItem();
        Hospital h1=null;
        for(Hospital h : bz.getHospitals()){
            if(h.getName().equals(ho)){
                h1=h;
            }
        }
        refreshTable1( h1);
    }//GEN-LAST:event_hoComboxActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String ho = (String)hoCombox.getSelectedItem();
        Hospital h1=null;
        for(Hospital h : bz.getHospitals()){
            if(h.getName().equals(ho)){
                h1=h;
            }
        }
        if(h1==null){
            JOptionPane.showMessageDialog(null,"Please select a hospital first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = 0;
        String name = nametxt.getText();
        String pwd = pwdtxt.getText();
        String gender = gendertxt.getText();
        int enable = 0;
        try{
            id=Integer.parseInt(IDtxt.getText());
            enable=Integer.parseInt(enabletxt.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter number", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(name.equals("")||pwd.equals("")||gender.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter all", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor d = new Doctor( id,  name,  pwd,  gender, h1);
        d.setEnabled(enable);
        h1.addDoctor(d);
        refreshTable1( h1);
    }//GEN-LAST:event_AddActionPerformed

    private void DisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableActionPerformed
        // TODO add your handling code here:
        int row = HospitalTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor selected = (Doctor) HospitalTable.getValueAt(row, 0);
        selected.setEnabled(0);
        String ho = (String)hoCombox.getSelectedItem();
        Hospital h1=null;
        for(Hospital h : bz.getHospitals()){
            if(h.getName().equals(ho)){
                h1=h;
            }
        }
        refreshTable1( h1);
    }//GEN-LAST:event_DisableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = HospitalTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor selected = (Doctor) HospitalTable.getValueAt(row, 0);
        int id = 0;
        String name = nametxt.getText();
        String pwd = pwdtxt.getText();
        String gender = gendertxt.getText();
        int enable = 0;
        Hospital h1 = selected.getHospital();
        try{
            id=Integer.parseInt(IDtxt.getText());
            enable=Integer.parseInt(enabletxt.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter number", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(name.equals("")||pwd.equals("")||gender.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter all", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        selected.setId(id);
        selected.setGender(gender);
        selected.setEnabled(enable);
        selected.setName(name);
        selected.setPwd(pwd);
        
        refreshTable1( h1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HospitalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalTableMouseClicked
        // TODO add your handling code here:
        int row = HospitalTable.getSelectedRow();
        if(row<0){
            return;
        }
        Doctor selected = (Doctor) HospitalTable.getValueAt(row, 0);
        IDtxt.setText(String.valueOf(selected.getId()));
        enabletxt.setText(String.valueOf(selected.getEnabled()));
        gendertxt.setText(selected.getGender());
        pwdtxt.setText(selected.getPwd());
        nametxt.setText(selected.getName());
    }//GEN-LAST:event_HospitalTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Disable;
    private javax.swing.JTable HospitalTable;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JTextField enabletxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JComboBox<String> hoCombox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pwdtxt;
    // End of variables declaration//GEN-END:variables
}
