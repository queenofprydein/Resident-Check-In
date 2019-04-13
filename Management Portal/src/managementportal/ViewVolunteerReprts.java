/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.sql.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.logging.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lupe
 */
public class ViewVolunteerReprts extends javax.swing.JFrame {

    final String myDBURL = "jdbc:sqlserver://sql5008.site4now.net:1433;DatabaseName=DB_A47087_smgroup;user=DB_A47087_smgroup_admin;password=ftccgroup1";
    
    private static Connection conn = null;
    private static Statement statement = null;
    
   
    /**
     * Creates new form ViewVolunteerReprts
     */
    public ViewVolunteerReprts() {
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

        jbgOrder = new javax.swing.ButtonGroup();
        jbgFilters = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtableScroll = new javax.swing.JScrollPane();
        VolunteersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbSort = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jbtnAsc = new javax.swing.JRadioButton();
        jbtnDes = new javax.swing.JRadioButton();
        jbtnNone = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jbtnOlder13 = new javax.swing.JRadioButton();
        jbtnMales = new javax.swing.JRadioButton();
        jbtnFemales = new javax.swing.JRadioButton();
        jbtnDisplay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viewing Volunteers");
        setPreferredSize(new java.awt.Dimension(1200, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("View Volunteer Reports");

        VolunteersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        VolunteersTable.setPreferredSize(new java.awt.Dimension(800, 450));
        jtableScroll.setViewportView(VolunteersTable);

        jLabel2.setText("Sort By");

        jcbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jcbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Order");

        jbgOrder.add(jbtnAsc);
        jbtnAsc.setText("Ascending");
        jbtnAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAscActionPerformed(evt);
            }
        });

        jbgOrder.add(jbtnDes);
        jbtnDes.setText("Descending");

        jbgOrder.add(jbtnNone);
        jbtnNone.setText("None");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNone)
                    .addComponent(jbtnDes)
                    .addComponent(jbtnAsc))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnAsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnDes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnNone)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setText("Filter By");

        jbgFilters.add(jbtnOlder13);
        jbtnOlder13.setText("Older than 13");

        jbgFilters.add(jbtnMales);
        jbtnMales.setText("Males Only");

        jbgFilters.add(jbtnFemales);
        jbtnFemales.setText("Females Only");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnMales)
                            .addComponent(jbtnOlder13)
                            .addComponent(jbtnFemales))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnOlder13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnMales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnFemales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnDisplay.setText("Display Reports");
        jbtnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jtableScroll)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnDisplay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(323, 323, 323))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jtableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAscActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jbtnNone.isSelected();
        
        //vectors to hold data and column names
        Vector<String> columnNames = new Vector<String>();
        Vector<Object> data = new Vector<Object>();
        
        try
        {
            //Read data from database
            conn = DriverManager.getConnection(myDBURL);
            statement = conn.createStatement();
            
            ResultSet volunteers = statement.executeQuery("SELECT * FROM [DB_A47087_smgroup].[dbo].[Volunteer]");
            ResultSetMetaData volunteersMD = volunteers.getMetaData();
            int columns = volunteersMD.getColumnCount();
            
            //Get the data from database
            for (int i = 1; i <= columns; i++)
            {
                columnNames.addElement( volunteersMD.getColumnName(i) );
            }
            while (volunteers.next()) 
            {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columns; columnIndex++) {
                    vector.add(volunteers.getObject(columnIndex));
                }
                data.add(vector);
            }
            
            DefaultTableModel volModel = new DefaultTableModel(data, columnNames)
            {
                @Override
                public Class getColumnClass(int column)
                {
                    for (int row = 0; row < getRowCount(); row++)
                    {
                        Object o = getValueAt(row, column);

                        if (o != null)
                        {
                            return o.getClass();
                        }
                    }

                    return Object.class;
                }
            };
            
            VolunteersTable.setModel(volModel);
            
            //Get column names for combo box
            volunteers = null;
            volunteersMD = null;
            jcbSort.removeAllItems();
            
            volunteers = statement.executeQuery("SELECT * FROM [DB_A47087_smgroup].[dbo].[Volunteer]");
            volunteersMD = volunteers.getMetaData();
            columns = volunteersMD.getColumnCount();
            String results = "";
            
            //add blank first
            jcbSort.addItem("");

            //Get the data from database 
            for (int i = 1; i <= columns; i++)
            {
                jcbSort.addItem( volunteersMD.getColumnName(i) );
            }
            
            JOptionPane.showMessageDialog(null, "SQL Data has been entered in the jTable");
        }
        catch(SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jbtnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDisplayActionPerformed
        // TODO add your handling code here:
        // Get info from sort, filter, order
        String sqlSort = "";
        String sqlFilter = "";
        String sqlOrder = "";
        String startSQL = "SELECT * FROM [DB_A47087_smgroup].[dbo].[Volunteer]";
        
        switch(jcbSort.getSelectedIndex())
        {
            case 0:
                sqlSort = "";
                break;
            case 1:
                sqlSort = " ORDER BY Volunteer_ID";
                break;
            case 2:
                sqlSort = " ORDER BY Last_Name";
                break;
            case 3:
                sqlSort = " ORDER BY First_Name";
                break;
            case 4:
                sqlSort = " ORDER BY Middle_Name";
                break;
            case 5:
                sqlSort  = " ORDER BY Phone";
                break;
            case 6:
                sqlSort = " ORDER BY Email";
                break;
            case 7:
                sqlSort = " ORDER BY Preferred_Method_Of_Contact";
                break;
            case 8:
                sqlSort = " ORDER BY BirthDate";
                break;
            case 9:
                sqlSort = " ORDER BY Gender";
                break;
            case 10:
                sqlSort = " ORDER BY Emergency_Contact_Phone";
                break;
            case 11:
                sqlSort = " ORDER BY Emergency_Contact_Name";
                break;
            case 12:
                sqlSort = " ORDER BY Community_Service";
                break;
        }
        
        if(jbtnOlder13.isSelected())
        {
            sqlFilter = "";
        }
        
    }//GEN-LAST:event_jbtnDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVolunteerReprts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVolunteerReprts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVolunteerReprts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVolunteerReprts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVolunteerReprts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VolunteersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup jbgFilters;
    private javax.swing.ButtonGroup jbgOrder;
    private javax.swing.JRadioButton jbtnAsc;
    private javax.swing.JRadioButton jbtnDes;
    private javax.swing.JButton jbtnDisplay;
    private javax.swing.JRadioButton jbtnFemales;
    private javax.swing.JRadioButton jbtnMales;
    private javax.swing.JRadioButton jbtnNone;
    private javax.swing.JRadioButton jbtnOlder13;
    private javax.swing.JComboBox<String> jcbSort;
    private javax.swing.JScrollPane jtableScroll;
    // End of variables declaration//GEN-END:variables
}
