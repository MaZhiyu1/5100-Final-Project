/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.UI.Biotechnology;

/**
 *
 * @author 15469
 */
public class DeliverDrugPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliverDrugPanel
     */
    public DeliverDrugPanel() {
        initComponents();
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delivery");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 694, -1));

        cmbDeliveryCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPS", "USPS"}));
        jPanel1.add(cmbDeliveryCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 88, 152, -1));

        jLabel1.setText("Delivery Company");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 91, -1, -1));

        tblMedical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Instruction"
            }
        ));
        jScrollPane2.setViewportView(tblMedical);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 149, 507, 133));

        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston Rehabilitation Center", "Future Medical Institute", "Verdant Health Hospital"}));
        jPanel1.add(cmbHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 88, 170, -1));

        jLabel2.setText("Type:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Instruction", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(tblCart);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 342, 507, 133));

        btnAdd.setText("ADD");
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        btnSubmit.setText("Submit");
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 493, -1, -1));

        btnDelete.setText("Delete");
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 493, -1, -1));

        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 303, -1, -1));

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 300, 87, -1));

        cmbSelectGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Vaccine", "Equipment", "Operation", "Transfer" }));
        jPanel1.add(cmbSelectGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel5.setText("Hospital");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 91, -1, -1));

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
