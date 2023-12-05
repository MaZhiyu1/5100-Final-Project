/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Hospital.RearServicesWork;

import Business.Business;
import Business.Class.*;
import Business.Class.BioTech.BioTechCom;
import Business.Class.Delivery.Order;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.RearServices.RearServices;
import Business.Class.Hospital.Request;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhangjinming
 */
public class RearServicesWorkAreaJPanel extends javax.swing.JPanel {

    private RearServices rearServices;
    ArrayList<Medicine> medicines = new ArrayList<>();
    int number;
    ArrayList<Vaccine> vaccines= new ArrayList<>();

    private List<Drug> drugList;

    Business bz;
    Request selectedRequest;
    /**
     * Creates new form RearServicesWorkAreaJPanel
     */
    JPanel RightPanel;
    public RearServicesWorkAreaJPanel(JPanel RightPanel, RearServices rearServices, Business bz) {
        initComponents();
        this.RightPanel = RightPanel;
        this.rearServices = rearServices;
        this.bz = bz;
        initTblRequest(rearServices);
//        refreshTable(0);
        initTblStock(rearServices);
        refreshTable();
        tblRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = tblRequest.getSelectedRow(); // 获取所点选行的索引
            DefaultTableModel model = (DefaultTableModel) tblRequest.getModel(); //Have the access to the table;

            if(row != -1) { // 如果行已被选择
                Request request = (Request) model.getValueAt(row, 0); // 获取所选行的第1列值
                selectedRequest = request;
                tipsTextArea.setText(request.getTips());
            }
            }
        });

    }
    
    private void refreshTable(){
        DefaultTableModel model = (DefaultTableModel)tblDelivery.getModel();
        model.setRowCount(0);
        if(rearServices.getHospital().getOrders()==null) return;
        for(Order s : rearServices.getHospital().getOrders()) {
            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getDelivery();
            row[2] = s.getAddress();
            row[3] = s.getStatus();
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row);
        }
        
    }
    
    
    

    private void initTblStock(RearServices rearServices) {
        // search medicine
        String  type = (String)cmbSelectGenre.getSelectedItem();
        String name = txtSearchGenre.getText();

        if(type.equals("Medicine")){
            ArrayList<Medicine> allList = rearServices.getHospital().getHospitalInventory().getMedicineDirectory().getMedicines();

            ArrayList<Medicine> medicineArrayList = new ArrayList<>();

            if(name == null || name.isEmpty()){
                medicineArrayList = allList;
            }
            else{
                for(Medicine drug : allList){
                    if(drug.getName().contains(name)){
                        medicineArrayList.add(drug);
                    }
                }
            }

            populatePrescription(medicineArrayList);
        }
        else if(type.equals("Vaccine")){
            ArrayList<Vaccine> allList = rearServices.getHospital().getHospitalInventory().getVaccineDirectory().getVaccines();

            ArrayList<Vaccine> vaccineList = new ArrayList<>();

            if(name == null || name.isEmpty()){
                vaccineList = allList;
            }
            else{
                for(Vaccine drug : allList){
                    if(drug.getName().contains(name)){
                        vaccineList.add(drug);
                    }
                }
            }
            populatePrescription(vaccineList);
        }
        else if(type.equals("Equipment")){
            ArrayList<Equipment> allList = rearServices.getHospital().getHospitalInventory().getEquipmentDirectory().getEquipments();

            ArrayList<Equipment> equipmentList = new ArrayList<>();

            if(name == null || name.isEmpty()){
                equipmentList = allList;
            }
            else{
                for(Equipment drug : allList){
                    if(drug.getName().contains(name)){
                        equipmentList.add(drug);
                    }
                }
            }

            populatePrescription(equipmentList);
        }
        else if(type.equals("Operation")){
            ArrayList<Operation> allList = rearServices.getHospital().getHospitalInventory().getOperationDirectory().getOperations();
            ArrayList<Operation> operationArrayList = new ArrayList<>();

            if(name == null || name.isEmpty()){
                operationArrayList = allList;
            }
            else{
                for(Operation operation : allList){
                    if(operation.getName().contains(name)){
                        operationArrayList.add(operation);
                    }
                }
            }

            populatePrescription(operationArrayList);
        }
        else if(type.equals("Transfer")){
            ArrayList<Transfer> allList = rearServices.getHospital().getHospitalInventory().getTransferDirectory().getTransfers();
            ArrayList<Transfer> transferArrayList = new ArrayList<>();

            if(name == null || name.isEmpty()){
                transferArrayList = allList;
            }
            else{
                for(Transfer drug : allList){
                    if(drug.getName().contains(name)){
                        transferArrayList.add(drug);
                    }
                }
            }
            populatePrescription(transferArrayList);
        }

    }


    /**
     * populate the prescription table
     * */
    private <T extends Drug> void populatePrescription(List<T> drugList) {

        this.drugList = (List<Drug>) drugList;

        ((DefaultTableModel) tblStock.getModel()).setRowCount(0);
        drugList.forEach(drug -> {
            Object[] row1 = new Object[4];
            row1[0] = drug.getId();
            row1[1] = drug.getName();
            row1[2] = drug.getType();
            row1[3] = drug.getQuantity();
//            row1[4] = drug.getInstruction();
            ((DefaultTableModel) tblStock.getModel()).addRow(row1);
        });
    }

    private void initTblRequest(RearServices rearServices) {
        ((javax.swing.table.DefaultTableModel) tblRequest.getModel()).setRowCount(0);

        rearServices.getRequest().stream().filter(request -> "Processing".equals(request.getStatus())).forEach((request) -> {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getName();
            row[2] = request.getType();
            row[3] = request.getQuantity();
            row[4] = request.getStatus();
            ((javax.swing.table.DefaultTableModel) tblRequest.getModel()).addRow(row);
        });
    }
//
//public void refreshTable(int k) {
//
//        DefaultTableModel model = (DefaultTableModel)tblStock.getModel();
//        model.setRowCount(0);
//        if(k==0){
//            if(medicines==null){return;}
//
//            for(Medicine s : medicines) {
//                Object row[] = new Object[5];
//                row[0] = s;
//                row[1] = s.getName();
//                row[2] = s.getType();
//                row[3] = s.getQuantity();
//                row[4] = s.getStatus();
//                model.addRow(row);
//            }
//        }
//
//
//        if(k==1){
//            if(vaccines==null){return;}
//
//            for(Vaccine s : vaccines) {
//                Object row[] = new Object[5];
//                row[0] = s;
//                row[1] = s.getName();
//                row[2] = s.getType();
//                row[3] = s.getQuantity();
//                row[4] = s.getStatus();
//                model.addRow(row);
//            }
//        }
//    }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tipsTextArea = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblDelivery = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbSelectGenre = new javax.swing.JComboBox<>();
        txtSearchGenre = new javax.swing.JTextField();
        btnSearchGenre = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("Service");

        jLabel13.setText("Request");

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tblRequest);

        jLabel14.setText("Tips:");

        tipsTextArea.setColumns(20);
        tipsTextArea.setRows(5);
        jScrollPane8.setViewportView(tipsTextArea);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel2.setText("Supplier:");

        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BioGenesis Therapeutics", "VitalEdge Biomedicals", "MedTech Innovators", "HealGear Manufacturing", " " }));

        tblDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mail Number", "Request ID", "Description", "Status"
            }
        ));
        jScrollPane9.setViewportView(tblDelivery);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setText("Delivery");

        jLabel3.setText("Status:pending / sent/ deliverying/ arrived");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("Stock");

        cmbSelectGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Vaccine", "Operation", "Transfer" }));
        cmbSelectGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectGenreActionPerformed(evt);
            }
        });

        btnSearchGenre.setText("Search");
        btnSearchGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGenreActionPerformed(evt);
            }
        });

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID:", "Name", "Type", "Quantity"
            }
        ));
        jScrollPane5.setViewportView(tblStock);

        jLabel4.setText("Search Name/Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbSelectGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(txtSearchGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearchGenre)
                                    .addGap(3, 3, 3))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(310, 310, 310))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchGenre)
                    .addComponent(txtSearchGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSelectGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchGenreActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:

        String techCom = (String)cmbSupplier.getSelectedItem();

        if(selectedRequest == null || techCom == null){
            return;
        }

//        Optional<BioTechCom> bioTechCom = bz.getBioTech().stream().filter(com -> techCom.equals(com.getName())).findFirst();
        for(BioTechCom b : bz.getBioTech()){
            if(b.getName().equals(techCom)){
                b.getRequest().add(selectedRequest);
            }
        }
        //bioTechCom.get().getRequest().add(selectedRequest);

        rearServices.getRequest().remove(selectedRequest);
        initTblRequest(rearServices);

    }//GEN-LAST:event_btnSendActionPerformed

    private void cmbSelectGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectGenreActionPerformed

//        String type = (String)cmbSelectGenre.getSelectedItem();
////        if(type.equals("Medicine")){
////            refreshTable(0);
////        }
////        else if(type.equals("Vaccine")){
////            refreshTable(1);
////        }

        initTblStock(rearServices);
    }//GEN-LAST:event_cmbSelectGenreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchGenre;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> cmbSelectGenre;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblDelivery;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTable tblStock;
    private javax.swing.JTextArea tipsTextArea;
    private javax.swing.JTextField txtSearchGenre;
    // End of variables declaration//GEN-END:variables
}
