/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsresults;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Robert
 */
public class PrintResults extends javax.swing.JFrame {

    connect connect = new connect();
    private final String mname;

    /**
     * Creates new form PrintResults
     *
     * @param lname
     * @param fname
     * @param mname
     * @param course
     * @param grad
     */
    public PrintResults(String lname, String fname, String mname, String course, String grad) {
        initComponents();

        // sql statment
        connect.setSql("SELECT *FROM enroll where regNo='" + lname + "'");
        //get result
        ResultSet result = connect.getResultSet();
        // set data on to table
        jt_results.setModel(DbUtils.resultSetToTableModel(result));
        this.mname = mname;

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_results = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(695, 597));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("REGESTRIASTION NUMBER :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(124, 147, 170, 15);

        jLabel2.setText("YEAR :  2015");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(124, 193, 130, 15);

        jLabel3.setText("SEMESTER : TWO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(124, 239, 140, 15);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pd.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(366, 111, 150, 167);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel5.setText("Put your logo here");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(124, 21, 415, 45);

        jt_results.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jt_results);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(71, 324, 519, 140);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(124, 514, 89, 35);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "works!!!!!!!!");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrintResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrintResults u = new PrintResults(null, null, null, null, null);
                u.setVisible(true);
//                u.setDefaultCloseOperation(EXIT_ON_CLOSE);
                u.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_results;
    // End of variables declaration//GEN-END:variables
}
