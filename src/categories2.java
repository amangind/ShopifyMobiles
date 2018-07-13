
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sourabh
 */
public class categories2 extends javax.swing.JFrame {
    String name1;
int i;
Timer t;
    /**
     * Creates new form index2
     */
    public categories2(){     
        initComponents();
    }
        public categories2(String log) {
        name1=log.toLowerCase();
        initComponents();
        if(name1.equalsIgnoreCase("null")||name1.equalsIgnoreCase("guest")){
            name1="GUEST";
        }
        else{
            name1=log.toUpperCase();
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

        hello_image_btn = new javax.swing.JButton();
        username_btn = new javax.swing.JButton();
        drop_down_pnl = new javax.swing.JPanel();
        customer_photo_lbl = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        account_btn = new javax.swing.JButton();
        my_cart_btn = new javax.swing.JButton();
        dd_logout_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pb1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlbl = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOPIFY MOBILES");
        setMaximumSize(new java.awt.Dimension(1366, 725));
        setMinimumSize(new java.awt.Dimension(1366, 725));
        setPreferredSize(new java.awt.Dimension(1366, 725));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hello_image_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pointee_logo.png"))); // NOI18N
        hello_image_btn.setContentAreaFilled(false);
        hello_image_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hello_image_btnActionPerformed(evt);
            }
        });
        getContentPane().add(hello_image_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, -10, 70, 80));

        username_btn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        username_btn.setForeground(new java.awt.Color(187, 229, 252));
        username_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        username_btn.setBorderPainted(false);
        username_btn.setContentAreaFilled(false);
        username_btn.setPreferredSize(new java.awt.Dimension(0, 0));
        username_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                username_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                username_btnMouseExited(evt);
            }
        });
        username_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_btnActionPerformed(evt);
            }
        });
        getContentPane().add(username_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 50, 110, 30));

        drop_down_pnl.setOpaque(false);
        drop_down_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drop_down_pnlMouseExited(evt);
            }
        });
        drop_down_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer_photo_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customer_photo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/default_customer_icon.png"))); // NOI18N
        drop_down_pnl.add(customer_photo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, 80));
        drop_down_pnl.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 143, -1));

        account_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        account_btn.setText("Your Account");
        account_btn.setBorderPainted(false);
        account_btn.setContentAreaFilled(false);
        account_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        account_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        account_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                account_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                account_btnMouseExited(evt);
            }
        });
        account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_btnActionPerformed(evt);
            }
        });
        drop_down_pnl.add(account_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 160, -1));

        my_cart_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        my_cart_btn.setText("Your Cart");
        my_cart_btn.setBorderPainted(false);
        my_cart_btn.setContentAreaFilled(false);
        my_cart_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        my_cart_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        my_cart_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                my_cart_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                my_cart_btnMouseExited(evt);
            }
        });
        my_cart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_cart_btnActionPerformed(evt);
            }
        });
        drop_down_pnl.add(my_cart_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 160, 30));

        dd_logout_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dd_logout_btn.setBorderPainted(false);
        dd_logout_btn.setContentAreaFilled(false);
        dd_logout_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dd_logout_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dd_logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dd_logout_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dd_logout_btnMouseExited(evt);
            }
        });
        dd_logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_logout_btnActionPerformed(evt);
            }
        });
        drop_down_pnl.add(dd_logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drop_down.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        drop_down_pnl.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 250));

        getContentPane().add(drop_down_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 290, 290));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow_drop.png"))); // NOI18N
        jLabel8.setText(" ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 50, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, -20, 390, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -20, 390, 180));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                                            shopping  habits  sorted  out  .....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 490, 50));

        pb1.setBackground(new java.awt.Color(30, 172, 219));
        pb1.setForeground(new java.awt.Color(0, 0, 0));
        pb1.setBorderPainted(false);
        getContentPane().add(pb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1910, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("                       Copyright © SASOFTECH TECHNOLOGY SOLUTIONS. All rights reserved.");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setMaximumSize(new java.awt.Dimension(1366, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(1366, 17));
        jLabel6.setName(""); // NOI18N
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(1366, 17));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1366, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b6.gif"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setMultiClickThreshhold(3000L);
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 260, 180));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b5.gif"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setMultiClickThreshhold(3000L);
        jButton4.setRolloverEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 210, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grad1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 810, 610));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 27)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(233, 232, 232));
        jLabel9.setText("WELCOME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jlbl.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jlbl.setForeground(new java.awt.Color(127, 209, 255));
        jlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl.setToolTipText("");
        jlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 250, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton5.setToolTipText("HOME");
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/home2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton1.setToolTipText("LOG OUT");
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_hover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 70, 80));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_main.png"))); // NOI18N
        jButton12.setToolTipText("PREVIOUS PAGE");
        jButton12.setContentAreaFilled(false);
        jButton12.setHideActionText(true);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/back_main_glow.png"))); // NOI18N
        jButton12.setSelected(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 0, 120, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 725));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 725));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 725));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        new categories2().setPreferredSize(new Dimension(1366,725));
        new categories2().setMinimumSize(new Dimension(1366,725));
        new categories2().setMaximumSize(new Dimension(1366,725));
        pb1.setVisible(false);      
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
i=0;
        pb1.setVisible(true);
        t=new Timer(2,new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pb1.setValue(i);
                i++;
                if(i>100){
                    t.stop();
                    new mobilebrands(name1,null).setVisible(true);
                    dispose();
                }
            }
        });

        t.start();       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
i=0;
        pb1.setVisible(true);
        t=new Timer(5,new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pb1.setValue(i);
                i++;
                if(i>100){
                    t.stop();
                    new accessories(name1,null).setVisible(true);
                    dispose();
                }
            }
        });

        t.start();    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        drop_down_pnl.setVisible(false);
        jlbl.setText(""+name1);           
        username_btn.setText(""+name1);  
        if((name1.equalsIgnoreCase("guest"))||(name1.equalsIgnoreCase(null))){
            dd_logout_btn.setText("Login");
            dd_logout_btn.setHorizontalAlignment(jlbl.getHorizontalAlignment());
        }
        else{
            try{       
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilesr","root","opjs");
                Statement stmt=con.createStatement();
                String fname="";
                String sql9="select firstname from customers where username='"+name1+"';";
                Statement stmt9=con.createStatement();
                ResultSet rs9=stmt9.executeQuery(sql9);
                while(rs9.next()){
                    fname=rs9.getString(1);
                }
                fname=fname.substring(0,1).toUpperCase()+fname.substring(1).toLowerCase();
                dd_logout_btn.setText("Not "+fname+"? Sign Out");
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        new index().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new login2().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        dispose();
        new login_options().setVisible(true);
        JOptionPane.showMessageDialog( null,"LOGGED OUT SUCCESSFULLY");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void hello_image_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hello_image_btnActionPerformed
        username_btn.doClick();
    }//GEN-LAST:event_hello_image_btnActionPerformed

    private void username_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_btnMouseEntered

        drop_down_pnl.setVisible(true);
        username_btn.setBorderPainted(true);
    }//GEN-LAST:event_username_btnMouseEntered

    private void username_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_btnMouseExited

    }//GEN-LAST:event_username_btnMouseExited

    private void username_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_btnActionPerformed
        if(drop_down_pnl.isVisible()){
            drop_down_pnl.setVisible(false);
        }
        else{
            drop_down_pnl.setVisible(true);
        }
    }//GEN-LAST:event_username_btnActionPerformed

    private void account_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account_btnMouseEntered
        drop_down_pnl.setVisible(true);
        username_btn.setBorderPainted(true);
        account_btn.setForeground(new Color(12,129,201));
    }//GEN-LAST:event_account_btnMouseEntered

    private void account_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account_btnMouseExited
        //        drop_down_pnl.setVisible(false);
        //        username_btn.setBorderPainted(false);
        account_btn.setForeground(Color.black);
    }//GEN-LAST:event_account_btnMouseExited

    private void account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_btnActionPerformed
        if(username_btn.getText().equals(null)||username_btn.getText().equalsIgnoreCase("guest")){
            JOptionPane.showMessageDialog(null,"error","PLEASE LOGIN TO PROCEED",JOptionPane.ERROR_MESSAGE);
        }
        else{
            new customer_profile(name1).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_account_btnActionPerformed

    private void my_cart_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_my_cart_btnMouseEntered
        my_cart_btn.setForeground(new Color(12,129,201));
    }//GEN-LAST:event_my_cart_btnMouseEntered

    private void my_cart_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_my_cart_btnMouseExited
        my_cart_btn.setForeground(Color.black);
    }//GEN-LAST:event_my_cart_btnMouseExited

    private void my_cart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_cart_btnActionPerformed
        if(username_btn.getText().equals(null)||username_btn.getText().equalsIgnoreCase("guest")){
            JOptionPane.showMessageDialog(null,"error","PLEASE LOGIN TO PROCEED",JOptionPane.ERROR_MESSAGE);
        }
        else{
            dispose();
            new mycart(name1).setVisible(true);
        }
        
    }//GEN-LAST:event_my_cart_btnActionPerformed

    private void dd_logout_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dd_logout_btnMouseEntered
        dd_logout_btn.setForeground(new Color(12,129,201));
    }//GEN-LAST:event_dd_logout_btnMouseEntered

    private void dd_logout_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dd_logout_btnMouseExited
        dd_logout_btn.setForeground(Color.black);
    }//GEN-LAST:event_dd_logout_btnMouseExited

    private void dd_logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_logout_btnActionPerformed
        if(dd_logout_btn.getText().equalsIgnoreCase("login")){
            dispose();
            new login_options().setVisible(true);
        }
        else{
        dispose();
        new login_options().setVisible(true);
        JOptionPane.showMessageDialog(null,"LOGGED OUT SUCCESSFULLY.");
        }
    }//GEN-LAST:event_dd_logout_btnActionPerformed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        drop_down_pnl.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void drop_down_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drop_down_pnlMouseExited
        username_btn.setBorderPainted(false);
        drop_down_pnl.setVisible(false);
    }//GEN-LAST:event_drop_down_pnlMouseExited

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
            java.util.logging.Logger.getLogger(index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categories2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account_btn;
    private javax.swing.JLabel customer_photo_lbl;
    private javax.swing.JButton dd_logout_btn;
    private javax.swing.JPanel drop_down_pnl;
    private javax.swing.JButton hello_image_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jlbl;
    private javax.swing.JButton my_cart_btn;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JButton username_btn;
    // End of variables declaration//GEN-END:variables
}
