/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Hospital.MedicalWork.Doctor;

import Business.Class.BioTech.Lab;
import Business.Class.Hospital.Medical.Doctor;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhangjinming
 */
public class DoctorProfileJPanel extends javax.swing.JPanel {
    JPanel RightPanel;
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;

    private Doctor doctor;
    /**
     * Creates new form DoctorProfileJPanel
     */
    public DoctorProfileJPanel(JPanel RightPanel, Doctor doctor) {
        initComponents();
        this.RightPanel=RightPanel;
        FileNameExtensionFilter jpegFilter = new FileNameExtensionFilter("JPEG file","jpg", "jpeg");
        FileNameExtensionFilter pngFilter = new FileNameExtensionFilter("PNG file", "png", "png");

        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.addChoosableFileFilter(pngFilter);
        fileChooser.getFileFilter();
        initDoctorProfile(doctor);

    }

    public void initDoctorProfile(Doctor doctor ){
        txtId.setEnabled(false);
        txtUsername.setEnabled(false);

        txtName.setText(doctor.getName());
        txtAge.setText(doctor.getAge());
        txtId.setText(String.valueOf(doctor.getId()));
        txtGender.setText(doctor.getGender());
        txtContact.setText(doctor.getContact());
        txtAvail.setText(String.valueOf(doctor.getAvail()));
        txtHospital.setText(doctor.getHospital().getName());
        txtSpecialty.setText(doctor.getSpecialty());
        txtEduBackground.setText(doctor.getEductionBackground());
        txtUsername.setText(doctor.getName());
        txtPassword.setText(doctor.getPwd());
        cmbDepartment.setSelectedItem(doctor.getDepartment());
        if(doctor.getLogoImage() != null){
            imgLogo.setIcon(doctor.getLogoImage());
        } else{
            imgLogo.setText("No Logo");
        }

        initLabTable(doctor);
    }

    private void initLabTable(Doctor doctor) {
        DefaultTableModel model = (DefaultTableModel) tblLab.getModel();
        model.setRowCount(0);
        for (Lab lab : doctor.getLabs()) {
            Object[] row = new Object[3];
            row[0] = lab.getProjectName();
            row[1] = lab.getDepartment();
            row[2] = lab.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        imgLogo = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        btnSavePhoto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSpecialty = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEduBackground = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLab = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSaveAll = new javax.swing.JButton();
        cmbDepartment = new javax.swing.JComboBox<>();
        btnBack1 = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("My Profile");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(45, 47, 149, 45);

        jLabel2.setText("Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 142, 38, 17);
        jPanel1.add(txtName);
        txtName.setBounds(167, 139, 166, 23);

        jLabel6.setText("Age:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 183, 26, 17);
        jPanel1.add(txtAge);
        txtAge.setBounds(167, 180, 166, 23);

        jLabel3.setText("ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 143, 16, 17);
        jPanel1.add(txtId);
        txtId.setBounds(488, 140, 173, 23);

        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 181, 47, 20);
        jPanel1.add(txtGender);
        txtGender.setBounds(488, 180, 173, 23);

        jLabel10.setText("Contact:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(112, 218, 49, 17);
        jPanel1.add(txtContact);
        txtContact.setBounds(167, 215, 166, 23);

        jLabel11.setText("Avail:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(445, 220, 32, 17);
        jPanel1.add(txtAvail);
        txtAvail.setBounds(488, 217, 173, 23);

        imgLogo.setForeground(new java.awt.Color(0, 0, 204));
        imgLogo.setText("Photo Upload");
        jPanel1.add(imgLogo);
        imgLogo.setBounds(676, 6, 92, 86);

        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpload);
        btnUpload.setBounds(642, 98, 72, 23);

        btnSavePhoto.setText("Save");
        btnSavePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePhotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSavePhoto);
        btnSavePhoto.setBounds(726, 98, 64, 23);

        jLabel12.setText("Department");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(215, 264, 68, 17);

        jLabel14.setText("Specialty:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(225, 345, 58, 17);
        jPanel1.add(txtHospital);
        txtHospital.setBounds(315, 302, 260, 23);

        jLabel15.setText("Hospital/Clinic:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(195, 305, 88, 17);
        jPanel1.add(txtSpecialty);
        txtSpecialty.setBounds(315, 342, 260, 23);

        jLabel16.setText("Educational Background: ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(138, 386, 150, 17);
        jPanel1.add(txtEduBackground);
        txtEduBackground.setBounds(315, 383, 260, 23);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel17.setText("Lab");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(111, 449, 31, 23);

        tblLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Project Name", "Group", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblLab);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(174, 449, 483, 229);

        jLabel19.setText("UserName:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(191, 714, 65, 17);

        jLabel20.setText("Password");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(198, 749, 58, 17);
        jPanel1.add(txtUsername);
        txtUsername.setBounds(288, 708, 260, 23);

        txtPassword.setText("Strong");
        jPanel1.add(txtPassword);
        txtPassword.setBounds(288, 743, 260, 23);

        btnSaveAll.setText("Save");
        btnSaveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAllActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveAll);
        btnSaveAll.setBounds(600, 740, 72, 23);

        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "内科 - Internal Medicine", "外科 - Surgery", "儿科 - Pediatrics" }));
        jPanel1.add(cmbDepartment);
        cmbDepartment.setBounds(315, 261, 260, 23);

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack1);
        btnBack1.setBounds(600, 710, 72, 23);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePhotoActionPerformed
        // TODO add your handling code here:
        doctor.setLogoImage(logoImage);
    }//GEN-LAST:event_btnSavePhotoActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
                int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            URL url;
            try {
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));

                imgLogo.setIcon(logoImage);
            }catch (MalformedURLException ex){
                Logger.getLogger(this.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSaveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAllActionPerformed
        // TODO add your handling code here:
        txtName.setText(doctor.getName());
        txtAge.setText(doctor.getAge());
//        txtId.setText(doctor.getId());
        txtGender.setText(doctor.getGender());
        txtContact.setText(doctor.getContact());
        txtAvail.setText(String.valueOf(doctor.getAvail()));
        txtHospital.setText(doctor.getHospital().getName());
        txtSpecialty.setText(doctor.getSpecialty());
        txtEduBackground.setText(doctor.getEductionBackground());
//        txtUsername.setText(doctor.getName());
        txtPassword.setText(doctor.getPwd());
        JOptionPane.showMessageDialog(null, "Save Successfully!");
        btnBack1ActionPerformed(evt);
    }//GEN-LAST:event_btnSaveAllActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSaveAll;
    private javax.swing.JButton btnSavePhoto;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLab;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEduBackground;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSpecialty;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
