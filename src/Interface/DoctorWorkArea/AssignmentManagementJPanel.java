/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DoctorWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SOSRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wuxingyao
 */
public class AssignmentManagementJPanel extends javax.swing.JPanel {

    private JPanel userContainer;
    private EcoSystem system;
    private UserAccount account;

    public AssignmentManagementJPanel(JPanel userContainer, EcoSystem system, UserAccount account) {
        initComponents();
        this.userContainer = userContainer;
        this.system = system;
        this.account = account;
        populateTable();
    }

    private void populateTable() {
        ArrayList<SOSRequest> requests = new ArrayList<>();
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            if (request.getReceiver() != null && request.getReceiver().equals(account)) {
                SOSRequest sosRequest = (SOSRequest) request;
                requests.add(sosRequest);
            }
        }
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (SOSRequest request : requests) {
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getSymptom();
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            row[2] = dt.format(request.getRequestDate());
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

        jLabel4 = new javax.swing.JLabel();
        symptomTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        statusTextField = new javax.swing.JTextField();
        requestDateTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();

        jLabel4.setText("Symptom:");

        symptomTextField.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Doctor Assignment Management");

        jLabel5.setText("Current Status:");

        statusTextField.setEnabled(false);
        statusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTextFieldActionPerformed(evt);
            }
        });

        requestDateTextField.setEnabled(false);

        jLabel2.setText("Patient Name:");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Request Date:");

        patientNameTextField.setEnabled(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name:", "Symptom", "Request Date"
            }
        ));
        jScrollPane2.setViewportView(table);

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(patientNameTextField)
                                            .addComponent(requestDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(symptomTextField)
                                    .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(symptomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(backBtn)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void statusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTextFieldActionPerformed

    }//GEN-LAST:event_statusTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userContainer.remove(this);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            SOSRequest request = (SOSRequest) table.getValueAt(selectedRow, 0);
            patientNameTextField.setText(request.getName());
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            requestDateTextField.setText(dt.format(request.getRequestDate()));
            symptomTextField.setText(request.getSymptom());
            statusTextField.setText(request.getStatus());
        }
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JTextField requestDateTextField;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JTextField symptomTextField;
    private javax.swing.JTable table;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
