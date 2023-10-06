/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online.auction.site;


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

/**
 *
 * @author AMAN KUMAR
 */
public class Bidder_Edit_Profile extends javax.swing.JFrame {

    String user="root";
    String url="jdbc:mysql://localhost:3306/auction";
    String pass="99Aman*kr";
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rss = null;
    /**
     * Creates new form Bidder_Edit_Profile
     */
    public Bidder_Edit_Profile() {
        initComponents();
    }
    
     void usersdata(String userId,String username,String email1,String phone1,String password1)
    {
        UserId.setText(userId);
        name.setText(username);
        email.setText(email1);
        phone.setText(phone1);
        password.setText(password1);
        
    }

     boolean checkpassword(String pwrd)
    {
       boolean flag_small=false;
       boolean flag_capital=false;
       boolean flag_int=false;
       
       if(pwrd.length()<8)return false;
       
       for(int i=0;i<pwrd.length();i++)
       {
           if(pwrd.charAt(i)>='a' && pwrd.charAt(i)<='z')
           {
               flag_small=true;
           }
           else if(pwrd.charAt(i)>='A' && pwrd.charAt(i)<='Z')
           {
               flag_capital=true;
           }
           else if(Character.isDigit(pwrd.charAt(i)))
           {
               flag_int=true;
           }
       }
        
       if( flag_small==true && flag_capital==true && flag_int==true)
       {
           return true;
       }
       return false;
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
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        UserId = new javax.swing.JLabel();
        updateButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("UserId");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 221, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 221, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Phone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 221, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 221, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Edit Profile");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 130, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 62, -1));
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 70, 201, -1));

        jToggleButton1.setText("Back");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, -1, -1));

        UserId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserId.setText("jLabel8");
        getContentPane().add(UserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 190, 20));

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/auction/site/fotor_2023-3-21_3_5_55.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
       Bidder_Dashboard sf=new Bidder_Dashboard();
                sf.userid(UserId.getText());
                        sf.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:

            con = DriverManager.getConnection(url,user,pass);

             String name_check=name.getText();
               String phone_check=phone.getText();
               boolean flag=true;
               boolean flag_phone=true;
               boolean flag_empty=true;
               boolean flag_email=false;
               
               String email_check=email.getText();
            
            for(int i=0;i<email_check.length();i++)
            {
                char c=email_check.charAt(i);
                if(c=='@')
                {
                    flag_email=true;
                }
            }
            
           if (!email_check.endsWith("@nitc.ac.in"))
           {
               flag_email=false;
           }
            if (name.getText().isEmpty() || UserId.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getText().isEmpty()) {
                flag_empty=false;
            } 
            
            for(int i=0;i<name_check.length();i++)
            {
                  char c = name_check.charAt(i);
                if(c==' ')continue;
                else
                {
                   if (Character.isDigit(c)) {
                  flag=false;
                    }
                if (!Character.isLetterOrDigit(c)) {
                      flag=false;
                       } 
                }
                
            }
            for(int i=0;i<phone_check.length();i++)
            {
                  char c = phone_check.charAt(i);
                if (!Character.isDigit(c)) {
                  flag_phone=false;
                    }
            }
            
            if(flag==true  && flag_phone==true && flag_empty==true && flag_email==true && checkpassword(password.getText())==true)
            {
            
            String sql = "UPDATE bidder set Name = ?, Email= ?, Phone= ?,Password= ? where UserId='" + UserId.getText() +"'";
            PreparedStatement st=(PreparedStatement)con.prepareStatement(sql);

            st.setString(1,name.getText());
            st.setString(2, email.getText());
            st.setString(3, phone.getText());
            st.setString(4, password.getText());
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update Profile Successfully");
            con.close();
            }
            else 
            {
                  if(flag_empty==false)
                {
                             JOptionPane.showMessageDialog(this, "Empty TextField detected!");
                }
                else if(flag==false)
                            JOptionPane.showMessageDialog(this, "Please Enter Valid Name!");

                else if(flag_phone==false)
                {
                             JOptionPane.showMessageDialog(this, "Please Enter Valid Phone Number!");

                }
                else if(flag_email==false)
                {
                       JOptionPane.showMessageDialog(this, "Please Enter Valid Email!");

                }
                  else if(checkpassword(password.getText())==false)
                {
                       JOptionPane.showMessageDialog(this, "Password is not strong!");

                }
            }
            
           

        }

        catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Bidder_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bidder_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bidder_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bidder_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bidder_Edit_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserId;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JToggleButton updateButton;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}