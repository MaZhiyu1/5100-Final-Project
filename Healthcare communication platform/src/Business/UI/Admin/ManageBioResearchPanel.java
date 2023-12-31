/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Admin;

import Business.Business;
import Business.Class.BioTech.BioResearcher;
import Business.Class.BioTech.BioTechCom;
import Business.Class.Hospital.Medical.Person;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15469
 */
public class ManageBioResearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBioResearchPanel
     */
    Business bz;
    BioTechCom h1;
    JPanel RightPanel;
    public ManageBioResearchPanel(Business bz,JPanel RightPanel) {
        initComponents();
        this.bz=bz;
        h1=null;
        this.RightPanel= RightPanel;
        DefaultTableModel model = (DefaultTableModel)HospitalTable.getModel();
        model.setRowCount(0);
    }

    public void refreshTable1(BioTechCom h){
        DefaultTableModel model = (DefaultTableModel)HospitalTable.getModel();
        model.setRowCount(0);

        if(h==null) return;
        for(BioResearcher s : h.getBr()) {
            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getMaster().getName();
            row[2] = s.getPwd();
            row[3] = s.getEnable();
            model.addRow(row);
        }
    }
    
     private static boolean isValidName(String name) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z]).+$";
        return Pattern.matches(regex, name);
    }


    private static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        return Pattern.matches(regex, password);
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
        HospitalTable = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Disable = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwdtxt = new javax.swing.JTextField();
        IDtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enabletxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hoCombox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        HospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Enabled"
            }
        ));
        HospitalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospitalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HospitalTable);

        Add.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Disable.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        Disable.setText("Disable");
        Disable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableActionPerformed(evt);
            }
        });

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setText("Name");

        pwdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdtxtActionPerformed(evt);
            }
        });

        IDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("ID");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel3.setText("Password");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel6.setText("Enable");

        enabletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enabletxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bio-Tech Researcher");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hoCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BioGenesis Therapeutics", "VitalEdge Biomedicals"}));
        hoCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoComboxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel7.setText("Biotech");

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnBack1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel7)
                                .addGap(56, 56, 56)
                                .addComponent(hoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Add)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Disable))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(pwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enabletxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Disable)
                    .addComponent(Add)
                    .addComponent(jButton1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(enabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalTableMouseClicked
        // TODO add your handling code here:
        int row = HospitalTable.getSelectedRow();
        BioResearcher selected = (BioResearcher) HospitalTable.getValueAt(row, 0);
        IDtxt.setText(String.valueOf(selected.getId()));
        enabletxt.setText(String.valueOf(selected.getEnable()));
        pwdtxt.setText(selected.getPwd());
        nametxt.setText(selected.getMaster().getName());
    }//GEN-LAST:event_HospitalTableMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String ho = (String)hoCombox.getSelectedItem();
        h1=null;
        for(BioTechCom h : bz.getBioTech()){
            if(h.getName().equals(ho)){
                h1=h;
            }
        }
        if(h1==null){
            JOptionPane.showMessageDialog(null,"Please select a company first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = 0;
        String name = nametxt.getText();
        String pwd = pwdtxt.getText();
        if(isValidName(name)==false||isValidPassword(pwd)==false){
            JOptionPane.showMessageDialog(null,"Please input strong name and password", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int enable = 0;
        try{
            id=Integer.parseInt(IDtxt.getText());
            enable=Integer.parseInt(enabletxt.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter number", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(name.equals("")||pwd.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter all", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person p = new Person(id,name,"",0);
        BioResearcher b = new BioResearcher(p,pwd,String.valueOf(id),h1);
        b.setEnable(enable);
        h1.addBioResaecher(b);
        refreshTable1( h1);
    }//GEN-LAST:event_AddActionPerformed

    private void DisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableActionPerformed
        // TODO add your handling code here:
        int row = HospitalTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BioResearcher selected = (BioResearcher) HospitalTable.getValueAt(row, 0);
        selected.setEnable(1);
    }//GEN-LAST:event_DisableActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void pwdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdtxtActionPerformed

    private void IDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDtxtActionPerformed

    private void enabletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enabletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enabletxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = HospitalTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BioResearcher selected = (BioResearcher) HospitalTable.getValueAt(row, 0);
        int id = 0;
        String name = nametxt.getText();
        String pwd = pwdtxt.getText();
        if(isValidName(name)==false||isValidPassword(pwd)==false){
            JOptionPane.showMessageDialog(null,"Please input strong name and password", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int enable = 0;
        try{
            id=Integer.parseInt(IDtxt.getText());
            enable=Integer.parseInt(enabletxt.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter number", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(name.equals("")||pwd.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter all", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        selected.setId(String.valueOf(id));
        selected.setEnable(enable);
        selected.getMaster().setName(name);
        selected.setPwd(pwd);
        refreshTable1( h1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hoComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoComboxActionPerformed
        // TODO add your handling code here:
        String ho = (String)hoCombox.getSelectedItem();
        BioTechCom h1=null;
        for(BioTechCom h : bz.getBioTech()){
            if(h.getName().equals(ho)){
                h1=h;
            }
        }
        refreshTable1( h1);
    }//GEN-LAST:event_hoComboxActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Disable;
    private javax.swing.JTable HospitalTable;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField enabletxt;
    private javax.swing.JComboBox<String> hoCombox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pwdtxt;
    // End of variables declaration//GEN-END:variables
}
