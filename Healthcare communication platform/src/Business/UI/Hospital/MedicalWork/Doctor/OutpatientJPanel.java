/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Hospital.MedicalWork.Doctor;

import Business.Business;
import Business.Class.*;
import Business.Class.Hospital.Medical.*;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhangjinming
 */
public class OutpatientJPanel extends javax.swing.JPanel {
    JPanel RightPanel;
    private Doctor doctor;

    private Appointment selectedAppointment;

    private Patient selectedPatient;

    private List<Drug> selectedDrugList;

    private Drug selectedDrug;

    Business bz;

    private List<Drug> drugList;
    
    ArrayList<Medicine> medicines = new ArrayList<>();
    int number;
    ArrayList<Vaccine> vaccines= new ArrayList<>();

    /**
     * Creates new form OutpatientJPanel
     */
    public OutpatientJPanel(JPanel RightPanel, Doctor doctor, Business bz) {
        initComponents();
        this.RightPanel=RightPanel;
        this.doctor = doctor;
        this.bz = bz;
        selectedDrugList = new ArrayList<>();
        initTable();

        tblAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = tblAppointment.getSelectedRow(); // 获取所点选行的索引
            DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel(); //Have the access to the table;

            if(row != -1) { // 如果行已被选择
                String id = (String) model.getValueAt(row, 0); // 获取所选行的第1列值

                for (Appointment appointment : doctor.getAppointmentList()){

                    if (id.equals(appointment.getId())){
                        selectedAppointment = appointment;
                        selectedPatient = appointment.getPatient();
                        txtName.setText(appointment.getPatient().getName());
                        txtPatientId.setText(String.valueOf(appointment.getPatient().getId()));
                        txtAge.setText(appointment.getPatient().getAge());
                        txtGender.setText(appointment.getPatient().getGender());
                        txtAllergy.setText(appointment.getPatient().getAllergy());
                        txtInsurance.setText(appointment.getPatient().getInsurance());
                        symptomTextArea.setText(appointment.getSymptom());

                        ((DefaultTableModel) tblPastMedicalRecords.getModel()).setRowCount(0);
                        ((DefaultTableModel) tblPrescription.getModel()).setRowCount(0);
                        ((DefaultTableModel) tblResult.getModel()).setRowCount(0);

                        //someone's medical history
                        populateMedicalRecords(appointment.getPatient().getMedicalHistoryDirectory().getMh());
                    }
                }
            }
            }
        });

        tblPastMedicalRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = tblPastMedicalRecords.getSelectedRow(); // 获取所点选行的索引
            DefaultTableModel model = (DefaultTableModel) tblPastMedicalRecords.getModel(); //Have the access to the table;

            if(row != -1) { // 如果行已被选择
//                populatePrescription( selectedAppointment.getPrescription().getDrugList());
            }
            }
        });

        tblPrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblPrescription.getSelectedRow(); // 获取所点选行的索引
                DefaultTableModel model = (DefaultTableModel) tblPrescription.getModel(); //Have the access to the table;

                if(row != -1) { // 如果行已被选择
                    String id = (String) model.getValueAt(row, 0); // 获取所选行的第1列值

                    selectedDrug = drugList.stream().filter(drug -> drug.getId().equals(id)).findFirst().get();

                    txtMedicalId.setText(id);
                    txtMedicalQuantity.setText("1");
                }
            }
        });
    }


    private void initTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblAppointment.getModel();
        dtm.setRowCount(0);

        for (Appointment appointment : doctor.getAppointmentList()) {
            Object[] row = new Object[4];
            row[0] = appointment.getId();
            row[1] = appointment.getPatient().getName();
            row[2] = appointment.getPatient().getId();
            row[3] = appointment.getPatient().getInsurance();
            dtm.addRow(row);
        }
    }


    /**
     * populate the medical records table
     * */
    private void populateMedicalRecords(List<MedicalHistory> medicalHistoryList){
        ((DefaultTableModel) tblPastMedicalRecords.getModel()).setRowCount(0);

        medicalHistoryList.forEach(medicalHistory -> {
            Object[] row1 = new Object[4];
            row1[0] = medicalHistory.getId();
            row1[1] = medicalHistory.getSymptom();
            row1[2] = medicalHistory.getInstruction();
            row1[3] = medicalHistory.getDoctor().getDepartment();
            ((DefaultTableModel) tblPastMedicalRecords.getModel()).addRow(row1);
        });
    }
    
    public void refreshTable(int k) {
        
        DefaultTableModel model = (DefaultTableModel)tblPrescription.getModel();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        symptomTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPastMedicalRecords = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAllergy = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtInsurance = new javax.swing.JTextField();
        btnSearchGenre = new javax.swing.JButton();
        txtSearchGenre = new javax.swing.JTextField();
        cmbSelectGenre = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMedicalId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMedicalQuantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        instructionTextArea = new javax.swing.JTextArea();
        btnBack1 = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setText("Outpatient Management");

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sequence", "Name", "Patient ID", "Insurance "
            }
        ));
        jScrollPane2.setViewportView(tblAppointment);

        jLabel2.setText("Name:");

        jLabel3.setText("Patient ID:");

        jLabel6.setText("Age:");

        jLabel7.setText("Gender:");

        jLabel5.setText("Symptom description：");

        symptomTextArea.setColumns(20);
        symptomTextArea.setRows(5);
        jScrollPane4.setViewportView(symptomTextArea);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Past Medical Records");

        tblPastMedicalRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Symptom", "Instructions ", "department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPastMedicalRecords);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("Prescription:");

        jLabel10.setText("Allergy：");

        jLabel11.setText("Insurance:");

        txtInsurance.setText("Yes/No");

        btnSearchGenre.setText("Search");
        btnSearchGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGenreActionPerformed(evt);
            }
        });

        txtSearchGenre.setText("Search Name/Department");

        cmbSelectGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Vaccine", "Equipment", "Operation", "Transfer" }));
        cmbSelectGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectGenreActionPerformed(evt);
            }
        });

        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID:", "Name", "type", "quantity", "Instruction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblPrescription);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantity:");

        jLabel12.setText("ID:");

        jLabel13.setText("Result");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID:", "Name", "Type", "Instruction", "quantity"
            }
        ));
        jScrollPane7.setViewportView(tblResult);

        jLabel14.setText("Instruction:");

        instructionTextArea.setColumns(20);
        instructionTextArea.setRows(5);
        jScrollPane8.setViewportView(instructionTextArea);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbSelectGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(txtSearchGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSearchGenre)))
                                        .addGap(3, 3, 3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(33, 33, 33)
                                            .addComponent(jScrollPane4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel6))
                                                    .addGap(9, 9, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                                            .addComponent(jLabel3))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel7)
                                                            .addGap(1, 1, 1)))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(164, 164, 164)
                                            .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMedicalId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMedicalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd)))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack1)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack1)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchGenre)
                    .addComponent(txtSearchGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSelectGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMedicalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtMedicalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        selectedDrug.setQuantity(Integer.parseInt(txtMedicalQuantity.getText()));
        selectedDrugList.add(selectedDrug);
        populateTblResult(selectedDrugList);

    }//GEN-LAST:event_btnAddActionPerformed


    /**
     * show the result table
     * */
    private void populateTblResult(List<Drug> selectedDrugList) {
        //清空表格
        ((DefaultTableModel) tblResult.getModel()).setRowCount(0);
        selectedDrugList.forEach(drug -> {
            Object[] row = new Object[5];
            row[0] = drug.getId();
            row[1] = drug.getName();
            row[2] = drug.getType();
            row[3] = drug.getInstruction();
            row[4] = txtMedicalQuantity.getText();
            ((DefaultTableModel) tblResult.getModel()).addRow(row);
        });
    }

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

        this.drugList = (List<Drug>) drugList;

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

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int row = tblResult.getSelectedRow(); // 获取所点选行的索引
        DefaultTableModel model = (DefaultTableModel) tblResult.getModel(); //Have the access to the table;
        String id = (String) model.getValueAt(row, 0); // 获取所选行的第1列值

        selectedDrugList.removeIf(drug -> drug.getId().equals(id));

        populateTblResult(selectedDrugList);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        //
        Prescription prescription = new Prescription("");
        prescription.setDrugList(selectedDrugList);
        MedicalHistory medicalHistory = new MedicalHistory(selectedAppointment.getSymptom(), instructionTextArea.getText());
        medicalHistory.setPrescription(prescription);
        selectedPatient.getMedicalHistoryDirectory().getMh().add(medicalHistory);

        JOptionPane.showMessageDialog(null, "Finish!");

        btnBack1ActionPerformed(evt);
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchGenre;
    private javax.swing.JComboBox<String> cmbSelectGenre;
    private javax.swing.JTextArea instructionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea symptomTextArea;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTable tblPastMedicalRecords;
    private javax.swing.JTable tblPrescription;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAllergy;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtInsurance;
    private javax.swing.JTextField txtMedicalId;
    private javax.swing.JTextField txtMedicalQuantity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtSearchGenre;
    // End of variables declaration//GEN-END:variables
}
