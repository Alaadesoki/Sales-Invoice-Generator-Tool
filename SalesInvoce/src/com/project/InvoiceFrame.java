/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project;

import com.project.Model.InvoiceLinesTableModel;
import com.project.Model.InvoiceHeaderTableModel;
import com.project.Model.Invoiceheader;
import com.project.Model.Invoicelines;
import com.project.View.InvoiceHeaderDialog;
import com.project.View.InvoiceLineDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author 20120
 */
public class InvoiceFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

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
        InvoicesTable.getSelectionModel().addListSelectionListener(this);
        CreateInvbtn = new javax.swing.JButton();
        CreateInvbtn.addActionListener(this);
        Deleteinvbtn = new javax.swing.JButton();
        Deleteinvbtn.addActionListener(this);
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
        CreateLineBtn.addActionListener(this);
        DeleteLineBtn = new javax.swing.JButton();
        DeleteLineBtn.addActionListener(this);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        Loadmenuitem = new javax.swing.JMenuItem();
        Loadmenuitem.addActionListener(this);
        Savemenueitem = new javax.swing.JMenuItem();
        Savemenueitem.addActionListener(this);

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

        DeleteLineBtn.setText("Delete Line");
        DeleteLineBtn.setActionCommand("DeleteLine");
        DeleteLineBtn.addActionListener(this);

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
private DateFormat df = new SimpleDateFormat ("dd-MM-yyyy");
private List<Invoiceheader> invoicesList = new ArrayList<>();
private InvoiceHeaderTableModel InvoiceHeaderTableModel;
private InvoiceLinesTableModel InvoiceLinesTableModel;
private InvoiceHeaderDialog HeaderDialog;
private InvoiceLineDialog LineDialog;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()){
          case "CreateNewInvoice":
              displayNewInvoiceDialog();
              break;
          case "DeleteInvoice":
              deleteInvoice();
              break;
              
          case "CreateNewLine":
              displayNewLineDialog();
                break;
                
          case "DeleteLine":
              deleteLine();
                break;
                
          case "LoadFile":
              loadFile();
              break;
          case "SaveFile":
              saveData();
              break;
          case "createInvCancel":
              createInvCancel();
          break;
          case "createInvOK":
              createInvOK();
          break;
          case "createLineCancel":
              createLineCancel();
          break;
          case "createLineOK":
              createLineOK();
          break;
          
    }
        
}
    
private void loadFile () {
   JOptionPane.showMessageDialog(this, "Please, Select header file", "Attention", JOptionPane.WARNING_MESSAGE);
   JFileChooser openFile = new JFileChooser();
   int result = openFile.showOpenDialog(this);
   if (result== JFileChooser.APPROVE_OPTION) {
       File headerFile = openFile.getSelectedFile();
        try {
       FileReader headerFr = new FileReader(headerFile);
       BufferedReader headerBr = new BufferedReader(headerFr);
       String headerline = null;
       
       while ((headerline = headerBr.readLine())!= null){
           String[] headerParts = headerline.split(",");
           String invNumStr = headerParts[0];
           String invDateStr = headerParts[1];
           String custName = headerParts[2];
           
           int invNum = Integer.parseInt(invNumStr);
           Date invDate = df.parse(invDateStr);
           
           Invoiceheader inv = new Invoiceheader(invNum, custName, invDate); 
           invoicesList.add(inv);
        } 
       
JOptionPane.showMessageDialog(this, "Please, Select lines file", "Attention", JOptionPane.WARNING_MESSAGE);
        result = openFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            File linesFile = openFile.getSelectedFile();
            BufferedReader LinesBr = new BufferedReader(new FileReader(linesFile));
            String linesLine = null;
            while ((linesLine = LinesBr.readLine())!= null) {
                String[] lineParts = linesLine.split(",");
                String invNumStr = lineParts[0];
                String itemName = lineParts[1];
                String itemPriceStr = lineParts[2];
                String itemCountStr = lineParts [3];   
                
                int invNum = Integer.parseInt(invNumStr);
                double itemPrice = Double.parseDouble(itemPriceStr);
                int itemCount = Integer.parseInt(itemCountStr);
                Invoiceheader header = findInvoiceByNum(invNum);
                Invoicelines invLine = new Invoicelines (itemName, itemPrice, itemCount, header);
                header.getLines().add(invLine);
            }   
            InvoiceHeaderTableModel = new InvoiceHeaderTableModel(invoicesList);
            InvoicesTable.setModel(InvoiceHeaderTableModel);
            InvoicesTable.validate();
           }
                System.out.println("Check");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        displayInvoises();
    }  
     private void saveData() {
             String headers = "";
        String lines = "";
        for (Invoiceheader header : invoicesList) {
            headers += header.getDataAsCSV();
            headers += "\n";
            for (Invoicelines line : header.getLines()) {
                lines += line.getDataAsCSV();
                lines += "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "Please, select file to save header data!", "Attension", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = fileChooser.getSelectedFile();
            try {
                FileWriter hFW = new FileWriter(headerFile);
                hFW.write(headers);
                hFW.flush();
                hFW.close();
        JOptionPane.showMessageDialog(this, "Please, select file to save lines data!", "Attension", JOptionPane.WARNING_MESSAGE);
                result = fileChooser.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File linesFile = fileChooser.getSelectedFile();
                    FileWriter lFW = new FileWriter(linesFile);
                    lFW.write(lines);
                    lFW.flush();
                    lFW.close();
                }
                 } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
        
        private Invoiceheader findInvoiceByNum(int InvNum) {
            Invoiceheader header = null;
            for (Invoiceheader inv : invoicesList) {
                if (InvNum == inv.getInvnum()) {
                    header = inv;
                    break;
            }
        }   
        return header;
        
     }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        System.out.println("Invoice Selevcted");
        invoicesTableRowSelected();
    }

    private void invoicesTableRowSelected() {
         int selectedRowIndex = InvoicesTable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            Invoiceheader row = InvoiceHeaderTableModel.getInvoicesList().get(selectedRowIndex);
            CustomernameTF.setText(row.getCustomername());
            InvoicedateTF.setText(df.format(row.getInvdate()));
            InvoicenumberLB.setText("" + row.getInvnum());
            InvoicetotalLB.setText("" + row.getInvTotal());
            ArrayList<Invoicelines> lines = row.getLines();
            InvoiceLinesTableModel = new InvoiceLinesTableModel(lines);
            InvLinesTable.setModel(InvoiceLinesTableModel);
            InvoiceLinesTableModel.fireTableDataChanged();
        }    
    }

    private void displayNewInvoiceDialog() {
        HeaderDialog = new InvoiceHeaderDialog(this); 
        HeaderDialog.setVisible(true); 
    }
     
    private void displayNewLineDialog() {
        LineDialog = new InvoiceLineDialog(this);
        LineDialog.setVisible(true);
    }

    private void createInvCancel() {
        HeaderDialog.setVisible(false);
        HeaderDialog.dispose();
        HeaderDialog = null;
    }

    private void createInvOK() {
        String CustName = HeaderDialog.getCustNameField().getText();
        String InvDateStr = HeaderDialog.getInvDateField().getText();  
        HeaderDialog.setVisible(false);
        HeaderDialog.dispose();
        HeaderDialog = null;
        try {
            Date InvDate = df.parse(InvDateStr);
          int InNum = getNextInvoiceNum(); 
          Invoiceheader Invoiceheader = new Invoiceheader (InNum,CustName, InvDate);
          invoicesList.add(Invoiceheader);
          InvoiceHeaderTableModel.fireTableDataChanged();
        } catch (ParseException ex) {
            ex.printStackTrace();  
        }
       displayInvoises();
 }       
       private int getNextInvoiceNum() {
           int max = 0;
        for (Invoiceheader header : invoicesList) {
            if (header.getInvnum()> max) {
                max = header.getInvnum();
            }
       }
           
      return max + 1;
     }

    private void createLineCancel() {
        LineDialog.setVisible(false);
        LineDialog.dispose();
        LineDialog = null;
    }

    private void createLineOK() {
        String itemName = LineDialog.getItemNameField().getText();
        String itemCountStr = LineDialog.getItemCountField().getText();
        String itemPriceStr = LineDialog.getItemPriceField().getText();
        LineDialog.setVisible(false);
        LineDialog.dispose();
        LineDialog = null;
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        int headerIndex = InvoicesTable.getSelectedRow();
        Invoiceheader invoice = InvoiceHeaderTableModel.getInvoicesList().get(headerIndex);
        
        Invoicelines invoiceLine = new Invoicelines(itemName, itemPrice, itemCount, invoice);
        invoice.addInvLine(invoiceLine);
        InvoiceLinesTableModel.fireTableDataChanged();
        InvoiceHeaderTableModel.fireTableDataChanged();
        InvoicetotalLB.setText("" + invoice.getInvTotal());
        displayInvoises();
    }    

    private void deleteInvoice() {
        int invIndex = InvoicesTable.getSelectedRow();
        Invoiceheader header = InvoiceHeaderTableModel.getInvoicesList().get(invIndex);
        InvoiceHeaderTableModel.getInvoicesList().remove(invIndex);
        InvoiceHeaderTableModel.fireTableDataChanged();
        InvoiceLinesTableModel = new InvoiceLinesTableModel(new ArrayList<Invoicelines>());
        InvLinesTable.setModel(InvoiceLinesTableModel);
        InvoiceHeaderTableModel.fireTableDataChanged();
        CustomernameTF.setText("");
        InvoicedateTF.setText("");
        InvoicenumberLB.setText("");
        InvoicetotalLB.setText("");
        displayInvoises();
    }

    private void deleteLine() {
        int lineIndex = InvLinesTable.getSelectedRow();
        Invoicelines line = InvoiceLinesTableModel.getInvoiceLines().get(lineIndex);
        InvoiceLinesTableModel.getInvoiceLines().remove(lineIndex);
        InvoiceLinesTableModel.fireTableDataChanged();
        InvoiceLinesTableModel.fireTableDataChanged();
        InvoicetotalLB.setText("" + line.getHeader().getInvTotal());
        displayInvoises();
    }

    private void displayInvoises() {
    System.out.println("***************************");
        for (Invoiceheader header : invoicesList) {
            System.out.println(header);
        }
        System.out.println("***************************");
    }

    }
