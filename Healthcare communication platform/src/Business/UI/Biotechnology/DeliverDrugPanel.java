/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Biotechnology;

import Business.Business;
import Business.Class.BioTech.BioSupplier;
import Business.Class.BioTech.BioTechCom;
import Business.Class.Delivery.Order;
import Business.Class.Equipment;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15469
 */
public class DeliverDrugPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliverDrugPanel
     */
    Business bz;
    String bioTech;
    BioSupplier bs;
    ArrayList<Medicine> medicines = new ArrayList<>();
    int number;
    ArrayList<Vaccine> vaccines= new ArrayList<>();
    BioTechCom btc;
    JPanel RightPanel;
    public DeliverDrugPanel(JPanel RightPanel,Business bz,String bioTech,BioSupplier bs) {
        initComponents();
        this.bz=bz;
        this.bioTech=bioTech;
        this.bs=bs;
        this.RightPanel=RightPanel;
        number=0;
        for(BioTechCom bt : bz.getBioTech()){
            if(bt.getName().equals(bioTech)){
                btc = bt;
                if(bt.getHi().getMd().getDrugs()!=null) medicines=bt.getHi().getMd().getDrugs();
                
                if(bt.getHi().getVd().getVaccines()!=null) vaccines=bt.getHi().getVd().getVaccines();
            }
        }
        refreshTable(0);
        DefaultTableModel model1 = (DefaultTableModel)tblCart.getModel();
        model1.setRowCount(0);
        
    }
    
    
    public void refreshTable(int k) {
        
        DefaultTableModel model = (DefaultTableModel)tblMedical.getModel();
        model.setRowCount(0);
        if(k==0){
        if(medicines==null) return;
        for(Medicine s : medicines) {
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getName();
            row[2] = s.getType();
            row[3] = s.getQuantity();
            row[4] = s.getStatus();
            model.addRow(row);
        }
        }
        

        if(k==1){
        if(vaccines==null) return;
        for(Vaccine s : vaccines) {
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getName();
            row[2] = s.getType();
            row[3] = s.getQuantity();
            row[4] = s.getStatus();
            model.addRow(row);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbDeliveryCompany = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedical = new javax.swing.JTable();
        cmbHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        cmbSelectGenre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delivery");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(6, 38, 694, 24);

        cmbDeliveryCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPS", "USPS"}));
        jPanel1.add(cmbDeliveryCompany);
        cmbDeliveryCompany.setBounds(228, 88, 152, 23);

        jLabel1.setText("Delivery Company");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(115, 91, 105, 17);

        tblMedical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Quantity", "Instruction"
            }
        ));
        jScrollPane2.setViewportView(tblMedical);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(115, 149, 507, 133);

        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston Rehabilitation Center", "Future Medical Institute", "Verdant Health Hospital"}));
        jPanel1.add(cmbHospital);
        cmbHospital.setBounds(432, 88, 200, 23);

        jLabel2.setText("Type:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 120, 31, 17);

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Quantity", "Status"
            }
        ));
        jScrollPane3.setViewportView(tblCart);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(115, 342, 507, 133);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(550, 300, 72, 23);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(550, 493, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(454, 493, 72, 23);

        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(382, 303, 48, 17);

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity);
        txtQuantity.setBounds(457, 300, 87, 23);

        cmbSelectGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Vaccine" }));
        cmbSelectGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectGenreActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSelectGenre);
        cmbSelectGenre.setBounds(510, 120, 110, 23);

        jLabel5.setText("Hospital");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 90, 48, 17);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void cmbSelectGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectGenreActionPerformed
        // TODO add your handling code here:
        String type = (String)cmbSelectGenre.getSelectedItem();
        if(type.equals("Medicine")){
            refreshTable(0);
        }
        else if(type.equals("Vaccine")){
            refreshTable(1);
        }
    }//GEN-LAST:event_cmbSelectGenreActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtQuantity.getText()==null){
            JOptionPane.showMessageDialog(null, "Please input number!");
            return;
        }
        number=0;
        try{
            number = Integer.parseInt(txtQuantity.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please input number!");
            return;
        }
        int row = tblMedical.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(((String)cmbSelectGenre.getSelectedItem()).equals("Medicine")){
            Medicine selected = (Medicine) tblMedical.getValueAt(row, 0);
            if((selected.getQuantity()-number<0)||number<=0){
                JOptionPane.showMessageDialog(null,"Please input a vaild value");
                return;
            }
            selected.setQuantity(selected.getQuantity()-number);
            DefaultTableModel model1 = (DefaultTableModel)tblCart.getModel();
            Object row1[] = new Object[5];
            row1[0] = selected;
            row1[1] = selected.getName();
            row1[2] = selected.getType();
            row1[3] = number;
            row1[4] = selected.getStatus();
            model1.addRow(row1);
            refreshTable(0);
        }
        if(((String)cmbSelectGenre.getSelectedItem()).equals("Vaccine")){
            Vaccine selected = (Vaccine) tblMedical.getValueAt(row, 0);
            if((selected.getQuantity()-number<0)||number<=0){
                JOptionPane.showMessageDialog(null,"Please input a vaild value");
                return;
            }
            selected.setQuantity(selected.getQuantity()-number);
            DefaultTableModel model1 = (DefaultTableModel)tblCart.getModel();
            Object row1[] = new Object[5];
            row1[0] = selected;
            row1[1] = selected.getName();
            row1[2] = selected.getType();
            row1[3] = number;
            row1[4] = selected.getStatus();
            model1.addRow(row1);
            refreshTable(1);
        }
        
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tblCart.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel)tblCart.getModel();
        number = (int) tblCart.getValueAt(row, 3);
        if(tblCart.getValueAt(row, 0) instanceof Medicine){
            Medicine selected = (Medicine) tblCart.getValueAt(row, 0);
            for(Medicine v : medicines){
                if(v.getId().equals(selected.getId())){
                    v.setQuantity(v.getQuantity()+number);
                }
            }
            model1.removeRow(row);
        }
        else if(tblCart.getValueAt(row, 0) instanceof Vaccine){
            Vaccine selected = (Vaccine) tblCart.getValueAt(row, 0);
            for(Vaccine v : vaccines){
                if(v.getId().equals(selected.getId())){
                    v.setQuantity(v.getQuantity()+number);
                }
            }
            model1.removeRow(row);
        }
        String type = (String)cmbSelectGenre.getSelectedItem();
        if(type.equals("Medicine")){
            refreshTable(0);
        }
        else if(type.equals("Vaccine")){
            refreshTable(1);
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    DefaultTableModel model1 = (DefaultTableModel)tblCart.getModel();
    int s=1;
    if(bs.getOrders()!=null){
        s = bs.getOrders().size()+1;
    }
    if(model1.getRowCount()<0){
        JOptionPane.showMessageDialog(null,"Please enter to cart", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
    }
    Order order1 = new Order(String.valueOf(s),(String)cmbDeliveryCompany.getSelectedItem(),bioTech,(String)cmbHospital.getSelectedItem(),"Processing");
        for (int count = 0; count < model1.getRowCount(); count++){
        if(model1.getValueAt(count, 0) instanceof Vaccine){
            order1.addVaccine((Vaccine)model1.getValueAt(count, 0));
        }
        else if(model1.getValueAt(count, 0) instanceof Medicine){
            order1.addMedicine((Medicine)model1.getValueAt(count, 0));
        }
    }
        bs.getOrders().add(order1);
        JOptionPane.showMessageDialog(null,"Successfully submit!");
        RightPanel.remove(this);
        CardLayout layout =  (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);

    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbDeliveryCompany;
    private javax.swing.JComboBox<String> cmbHospital;
    private javax.swing.JComboBox<String> cmbSelectGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMedical;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
