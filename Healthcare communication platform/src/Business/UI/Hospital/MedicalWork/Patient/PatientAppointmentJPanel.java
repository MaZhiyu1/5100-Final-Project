/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Hospital.MedicalWork.Patient;

import Business.Business;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Appointment;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.Patient;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhangjinming
 */
public class PatientAppointmentJPanel extends javax.swing.JPanel {
    private JPanel RightPanel;
    private Patient patient;
    private Business bz;
    private Hospital selectedHospital;

    private Doctor selectedDoctor;

    /**
     * Creates new form PatientAppointmentJPanel
     */
    public PatientAppointmentJPanel(JPanel RightPanel, Business bz, Patient patient) {
        initComponents();
        this.patient = patient;
        this.bz = bz;
        this.RightPanel=RightPanel;
        initAppointment();


        tblAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblAppointment.getSelectedRow(); // 获取所点选行的索引
                DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel(); //Have the access to the table;

                if(row != -1) { // 如果行已被选择

                    String doctorName = (String) model.getValueAt(row, 0); // 获取所选行的第1列值

                    for (Doctor doctor : selectedHospital.getDoctorList()){

                        if (doctorName.equals(doctor.getName())){
                            selectedDoctor = doctor;

                            txtName.setText(doctor.getName());
                            txtSpecialty.setText(doctor.getSpecialty());
                            txtDepartment.setText(doctor.getDepartment());

                            if(doctor.getAvail() == 0){
                                btnSubmit.setEnabled(false);
                                textAreaAllergy.setEnabled(false);
                                textAreaSymptom.setEnabled(false);
                            }else {
                                btnSubmit.setEnabled(true);
                                textAreaAllergy.setEnabled(true);
                                textAreaSymptom.setEnabled(true);
                            }

                            txtName.setEnabled(false);
                            txtSpecialty.setEnabled(false);
                            txtDepartment.setEnabled(false);
                        }
                    }
                }
            }
        });
    }
    private void initAppointment(){
        cmbHospital.removeAllItems();
        for (Hospital h : bz.getHospitals()) {
            cmbHospital.addItem(h.getName());
        }

        textAreaAllergy.setText(patient.getAllergy());
        txtName.setEnabled(false);
        txtSpecialty.setEnabled(false);
        txtDepartment.setEnabled(false);
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
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSpecialty = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        cmbHospital = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaAllergy = new javax.swing.JTextArea();
        btnBack1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAreaSymptom = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("Let's make an appointment!");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel15.setText("Hospital/Clinic:");

        jLabel14.setText("Doctor Specialty:");

        jLabel18.setText("Department:");

        cmbHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston Rehabilitation Center", "Future Medical Institute", "Verdant Health Hospital", " " }));
        cmbHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHospitalActionPerformed(evt);
            }
        });

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor", "Type", "Avail"
            }
        ));
        jScrollPane2.setViewportView(tblAppointment);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel16.setText("Name:");

        jLabel5.setText("Allergy:");

        textAreaAllergy.setColumns(20);
        textAreaAllergy.setRows(5);
        jScrollPane4.setViewportView(textAreaAllergy);

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Symptom description：");

        textAreaSymptom.setColumns(20);
        textAreaSymptom.setRows(5);
        jScrollPane5.setViewportView(textAreaSymptom);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel15)
                        .addGap(32, 32, 32)
                        .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(41, 41, 41)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSpecialty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDepartment, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(236, 236, 236)
                        .addComponent(btnBack1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack1)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpecialty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // submit appointment
        if(selectedDoctor == null){
            JOptionPane.showMessageDialog(null, "Please select a doctor!");
            return;
        }
        Appointment appointment = new Appointment(patient, selectedDoctor);
        appointment.setAllergy(textAreaAllergy.getText());
        appointment.setSymptom(textAreaSymptom.getText());
        appointment.setStatus(0);
        selectedDoctor.setAvail(selectedDoctor.getAvail()-1);
        JOptionPane.showMessageDialog(null, "Appointment has been submitted successfully!");
        btnBack1ActionPerformed(evt);

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void cmbHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHospitalActionPerformed
        // 初始化表格
        String hospitalName = (String) cmbHospital.getSelectedItem();
        for (Hospital h : bz.getHospitals()) {
            if (h.getName().equals(hospitalName)) {
                popularTable(h);
            }
        }
        
    }//GEN-LAST:event_cmbHospitalActionPerformed


    /**
     * 初始化表格
     * */
    private void popularTable(Hospital hospital){
        selectedHospital = hospital;

        DefaultTableModel dtm = (DefaultTableModel) tblAppointment.getModel();
        dtm.setRowCount(0);
        for (Doctor doctor : hospital.getDoctorList()) {
            Object[] row = new Object[4];
            row[0] = doctor.getName();
            row[1] = doctor.getType();
            row[2] = doctor.getAvail();
            row[3] = doctor;
            dtm.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTextArea textAreaAllergy;
    private javax.swing.JTextArea textAreaSymptom;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSpecialty;
    // End of variables declaration//GEN-END:variables
}
