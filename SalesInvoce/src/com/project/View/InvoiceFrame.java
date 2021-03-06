/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.View;

import com.project.Controller.InvoiceListener;
import com.project.Model.InvoiceLinesTableModel;
import com.project.Model.InvoiceHeaderTableModel;
import com.project.Model.Invoiceheader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author 20120
 */
public class InvoiceFrame extends javax.swing.JFrame {



    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
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
        InvoicesTable = new javax.swing.JTable();
        InvoicesTable.getSelectionModel().addListSelectionListener(Listener);
        CreateInvbtn = new javax.swing.JButton();
        CreateInvbtn.addActionListener(Listener);
        Deleteinvbtn = new javax.swing.JButton();
        Deleteinvbtn.addActionListener(Listener);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InvoicedateTF = new javax.swing.JTextField();
        CustomernameTF = new javax.swing.JTextField();
        InvoicetotalLB = new javax.swing.JLabel();
        InvoicenumberLB = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvLinesTable = new javax.swing.JTable();
        CreateLineBtn = new javax.swing.JButton();
        CreateLineBtn.addActionListener(Listener);
        DeleteLineBtn = new javax.swing.JButton();
        DeleteLineBtn.addActionListener(Listener);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        Loadmenuitem = new javax.swing.JMenuItem();
        Loadmenuitem.addActionListener(Listener);
        Savemenueitem = new javax.swing.JMenuItem();
        Savemenueitem.addActionListener(Listener);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoicesTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InvoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date ", "Name", "Total"
            }
        ));
        InvoicesTable.setName("Invoices Table"); // NOI18N
        jScrollPane1.setViewportView(InvoicesTable);

        CreateInvbtn.setText("Create New Invoice");
        CreateInvbtn.setActionCommand("CreateNewInvoice");

        Deleteinvbtn.setText("Delete Invoice");
        Deleteinvbtn.setActionCommand("DeleteInvoice");

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        InvLinesTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InvLinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Item Price ", "Count ", "Total"
            }
        ));
        InvLinesTable.setName("Invoice Items"); // NOI18N
        jScrollPane2.setViewportView(InvLinesTable);

        CreateLineBtn.setText("Create New Line");
        CreateLineBtn.setActionCommand("CreateNewLine");
        CreateLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateLineBtnActionPerformed(evt);
            }
        });

        DeleteLineBtn.setText("Delete Line");
        DeleteLineBtn.setActionCommand("DeleteLine");
        DeleteLineBtn.addActionListener(Listener);

        jMenu6.setText("File");

        Loadmenuitem.setText("Load File");
        Loadmenuitem.setActionCommand("LoadFile");
        jMenu6.add(Loadmenuitem);

        Savemenueitem.setText("Save File");
        Savemenueitem.setActionCommand("SaveFile");
        jMenu6.add(Savemenueitem);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(CreateInvbtn)
                        .addGap(65, 65, 65)
                        .addComponent(Deleteinvbtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(InvoicedateTF))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomernameTF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(InvoicetotalLB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(InvoicenumberLB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(CreateLineBtn)
                        .addGap(86, 86, 86)
                        .addComponent(DeleteLineBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(InvoicenumberLB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(InvoicedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(CustomernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InvoicetotalLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(323, 323, 323))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateInvbtn)
                    .addComponent(Deleteinvbtn)
                    .addComponent(CreateLineBtn)
                    .addComponent(DeleteLineBtn))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateLineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateLineBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateInvbtn;
    private javax.swing.JButton CreateLineBtn;
    private javax.swing.JTextField CustomernameTF;
    private javax.swing.JButton DeleteLineBtn;
    private javax.swing.JButton Deleteinvbtn;
    private javax.swing.JTable InvLinesTable;
    private javax.swing.JTextField InvoicedateTF;
    private javax.swing.JLabel InvoicenumberLB;
    private javax.swing.JTable InvoicesTable;
    private javax.swing.JLabel InvoicetotalLB;
    private javax.swing.JMenuItem Loadmenuitem;
    private javax.swing.JMenuItem Savemenueitem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

private List<Invoiceheader> invoicesList = new ArrayList<>();
private InvoiceHeaderTableModel InvoiceHeaderTableModel;
private InvoiceLinesTableModel InvoiceLinesTableModel;
private InvoiceHeaderDialog HeaderDialog;
private InvoiceLineDialog LineDialog;
private InvoiceListener Listener = new InvoiceListener(this);

public InvoiceListener getListener() {
        return Listener;
}

 public void setHeaderDialog(InvoiceHeaderDialog headerDialog) {
        this.HeaderDialog = headerDialog;
    }

    public void setCreateInvbtn(JButton CreateInvbtn) {
        this.CreateInvbtn = CreateInvbtn;
    }

    public void setCreateLineBtn(JButton CreateLineBtn) {
        this.CreateLineBtn = CreateLineBtn;
    }

    public void setCustomernameTF(JTextField CustomernameTF) {
        this.CustomernameTF = CustomernameTF;
    }

    public void setDeleteLineBtn(JButton DeleteLineBtn) {
        this.DeleteLineBtn = DeleteLineBtn;
    }

    public void setDeleteinvbtn(JButton Deleteinvbtn) {
        this.Deleteinvbtn = Deleteinvbtn;
    }

    public void setInvLinesTable(JTable InvLinesTable) {
        this.InvLinesTable = InvLinesTable;
    }

    public void setInvoicedateTF(JTextField InvoicedateTF) {
        this.InvoicedateTF = InvoicedateTF;
    }

    public void setInvoicenumberLB(JLabel InvoicenumberLB) {
        this.InvoicenumberLB = InvoicenumberLB;
    }

    public void setInvoicesTable(JTable InvoicesTable) {
        this.InvoicesTable = InvoicesTable;
    }

    public void setInvoicetotalLB(JLabel InvoicetotalLB) {
        this.InvoicetotalLB = InvoicetotalLB;
    }

    public void setLoadmenuitem(JMenuItem Loadmenuitem) {
        this.Loadmenuitem = Loadmenuitem;
    }

    public void setSavemenueitem(JMenuItem Savemenueitem) {
        this.Savemenueitem = Savemenueitem;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public void setInvoicesList(List<Invoiceheader> invoicesList) {
        this.invoicesList = invoicesList;
    }

    public void setLineDialog(InvoiceLineDialog LineDialog) {
        this.LineDialog = LineDialog;
    }

    public void setInvoiceHeaderTableModel(InvoiceHeaderTableModel InvoiceHeaderTableModel) {
        this.InvoiceHeaderTableModel = InvoiceHeaderTableModel;
    }

    public void setInvoiceLinesTableModel(InvoiceLinesTableModel InvoiceLinesTableModel) {
        this.InvoiceLinesTableModel = InvoiceLinesTableModel;
    }


    public JButton getCreateInvbtn() {
        return CreateInvbtn;
    }

    public JButton getCreateLineBtn() {
        return CreateLineBtn;
    }

    public JTextField getCustomernameTF() {
        return CustomernameTF;
    }

    public JButton getDeleteLineBtn() {
        return DeleteLineBtn;
    }

    public JButton getDeleteinvbtn() {
        return Deleteinvbtn;
    }

    public JTable getInvLinesTable() {
        return InvLinesTable;
    }

    public JTextField getInvoicedateTF() {
        return InvoicedateTF;
    }

    public JLabel getInvoicenumberLB() {
        return InvoicenumberLB;
    }

    public JTable getInvoicesTable() {
        return InvoicesTable;
    }

    public JLabel getInvoicetotalLB() {
        return InvoicetotalLB;
    }

    public JMenuItem getLoadmenuitem() {
        return Loadmenuitem;
    }

    public JMenuItem getSavemenueitem() {
        return Savemenueitem;
    }

    public List<Invoiceheader> getInvoicesList() {
        return invoicesList;
    }

    public InvoiceHeaderTableModel getInvoiceHeaderTableModel() {
        return InvoiceHeaderTableModel;
    }

    public InvoiceLinesTableModel getInvoiceLinesTableModel() {
        return InvoiceLinesTableModel;
    }

    public InvoiceHeaderDialog getHeaderDialog() {
        return HeaderDialog;
    }

    public InvoiceLineDialog getLineDialog() {
        return LineDialog;
    }

  }
    
