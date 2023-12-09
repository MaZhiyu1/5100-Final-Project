/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Biotechnology;

import Business.Business;
import Business.Class.BioTech.BioSupplier;
import Business.Class.BioTech.BioTechCom;
import Business.Class.Delivery.Order;
import Business.Class.Hospital.Request;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15469
 */
public class RequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPanel
     */
    Business bz;
    String bioTech;
    BioSupplier bs;
    JPanel RightPanel;
    BioTechCom b;
    public RequestPanel(JPanel RightPanel,Business bz,String bioTech,BioSupplier bs) {
        initComponents();
        this.bz=bz;
        this.bioTech=bioTech;
        this.bs=bs;
        this.RightPanel= RightPanel;
        for(BioTechCom b : bz.getBioTech()){
            if(bioTech.equals(b.getName())) this.b=b;
        }
        refreshTable();
        refreshTable1();

    }
    
    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel)tblRequest.getModel();
        model.setRowCount(0);
        if(b.getRequest()==null) return;
        for(Request s : b.getRequest()) {
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
    
    public void refreshTable2(Order selected) {
        DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
        model.setRowCount(0);
        if(selected.getMedicines()==null) return;
        for(Medicine s : selected.getMedicines()) {
            Object row1[] = new Object[3];
            row1[0] = s;
            row1[1] = s.getType();
            row1[2] = s.getQuantity();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row1);
        }
    }
    
    public void refreshTable3(Order selected) {
        DefaultTableModel model = (DefaultTableModel)tblVaccine.getModel();
        model.setRowCount(0);
        if(selected.getVaccines()==null) return;
        for(Vaccine s : selected.getVaccines()) {
            Object row1[] = new Object[3];
            row1[0] = s;
            row1[1] = s.getType();
            row1[2] = s.getQuantity();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row1);
        }
    }
    
    
    public void refreshTable2(Request selected) {
        DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
        model.setRowCount(0);
        if(selected.getMedicine()==null) return;
 
            Object row1[] = new Object[4];
            row1[0] = selected.getMedicine();
            row1[1] = selected.getMedicine().getType();
            row1[2] = selected.getMedicine().getName();
            row1[3] = selected.getMedicine().getQuantity();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row1);
        
    }
    
    public void refreshTable3(Request selected) {
        DefaultTableModel model = (DefaultTableModel)tblVaccine.getModel();
        model.setRowCount(0);
        if(selected.getVaccines() == null) return; // Check if getVaccines() returns null

            Object row1[] = new Object[4];
            row1[0] = selected.getVaccines();
            row1[1] = selected.getVaccines().getType();
            row1[2] = selected.getVaccines().getName();
            row1[3] = selected.getVaccines().getQuantity();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row1);
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnComplete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        DescriptionTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblVaccine = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

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
        tblRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRequestMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRequest);
        if (tblRequest.getColumnModel().getColumnCount() > 0) {
            tblRequest.getColumnModel().getColumn(3).setHeaderValue("Status");
        }

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        DescriptionTextArea.setColumns(20);
        DescriptionTextArea.setRows(5);
        DescriptionTextArea.setEnabled(false);
        jScrollPane3.setViewportView(DescriptionTextArea);

        jLabel1.setText("Description");

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
        jScrollPane4.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(3).setHeaderValue("Status");
        }

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orders");

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Type", "Name", "Quantity"
            }
        ));
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblMedicine);

        tblVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Type", "Name", "Quantity"
            }
        ));
        tblVaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVaccineMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblVaccine);

        jLabel4.setText("Medicine");

        jLabel5.setText("Vaccine");

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComplete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(73, 73, 73))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void tblRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestMouseClicked
        // TODO add your handling code here:
        int row = tblRequest.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Request selected = (Request) tblRequest.getValueAt(row, 0);
        refreshTable2(selected);
        refreshTable3( selected);
        DescriptionTextArea.setText(selected.getTips());
    }//GEN-LAST:event_tblRequestMouseClicked

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();
        if(row<0){
            return;
        }
        Order selected = (Order) tblOrder.getValueAt(row, 0);
        refreshTable2(selected);
        refreshTable3( selected);
    }//GEN-LAST:event_tblOrderMouseClicked

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void tblVaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVaccineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVaccineMouseClicked

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionTextArea;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTable tblVaccine;
    // End of variables declaration//GEN-END:variables
}
