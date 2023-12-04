/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Hospital.MedicalWork.Doctor;

import Business.Class.*;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Request;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhangjinming
 */
public class DoctorRequestJPanel extends javax.swing.JPanel {
    JPanel RightPanel;
    private Doctor doctor;

    private List<Medicine> drugList;

    private Medicine selectedDrug;
    /**
     * Creates new form DoctorRequestJPanel
     */
    public DoctorRequestJPanel(JPanel RightPanel, Doctor doctor) {
        initComponents();
        this.doctor = doctor;
        this.RightPanel=RightPanel;


        tblPrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblPrescription.getSelectedRow(); // 获取所点选行的索引
                DefaultTableModel model = (DefaultTableModel) tblPrescription.getModel(); //Have the access to the table;

                if(row != -1) { // 如果行已被选择
                    String id = (String) model.getValueAt(row, 0); // 获取所选行的第1列值

                    selectedDrug = drugList.stream().filter(drug -> drug.getId().equals(id)).findFirst().get();

                    txtName.setText(selectedDrug.getName());
                    txtQuantity.setText("1");
                }
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbSelectGenre = new javax.swing.JComboBox<>();
        txtSearchGenre = new javax.swing.JTextField();
        btnSearchGenre = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tipsTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("How can we help? ");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("I Need");

        cmbSelectGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Vaccine", "Equipment" }));

        btnSearchGenre.setText("Search");
        btnSearchGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGenreActionPerformed(evt);
            }
        });

        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID:", "Name", "Type", "Instruction"
            }
        ));
        jScrollPane5.setViewportView(tblPrescription);

        jLabel12.setText("Name:");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantity:");

        jLabel14.setText("Tips:");

        tipsTextArea.setColumns(20);
        tipsTextArea.setRows(5);
        jScrollPane8.setViewportView(tipsTextArea);

        jLabel2.setText("Type就是内科 - Internal Medicine 外科 - Surgery 儿科 - Pediatrics");

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBack1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAdd))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSelectGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtSearchGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchGenre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchGenre)
                    .addComponent(txtSearchGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSelectGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchGenreActionPerformed

        // search medicine
        String  type = (String)cmbSelectGenre.getSelectedItem();
        String name = txtSearchGenre.getText();

        if(type.equals("Medicine")){
            ArrayList<Medicine> allList = doctor.getHospital().getHospitalInventory().getMedicineDirectory().getDrugs();

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
            ArrayList<Vaccine> allList = doctor.getHospital().getHospitalInventory().getVaccineDirectory().getVaccines();

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
            ArrayList<Equipment> allList = doctor.getHospital().getHospitalInventory().getEquipmentDirectory().getEquipments();

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
            ArrayList<Operation> allList = doctor.getHospital().getHospitalInventory().getOperationDirectory().getOperations();
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
            ArrayList<Transfer> allList = doctor.getHospital().getHospitalInventory().getTransferDirectory().getTransfers();
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
    }//GEN-LAST:event_btnSearchGenreActionPerformed


    /**
     * populate the prescription table
     * */
    private <T extends Drug> void populatePrescription(List<T> drugList) {

        this.drugList = (List<Medicine>) drugList;

        ((DefaultTableModel) tblPrescription.getModel()).setRowCount(0);
        drugList.forEach(drug -> {
            Object[] row1 = new Object[5];
            row1[0] = drug.getId();
            row1[1] = drug.getName();
            row1[2] = drug.getType();
            row1[3] = drug.getQuantity();
            row1[4] = drug.getInstruction();
            ((DefaultTableModel) tblPrescription.getModel()).addRow(row1);
        });
    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Request request = new Request(selectedDrug.getType(),tipsTextArea.getText(), Integer.parseInt(txtQuantity.getText()));
        request.setTips(tipsTextArea.getText());
        request.setMedicines(selectedDrug);
        doctor.getHospital().addRequest(request);
        tipsTextArea.setText("");
        JOptionPane.showMessageDialog(null, "Request added successfully!");

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSearchGenre;
    private javax.swing.JComboBox<String> cmbSelectGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tblPrescription;
    private javax.swing.JTextArea tipsTextArea;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchGenre;
    // End of variables declaration//GEN-END:variables
}
