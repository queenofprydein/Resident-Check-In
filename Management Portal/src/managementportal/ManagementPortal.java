/*
 * Copyright (C) 2019 Fast Track Computer Consultants <caseym1325@forsythtech.edu>
 * Created for the FTCC course CSC-289-900-2019SP.
 * This program can be freely copied and/or distributed.
 */
package managementportal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 **
 * @author Alondra Dorantes
 * @author Dana Caldwell
 * @author Marshall Casey
 * @author William West
 */
public class ManagementPortal extends javax.swing.JFrame {

    // Variable Declaration
    //final String myDBURL = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5114695?user=sql5114695&password=gaVQFSCRKx";
    //final String myDBURL = "jdbc:mysql://karnij.com:3306/quinic_school?user=quinic_acid&password=12345678";
    final String myDBURL = "jdbc:mysql://db4free.net:3306/karnij?user=quinicacid&password=Mm436yru";

    private static Connection conn = null;
    private static Statement statement = null;

    /**
     * Creates new form DatabaseConnections
     */
    public ManagementPortal() {
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

        lblStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnDropTable = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCreateTable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDisplayAll = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAddRecord = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnShowOne = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStatus.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblStatus.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setMaximumSize(new java.awt.Dimension(690, 150));
        txtOutput.setMinimumSize(new java.awt.Dimension(690, 150));
        jScrollPane1.setViewportView(txtOutput);

        jLabel5.setText("Output");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDropTable.setText("Drop Table");
        btnDropTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropTableActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCreateTable.setText("Create Inventory Table");
        btnCreateTable.setFocusCycleRoot(true);
        btnCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnCreateTable)
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnCreateTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnDisplayAll.setText("Display All");
        btnDisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnDisplayAll, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnDisplayAll)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAddRecord.setText("Add Record");
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantity");

        jLabel2.setText("Description");

        jLabel4.setText("Price");

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDescription)))))
                .addGap(9, 9, 9))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnAddRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnShowOne.setText("Show One Item");
        btnShowOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOneActionPerformed(evt);
            }
        });

        jLabel6.setText("ID to show:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(txtSearch))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnShowOne, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDropTable, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnClear)
                            .addComponent(btnDropTable))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTableActionPerformed

        try {
            //Connection conn = DriverManager.getConnection(DB_URL, "root", "password");
            conn = DriverManager.getConnection(myDBURL);
            statement = conn.createStatement();

            //    statement.executeUpdate("DROP TABLE Inventory");
            statement.execute("CREATE TABLE Inventory(ID INT NOT NULL PRIMARY KEY, Description VARCHAR (25)NOT NULL, Quantity INT NOT NULL, Price DECIMAL (18, 2) NOT NULL)");

            // statement.execute("CREATE TABLE Cust (Name Varchar(25), Address Varchar(25))");
            String sql = "INSERT INTO Inventory VALUES( 1, \'Rocks\', 65, 1.99)";
            statement.executeUpdate(sql);
            sql = "INSERT INTO Inventory VALUES ( 2, \'Paper\', 150, 2.99)";
            statement.executeUpdate(sql);
            sql = "INSERT INTO Inventory VALUES ( 3, \'Scissor\', 12, 3.99)";
            statement.executeUpdate(sql);
            sql = "INSERT INTO Inventory VALUES ( 4, \'Lizard\', 5, 4.99)";
            statement.executeUpdate(sql);
            sql = "INSERT INTO Inventory VALUES ( 5, \'Spock\', 1, 5.99)";
            statement.executeUpdate(sql);

            // Inform user database was created.
            lblStatus.setText("Table created.");
        } catch (SQLException ex) {
            lblStatus.setText(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
                lblStatus.setText("<html>" + ex.getMessage() + "</html>");
            }
        }
    }//GEN-LAST:event_btnCreateTableActionPerformed

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAllActionPerformed
        try {
            //Connection conn = DriverManager.getConnection(DB_URL, "root", "password");
            conn = DriverManager.getConnection(myDBURL);
            statement = conn.createStatement();

            //Try to display the values.
            ResultSet custResultsOfQuery = null;

            String sql = "select * from Inventory";

            custResultsOfQuery = statement.executeQuery(sql); //Remember to tell them its Execute Query like Fig 28.23

            ResultSetMetaData meta = custResultsOfQuery.getMetaData();

            String outputString = "";

            while (custResultsOfQuery.next()) {
                outputString += "ID: " + custResultsOfQuery.getObject(1);
                outputString += "          Name: " + custResultsOfQuery.getObject(2);
                outputString += "          Quantity: " + custResultsOfQuery.getObject(3);
                outputString += "          Price: $" + custResultsOfQuery.getObject(4) + "\n";
            }

            txtOutput.setText(outputString);

            // Inform user database was displayed.
            lblStatus.setText("Database displayed.");

        } catch (SQLException ex) {
            lblStatus.setText(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDisplayAllActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear output window
        txtOutput.setText("");
        lblStatus.setText("");
        txtID.setText("");
        txtDescription.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
        if ("".equals(txtID.getText())) {
            lblStatus.setText("No ID has been entered to add.");
            txtOutput.setText("No ID has been entered to add.");
            txtID.requestFocusInWindow();
        } else if ("".equals(txtDescription.getText())) {
            lblStatus.setText("No Description has been entered to add.");
            txtOutput.setText("No Description has been entered to add.");
            txtDescription.requestFocusInWindow();
        } else if ("".equals(txtQuantity.getText())) {
            lblStatus.setText("No Quantity has been entered to add.");
            txtOutput.setText("No Quantity has been entered to add.");
            txtQuantity.requestFocusInWindow();
        } else if ("".equals(txtPrice.getText())) {
            lblStatus.setText("No Price has been entered to add.");
            txtOutput.setText("No Price has been entered to add.");
            txtPrice.requestFocusInWindow();
        } else {

            try {
                //Connection conn = DriverManager.getConnection(DB_URL, "root", "password");
                conn = DriverManager.getConnection(myDBURL);
                statement = conn.createStatement();

                // statement.execute("CREATE TABLE Cust (Name Varchar(25), Address Varchar(25))");
                String sql = "INSERT INTO Inventory VALUES( " + txtID.getText() + ", \'" + txtDescription.getText() + "\', " + txtQuantity.getText() + ", " + txtPrice.getText() + ")";
                //txtOutput.setText(sql);
                statement.executeUpdate(sql);

                // Inform user database was created.
                lblStatus.setText("Data was entered.");
                txtID.setText("");
                txtDescription.setText("");
                txtQuantity.setText("");
                txtPrice.setText("");
                txtOutput.setText("Data was entered.");
            } catch (SQLException ex) {
                lblStatus.setText(ex.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void btnDropTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropTableActionPerformed
        try {
            //Connection conn = DriverManager.getConnection(DB_URL, "root", "password");
            conn = DriverManager.getConnection(myDBURL);
            statement = conn.createStatement();

            statement.executeUpdate("DROP TABLE Inventory");
            lblStatus.setText("Table destroyed.");
            txtOutput.setText("");
        } catch (SQLException ex) {
            lblStatus.setText(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDropTableActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnShowOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOneActionPerformed
        if ("".equals(txtSearch.getText())) {
            lblStatus.setText("No ID has been entered to search for.");
            txtOutput.setText("No ID has been entered to search for.");
        } else {
            try {
                //Connection conn = DriverManager.getConnection(DB_URL, "root", "password");
                conn = DriverManager.getConnection(myDBURL);
                statement = conn.createStatement();

                //Try to display the values.
                ResultSet custResultsOfQuery = null;

                // statement.execute("CREATE TABLE Cust (Name Varchar(25), Address Varchar(25))");
                String sql = "SELECT * FROM Inventory WHERE ID = " + txtSearch.getText();

                custResultsOfQuery = statement.executeQuery(sql); //Remember to tell them its Execute Query like Fig 28.23

                ResultSetMetaData meta = custResultsOfQuery.getMetaData();

                String outputString = "ID #" + txtSearch.getText() + " was not found.";

                while (custResultsOfQuery.next()) {
                    outputString = "ID: " + custResultsOfQuery.getObject(1);
                    outputString += "          Name: " + custResultsOfQuery.getObject(2);
                    outputString += "          Quantity: " + custResultsOfQuery.getObject(3);
                    outputString += "          Price: $" + custResultsOfQuery.getObject(4) + "\n";
                }

                txtOutput.setText(outputString);

                // Inform user database was created.
                lblStatus.setText("ID was shown.");
            } catch (SQLException ex) {
                lblStatus.setText(ex.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        txtSearch.setText("");
    }//GEN-LAST:event_btnShowOneActionPerformed

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
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateTable;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JButton btnDropTable;
    private javax.swing.JButton btnShowOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
