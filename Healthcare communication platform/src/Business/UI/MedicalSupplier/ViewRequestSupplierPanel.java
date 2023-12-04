/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.MedicalSupplier;

import Business.Business;
import Business.Class.BioTech.BioSupplier;
import Business.Class.Delivery.Order;
import Business.Class.Equipment;
import Business.Class.Hospital.Request;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15469
 */

public class ViewRequestSupplierPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestSupplierPanel
     */
    JPanel RightPanel;
    Business b;
    BioSupplier bs;
    String company;
    public ViewRequestSupplierPanel(JPanel RightPanel,Business b,BioSupplier bs,String company) {
        initComponents();
        this.RightPanel=  RightPanel;
        this.b=b;
        this.bs = bs;
        this.company=company;
    }
    
    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel)tblRequest.getModel();
        model.setRowCount(0);
        if(bs.getRequest()==null) return;
        for(Request s : bs.getRequest()) {
            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getType();
            row[2] = s.getTips();
            row[3] = s.getStatus();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row);
        }
    }
    
    public void refreshTable1() {
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);
        if(bs.getOrders()==null) return;
        for(Order s : bs.getOrders()) {
            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getDelivery();
            row[2] = s.getAddress();
            row[3] = s.getStatus();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row);
        }
    }

    public void refreshTable2(ArrayList<Equipment> e) {
        DefaultTableModel model = (DefaultTableModel)tblEquipment.getModel();
        model.setRowCount(0);
        if(e==null) return;
        for(Equipment s : e) {
            Object row[] = new Object[3];
            row[0] = s;
            row[1] = s.getType();
            row[2] = s.getName();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
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

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DescriptionTextArea = new javax.swing.JTextArea();
        btnComplete = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEquipment = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Request");

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Type", "Description", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblRequest);

        jLabel1.setText("Description");

        DescriptionTextArea.setColumns(20);
        DescriptionTextArea.setRows(5);
        DescriptionTextArea.setEnabled(false);
        jScrollPane3.setViewportView(DescriptionTextArea);

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orders");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Delivery", "Address", "Status"
            }
        ));
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblOrder);

        tblEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Type", "Name"
            }
        ));
        jScrollPane6.setViewportView(tblEquipment);

        jLabel4.setText("Equipment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(517, 517, 517)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 454, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComplete)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();
        if(row<0){
            return;
        }
        Order selected = (Order) tblOrder.getValueAt(row, 0);
        ArrayList<Equipment> e = selected.getEquipments();
        if(e!=null){
            
        }

    }//GEN-LAST:event_tblOrderMouseClicked

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int row = tblRequest.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Request selected = (Request) tblRequest.getValueAt(row, 0);
        selected.setStatus("Completed");
        refreshTable();
        DescriptionTextArea.setText("");
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionTextArea;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblEquipment;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
}
