/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online.auction.site;

import com.mysql.cj.xdevapi.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Manage_Seller extends javax.swing.JFrame {

    String user="root";
    String url="jdbc:mysql://localhost:3306/auction";
    String pass="99Aman*kr";
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    /**
     * Creates new form Manage_Seller
     */
    public Manage_Seller() {
        initComponents();
        show_user();
    }
    
    public ArrayList<User> userList(){
        ArrayList<User> usersList= new ArrayList<>();
        try{
            
              con = DriverManager.getConnection(url,user,pass);
            
          String sql = "Select * from seller";   
            PreparedStatement st=(PreparedStatement)con.prepareStatement(sql);
           //Statement stmt=(Statement) con.createStatement();
           rs= st.executeQuery(sql);    
          
           User user;
           while(rs.next())
           {
               user =new User(rs.getString("UserId"),rs.getString("Name"));
               usersList.add(user);
           }
            con.close();
            
        }
        catch(Exception e)
        {
                        JOptionPane.showMessageDialog(null,e);

        }
        return usersList;
    } 
    public void show_user()
    {
        ArrayList<User> list = userList();
        DefaultTableModel model= (DefaultTableModel)user_table.getModel();
        Object[] row = new Object[2];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getUserId();
            row[1]=list.get(i).getName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        delete = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserId", "Name"
            }
        ));
        jScrollPane1.setViewportView(user_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 560, 220));

        delete.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));

        jToggleButton1.setText("Back");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Seller");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/auction/site/fotor_2023-3-21_3_5_55.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       
        int selectedRow = user_table.getSelectedRow(); // get selected row index
        DefaultTableModel model = (DefaultTableModel) user_table.getModel(); // get table model
        String id = model.getValueAt(selectedRow, 0).toString(); // get value from column 0 (assuming it's the id)
        String deleteQuery = "DELETE FROM seller WHERE UserId='" + id + "'"; // construct delete statement
         try {
           con = DriverManager.getConnection(url,user,pass);
           PreparedStatement st=(PreparedStatement)con.prepareStatement(deleteQuery);
           st.executeUpdate(deleteQuery); // execute delete statement
           ResultSet rs = st.executeQuery("SELECT UserId,Name FROM seller"); // re-execute select statement
           user_table.setModel(DbUtils.resultSetToTableModel(rs)); // set updated table model
         } 
         catch (SQLException ex) 
         {
                JOptionPane.showMessageDialog(null,ex );
         }
        
    }//GEN-LAST:event_deleteMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        
         new Admin_Dashboard().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Manage_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable user_table;
    // End of variables declaration//GEN-END:variables
}
