/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EMSWorkArea;

import Business.BodyAndSymptom.BodyApparatus;
import Business.BodyAndSymptom.BodyPart;
import Business.BodyAndSymptom.Symptom;
import Business.DiseaseAndTherapy.Therapy;
import Business.EcoSystem;
import Business.WorkQueue.SOSRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author wuxingyao
 */
public class TherapyConductingJPanel extends javax.swing.JPanel {

    private JPanel userContainer;
    private SOSRequest request;
    private EcoSystem system;

    public TherapyConductingJPanel(JPanel userContainer, EcoSystem system, SOSRequest request) {
        initComponents();
        this.userContainer = userContainer;
        this.request = request;
        this.system = system;
        patientNameTextField.setText(request.getName());
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        requestDateTextField.setText(dt.format(request.getRequestDate()));
        if (request.getAmbulanceService() != null) {
            ambulanceTextField.setText(request.getAmbulanceService().getAmbulance().getName());
        }
        statusTextField.setText(request.getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        statusTextField = new javax.swing.JTextField();
        requestDateTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ambulanceTextField = new javax.swing.JTextField();
        patientNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        databaseBtn = new javax.swing.JButton();
        manualBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        professionTextField = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTextField = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 638, -1));

        statusTextField.setEnabled(false);
        statusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTextFieldActionPerformed(evt);
            }
        });
        add(statusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 108, 171, -1));

        requestDateTextField.setEnabled(false);
        add(requestDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 108, 161, -1));

        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 398, -1, -1));

        jLabel4.setText("Ambulance Assigned:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 75, -1, -1));

        jLabel3.setText("Request Date:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 113, -1, -1));

        ambulanceTextField.setEnabled(false);
        add(ambulanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 70, 171, -1));

        patientNameTextField.setEnabled(false);
        add(patientNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 70, 161, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("EMS Conducting Service");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, -1, -1));

        jLabel5.setText("Current Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 113, -1, -1));

        databaseBtn.setText("Assigning Therapy Using Hosptial Database");
        databaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseBtnActionPerformed(evt);
            }
        });
        add(databaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 146, 579, 41));

        manualBtn.setText("Assigning Therapy Manually");
        manualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualBtnActionPerformed(evt);
            }
        });
        add(manualBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 339, 579, 47));

        professionTextField.setColumns(20);
        professionTextField.setRows(5);
        jScrollPane1.setViewportView(professionTextField);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 221, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Therapy For Professions:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 193, -1, -1));

        patientTextField.setColumns(20);
        patientTextField.setRows(5);
        jScrollPane2.setViewportView(patientTextField);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 221, 273, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Therapy For Patient:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 193, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void statusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userContainer.remove(this);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void manualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualBtnActionPerformed
        if (professionTextField.getText().equals("") || patientTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter both therapies.");
        } else if (request.getAmbulanceService() == null) {
            JOptionPane.showMessageDialog(null, "Please conduct ambulance service first.");
        } else {
            Therapy therapy = new Therapy();
            therapy.setFirstAidMethods(professionTextField.getText());
            therapy.setSelfcareMethods(patientTextField.getText());
            therapy.setAuxiliaryExamination(professionTextField.getText());
            request.getAmbulanceService().setTherapy(therapy);
            JOptionPane.showMessageDialog(null, "Therapy conducted successfully.");
        }
    }//GEN-LAST:event_manualBtnActionPerformed

    private void databaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseBtnActionPerformed

        if (request.getAmbulanceService() == null) {
            JOptionPane.showMessageDialog(null, "Please conduct ambulance service first.");
        } else {
            String bodyPartName = request.getBodyPart();
            String bodyApparatusName = request.getBodyApparatus();
            String symptomName = request.getSymptom();

            for (BodyPart bp : system.getBodyPartList()) {
                if (bp.getBodyPartName().equals(bodyPartName)) {
                    for (BodyApparatus ba : bp.getBodyapparatus()) {
                        if (ba.getBodyApparatusName().equals(bodyApparatusName)) {
                            for (Symptom symptom : ba.getSymptomList()) {
                                if (symptom.getSymptomName().equals(symptomName)) {
                           System.out.println("found:"+symptom+ " -----" + symptomName);
                                    Therapy therapy = new Therapy();
                                    therapy.setFirstAidMethods(symptom.getTherapy().getFirstAidMethods());
                                    therapy.setSelfcareMethods(symptom.getTherapy().getSelfcareMethods());
                                    request.getAmbulanceService().setTherapy(therapy);
                                    JOptionPane.showMessageDialog(null, "Therapy conducted successfully.");
                                    System.out.println("theray: " + request.getAmbulanceService().getTherapy());
                                }
                            }
                        }
                    }
                }
            }
        }

//        System.out.println("self: " + request.getAmbulanceService().getTherapy().getFirstAidMethods());

    }//GEN-LAST:event_databaseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ambulanceTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton databaseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton manualBtn;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JTextArea patientTextField;
    private javax.swing.JTextArea professionTextField;
    private javax.swing.JTextField requestDateTextField;
    private javax.swing.JTextField statusTextField;
    // End of variables declaration//GEN-END:variables
}
