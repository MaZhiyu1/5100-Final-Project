/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Hospital.MedicalWork.Doctor;

import Business.Business;
import Business.Class.Hospital.Medical.Doctor;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author zhangjinming
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel RightPanel;

    private Doctor doctor;

    private Business bz;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel RightPanel, Doctor doctor, Business bz) {
        initComponents();
        this.RightPanel=RightPanel;
        this.doctor = doctor;
        this.bz = bz;
        initWorkArea();
    }

    private void initWorkArea() {

        jLabel3.setText(doctor.getName());
        jLabel1.setText(doctor.getDepartment());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOutPatient = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnEMR = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnLab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        btnOutPatient.setBackground(new java.awt.Color(0, 0, 255));
        btnOutPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnOutPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnOutPatient.setText("Outpatient Department");
        btnOutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutPatientActionPerformed(evt);
            }
        });

        btnAppointment.setBackground(new java.awt.Color(51, 51, 255));
        btnAppointment.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnAppointment.setText("Appointment");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        btnEMR.setBackground(new java.awt.Color(51, 51, 255));
        btnEMR.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnEMR.setForeground(new java.awt.Color(255, 255, 255));
        btnEMR.setText("EMR(电子病历)");
        btnEMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMRActionPerformed(evt);
            }
        });

        btnRequest.setBackground(new java.awt.Color(51, 51, 255));
        btnRequest.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(51, 51, 255));
        btnProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnLab.setBackground(new java.awt.Color(51, 51, 255));
        btnLab.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        btnLab.setForeground(new java.awt.Color(255, 255, 255));
        btnLab.setText("Lab");
        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("显示Department");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Wellcome, Dr.");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel3.setText("XXX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOutPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLab, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEMR, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOutPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEMR, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLab, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutPatientActionPerformed
        // TODO add your handling code here:
    OutpatientJPanel op = new OutpatientJPanel(RightPanel, doctor, bz);
    RightPanel.add("OutpatientJPanel", op);
    CardLayout layout = (CardLayout) RightPanel.getLayout();
    layout.next(RightPanel);
    }//GEN-LAST:event_btnOutPatientActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        // TODO add your handling code here:
    AppointmentJPanel ap = new AppointmentJPanel(RightPanel, doctor);
    RightPanel.add("AppointmentJPanel", ap);
    CardLayout layout = (CardLayout) RightPanel.getLayout();
    layout.next(RightPanel);
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnEMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMRActionPerformed
        // TODO add your handling code here:
    EMRJPanel emrp = new EMRJPanel(RightPanel, doctor);
    RightPanel.add("EMRJPanel", emrp);
    CardLayout layout = (CardLayout) RightPanel.getLayout();
    layout.next(RightPanel);
    }//GEN-LAST:event_btnEMRActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
    DoctorRequestJPanel drp = new DoctorRequestJPanel(RightPanel, doctor);
    RightPanel.add("DoctorRequestJPanel", drp);
    CardLayout layout = (CardLayout) RightPanel.getLayout();
    layout.next(RightPanel);

    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
    DoctorProfileJPanel dpp = new DoctorProfileJPanel(RightPanel, doctor);
    RightPanel.add("DoctorProfileJPanel", dpp);
    CardLayout layout = (CardLayout) RightPanel.getLayout();
    layout.next(RightPanel);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        // TODO add your handling code here:
    DoctorLabJPanel dlp = new DoctorLabJPanel(RightPanel, doctor);
    RightPanel.add("DoctorLabJPanel", dlp);
    CardLayout layout = (CardLayout) RightPanel.getLayout();
    layout.next(RightPanel);
    }//GEN-LAST:event_btnLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnEMR;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnOutPatient;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
