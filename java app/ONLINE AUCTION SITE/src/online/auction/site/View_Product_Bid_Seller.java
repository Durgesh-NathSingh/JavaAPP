/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online.auction.site;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author AMAN KUMAR
 */
public class View_Product_Bid_Seller extends javax.swing.JFrame {

     String user="root";
    String url="jdbc:mysql://localhost:3306/auction";
    String pass="99Aman*kr";
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    
    String BidderId= "";
    String SellerId= "";
   
    /**
     * Creates new form View_Product_Bid_Seller
     */
    public View_Product_Bid_Seller() {
        initComponents();
    }

    void productdata(String Category,String ProductId,String ProductName,String Price,String info,Image im,String Userid,String Seller_id,String endtimeto)
    {
        category.setText(Category);
        product_id.setText(ProductId);
        product_name.setText(ProductName);
        price.setText(Price);
        description.setText(info);
       SellerId=Seller_id;   
       end_time.setText(endtimeto);
         Image myimg= im.getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon newImage= new ImageIcon(myimg);
         img1.setIcon(newImage);
        BidderId=   Userid;
        bidding_amount.setText(Price);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        img1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        product_id = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        product_name = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        make_bid = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        bidding_amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        end_time = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

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
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, -1));

        img1.setText(".");
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 180, 230));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Product Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("End Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 28));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Product Description");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        category.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        category.setText("jLabel1");
        getContentPane().add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 80, 24));

        product_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        product_id.setText("jLabel1");
        getContentPane().add(product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 66, 24));

        price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        price.setText("jLabel1");
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 66, 24));

        product_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        product_name.setText("jLabel1");
        getContentPane().add(product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 66, 24));

        description.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        description.setText("jLabel1");
        description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 189, 60));

        make_bid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        make_bid.setText("Make Bid");
        make_bid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                make_bidMouseClicked(evt);
            }
        });
        getContentPane().add(make_bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Enter Bid Amount");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, -1, -1));
        getContentPane().add(bidding_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Bid On Product");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Current Bid Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, 28));

        end_time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        end_time.setText("jLabel10");
        getContentPane().add(end_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/auction/site/fotor_2023-3-21_3_5_55.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:

        Seller sf=new Seller();
        sf.userid(BidderId);
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void make_bidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_make_bidMouseClicked

        try {
            int base_price=Integer.parseInt(price.getText());

            int bid_amount=Integer.parseInt(bidding_amount.getText());
            if(bid_amount>base_price)
            {
                base_price=bid_amount;
                price.setText(""+base_price);

                con = DriverManager.getConnection(url,user,pass);
                //
                String sql = "UPDATE product set Amount = ?,Bidder_Id = ? where ProductId='" + product_id.getText() +"'";
                PreparedStatement st=(PreparedStatement)con.prepareStatement(sql);
                //
                st.setString(1,(String)price.getText());
                st.setString(2,SellerId);
                st.executeUpdate();
                String sql1 = "insert into winner values(?,?,?,?,?)";
                PreparedStatement stmt1=(PreparedStatement)con.prepareStatement(sql1);
                stmt1.setString(1,(String)product_id.getText());
                stmt1.setString(2,(String)product_name.getText());
                stmt1.setString(3, SellerId);
                stmt1.setString(4, SellerId);
                stmt1.setString(5, (String)price.getText());
                stmt1.executeUpdate();

                JOptionPane.showMessageDialog(this, "Bidded Successfully");
                con.close();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please Enter Bid amount greater than Current Bid amount");

            }

        }

        catch (Exception ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_make_bidMouseClicked

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
            java.util.logging.Logger.getLogger(View_Product_Bid_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Product_Bid_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Product_Bid_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Product_Bid_Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Product_Bid_Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bidding_amount;
    private javax.swing.JLabel category;
    private javax.swing.JLabel description;
    private javax.swing.JLabel end_time;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton make_bid;
    private javax.swing.JLabel price;
    private javax.swing.JLabel product_id;
    private javax.swing.JLabel product_name;
    // End of variables declaration//GEN-END:variables
}
