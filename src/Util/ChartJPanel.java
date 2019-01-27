/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Business.EcoSystem;
import Business.WorkQueue.SOSRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author xingyaowu
 */
public class ChartJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartJPanel
     */
    private JPanel container;
    private EcoSystem system;

    public ChartJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        splitPane.setDividerLocation(20);
        splitPane2.setDividerLocation(300);
        XYDataset ds = createDataset();
        PieDataset pd = createPieDataSet();
        JFreeChart chart = ChartFactory.createXYLineChart("Respondance Statistic Chart",
                "Times", "Time of respondance", ds);
        ChartPanel chartPanel = new ChartPanel(chart);
        JFreeChart pieChart = ChartFactory.createPieChart("Zipcode Statistic Chart", pd);
        splitPane2.setBottomComponent(chartPanel);
        ChartPanel piePanel = new ChartPanel(pieChart);
        splitPane2.setTopComponent(piePanel);

    }

    private PieDataset createPieDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        HashMap<String, Integer> zipcodes = new HashMap<>();
        for (WorkRequest sosRequest : system.getWorkQueue().getWorkRequestList()) {
            SOSRequest request = (SOSRequest) sosRequest;
            if (zipcodes.get(request.getZipcode()) == null) {
                zipcodes.put(request.getZipcode(), 1);
            } else {
                zipcodes.put(request.getZipcode(), zipcodes.get(request.getZipcode()) + 1);
            }
        }
        for (String zipCode : zipcodes.keySet()) {
            dataset.setValue(zipCode, zipcodes.get(zipCode));
        }
        return dataset;
    }

    private XYDataset createDataset() {

        XYSeriesCollection ds = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Respondance");
        int counter = 0;
        for (WorkRequest sosRequest : system.getWorkQueue().getWorkRequestList()) {
            SOSRequest request = (SOSRequest) sosRequest;
            Date requestDate = request.getRequestDate();
            if (request.getAmbulanceService() == null) {
                continue;
            }
            Date resolveDate = request.getAmbulanceService().getStartoffDate();
            if (resolveDate == null) {
                continue;
            }
            SimpleDateFormat yearDate = new SimpleDateFormat("YYYY");
            SimpleDateFormat monthDate = new SimpleDateFormat("MM");
            SimpleDateFormat dayDate = new SimpleDateFormat("dd");
            Integer year = Integer.parseInt(yearDate.format(requestDate));
            Integer month = Integer.parseInt(monthDate.format(requestDate));
            Integer day = Integer.parseInt(dayDate.format(requestDate));
            series1.add(counter, resolveDate.getTime() - requestDate.getTime());
            counter++;
        }
        ds.addSeries(series1);
        return ds;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        splitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Data Statistics Dashboard");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addContainerGap(839, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        splitPane.setTopComponent(jPanel1);

        splitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        splitPane2.setTopComponent(jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        splitPane2.setRightComponent(jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane2)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JSplitPane splitPane2;
    // End of variables declaration//GEN-END:variables
}
