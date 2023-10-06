/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online.auction.site;

import java.sql.Connection;
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
public class Registration extends javax.swing.JFrame {
    
    String user="root";
    String url="jdbc:mysql://localhost:3306/auction";
    String pass="99Aman*kr";
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rss = null;
    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usrtype = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Register");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 140, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 62, -1));

        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit.setText("Register");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("User ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 180, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Phone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("UserType");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        usrtype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usrtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seller", "Bidder" }));
        usrtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usrtypeMouseClicked(evt);
            }
        });
        usrtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrtypeActionPerformed(evt);
            }
        });
        getContentPane().add(usrtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 180, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 180, 30));

        jToggleButton1.setText("Back ");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 620, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/auction/site/fotor_2023-3-21_2_27_56.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        try {
            // TODO add your handling code here:
        
            con = DriverManager.getConnection(url,user,pass);
            if(((String)usrtype.getSelectedItem()).equals("Seller"))
            {
              
               String userid_check=userid.getText(); 
               String name_check=name.getText();
               String phone_check=phone.getText();
               boolean flag=true;
               boolean flag_phone=true;
               boolean flag_empty=true;
               boolean flag_email=false;
               boolean flag_userid=false;
               
               String email_check=email.getText();
            
            if((userid_check.charAt(0)>='A' && userid_check.charAt(0)<='Z')||(userid_check.charAt(0)>='a' && userid_check.charAt(0)<='z') )
              flag_userid=true;
            
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
            if (name.getText().isEmpty() || userid.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getText().isEmpty()) {
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
            
            if(flag==true  && flag_phone==true && flag_empty==true && flag_email==true && flag_userid==true && checkpassword(password.getText())==true)
            {
                String sql = "insert into seller values(?,?,?,?,?)";   
            PreparedStatement st=(PreparedStatement)con.prepareStatement(sql);
            st.setString(1,userid.getText());
            st.setString(2,name.getText());
            st.setString(3, email.getText());
            st.setString(4, phone.getText());
            st.setString(5, password.getText());
            //st.setString(6,(String)usrtype.getSelectedItem());
             st.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Added Successfully");
            con.close();
            }
            else 
            {
                if(flag_userid==false)
                {
                   JOptionPane.showMessageDialog(this, "User Id must start with character!");
 
                }
               else if(flag_empty==false)
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
            else
            {
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
            
            if (name.getText().isEmpty() || userid.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getText().isEmpty()) {
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
            
            if(flag==true  && flag_phone==true && flag_empty==true && flag_email==true)
            {
                String sql = "insert into bidder values(?,?,?,?,?)";   
            PreparedStatement st=(PreparedStatement)con.prepareStatement(sql);
            st.setString(1,userid.getText());
            st.setString(2,name.getText());
            st.setString(3, email.getText());
            st.setString(4, phone.getText());
            st.setString(5, password.getText());
           // st.setString(6,(String)usrtype.getSelectedItem());
                 st.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Added Successfully");
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
                         
            }
            
        } 
        }
        catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void usrtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrtypeActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usrtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrtypeMouseClicked
        
    }//GEN-LAST:event_usrtypeMouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
          new Login().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
       
    }//GEN-LAST:event_nameKeyPressed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton submit;
    private javax.swing.JTextField userid;
    private javax.swing.JComboBox<String> usrtype;
    // End of variables declaration//GEN-END:variables
}
