
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
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
public class login2 extends javax.swing.JFrame {
int i;
Timer t;
    /**
     * Creates new form login2
     */
    public login2() {
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

        layer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        reference_caps = new javax.swing.JLabel();
        caps1 = new javax.swing.JButton();
        caps = new javax.swing.JLabel();
        pb1 = new javax.swing.JProgressBar();
        NOTIFICATION = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JButton();
        UN = new javax.swing.JLabel();
        PAS = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WWW.SASOFTECH.IN");
        setMaximumSize(new java.awt.Dimension(1366, 725));
        setMinimumSize(new java.awt.Dimension(1366, 725));
        setPreferredSize(new java.awt.Dimension(1366, 725));
        setResizable(false);
        setState(1);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layer.setMaximumSize(new java.awt.Dimension(1366, 725));
        layer.setMinimumSize(new java.awt.Dimension(1366, 725));
        layer.setPreferredSize(new java.awt.Dimension(1366, 725));
        layer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loading.gif"))); // NOI18N
        jLabel9.setText("PROCESSING AND VERIFYING DETAILS...");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 540, 540));

        layer.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -60, 540, 1020));

        getContentPane().add(layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1390, -1));

        reference_caps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reference_caps.setForeground(new java.awt.Color(235, 222, 17));
        reference_caps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics-exclamation-mark-939991.gif"))); // NOI18N
        getContentPane().add(reference_caps, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 60));

        caps1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics-exclamation-mark-939991.gif"))); // NOI18N
        caps1.setToolTipText("TURN CAPS LOCK OFF ");
        caps1.setContentAreaFilled(false);
        caps1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        caps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caps1ActionPerformed(evt);
            }
        });
        getContentPane().add(caps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 200, 40));

        caps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caps.setForeground(new java.awt.Color(235, 222, 17));
        getContentPane().add(caps, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 160, 30));

        pb1.setBackground(new java.awt.Color(30, 172, 219));
        pb1.setForeground(new java.awt.Color(0, 0, 0));
        pb1.setBorderPainted(false);
        getContentPane().add(pb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1910, 30));

        NOTIFICATION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NOTIFICATION.setForeground(new java.awt.Color(153, 153, 153));
        NOTIFICATION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NOTIFICATION.setText("FOR NEW REGISTRATION AS SALESMAN PLEASE CONTACT OUR EXECUTIVE OR MAIL US at info@sasoftech.in");
        getContentPane().add(NOTIFICATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 720, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                                            shopping  habits  sorted  out  .....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 490, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("         Copyright © SASOFTECH TECHNOLOGY SOLUTIONS. All rights reserved.");
        jLabel6.setMaximumSize(new java.awt.Dimension(1366, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(1366, 17));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(1366, 17));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1366, 30));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(233, 232, 232));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head6.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 1120, 50));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show.setText("SHOW");
        show.setBorder(null);
        show.setBorderPainted(false);
        show.setContentAreaFilled(false);
        show.setMargin(null);
        show.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        show.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 116, 50, 20));

        UN.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        UN.setForeground(new java.awt.Color(255, 255, 255));
        UN.setText("<html><font face=\"Californian FB\" size=\"5\">Agent ID</font></html>");
        jPanel1.add(UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 92, 20));

        PAS.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        PAS.setForeground(new java.awt.Color(255, 255, 255));
        PAS.setText("<html><font face=\"Californian FB\" size=\"5\">Password</font></html>");
        jPanel1.add(PAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 120, 60));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, 120, 60));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 43, 380, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 115, 380, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 540, 320));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SALESMAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 300, 30));

        ID.setBackground(new java.awt.Color(245, 249, 251));
        ID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log1.png"))); // NOI18N
        ID.setToolTipText("LOGIN");
        ID.setBorder(null);
        ID.setBorderPainted(false);
        ID.setContentAreaFilled(false);
        ID.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/log2.png"))); // NOI18N
        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IDMouseReleased(evt);
            }
        });
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 520, 300));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton4.setToolTipText("HOME");
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/home2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 120));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_main.png"))); // NOI18N
        jButton5.setToolTipText("PREVIOUS PAGE");
        jButton5.setContentAreaFilled(false);
        jButton5.setHideActionText(true);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/back_main_glow.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 130, 90));

        jButton6.setToolTipText("PREVIOUS PAGE");
        jButton6.setContentAreaFilled(false);
        jButton6.setHideActionText(true);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 300, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -30, 390, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -30, 390, 180));

        background_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        background_lbl.setMaximumSize(new java.awt.Dimension(1366, 725));
        background_lbl.setMinimumSize(new java.awt.Dimension(1366, 725));
        background_lbl.setPreferredSize(new java.awt.Dimension(1366, 725));
        getContentPane().add(background_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         Thread t = new Thread(new Runnable(){
            private int counter = 0;
            public void run() {
                while (true){
                    counter++;
                    SwingUtilities.invokeLater(new Runnable(){
                        public void run() {
                            if (counter % 2 == 0){
                                Color g1 = new Color(102,102,102);
                                NOTIFICATION.setForeground(g1);
                                counter = 0;
                            } else {
                                Color g2 = new Color(153,153,153);
                                NOTIFICATION.setForeground(g2);
                            }
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        layer.setVisible(false);
        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true);
        caps.setVisible(false);
        NOTIFICATION.setVisible(false);
        caps1.setVisible(false);
        UN.setVisible(false);
        PAS.setVisible(false);
        username.setVisible(false);
        password.setVisible(false);
        login_btn.setVisible(false);
        background_lbl.setVisible(true);
        jButton2.setVisible(false);
        ID.setVisible(true);
        reference_caps.setVisible(false);
        jPanel1.setVisible(false);  
        pb1.setVisible(false);    
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UN.setVisible(false);
        NOTIFICATION.setVisible(false);
        caps1.setVisible(false);
        caps.setVisible(false);
        PAS.setVisible(false);
        username.setVisible(false);
        password.setVisible(false);
        login_btn.setVisible(false);
        jButton2.setVisible(false);
        ID.setVisible(true);
        background_lbl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed

                try{      
            int flag=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilesr","root","opjs");
            String sql="Select * from login2;";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            final String log=username.getText();
            String pass =new String(password.getPassword());
            while(rs.next()){
                if(log.equalsIgnoreCase(rs.getString(1)) && pass.equals(rs.getString(2)))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                i=0;
                
                layer.setVisible(true);
                layer.setBackground(new Color(0, 0, 0, 150));  
                t=new Timer(5,new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        i++;
                if(i>60){
                    jLabel9.setText("LOGGING IN AS SALESMAN...");
                }
                        
                        if(i>120){
                            t.stop();
                            new Agent_page(log).setVisible(true);
                            dispose();
                        }
                    }
                });

                t.start();

            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error", "Please check user name / password",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseClicked

    private void IDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseEntered

    private void IDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseExited

        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseExited

    private void IDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_IDMousePressed

    private void IDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseReleased

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        NOTIFICATION.setVisible(true);
        caps.setVisible(true);
        caps1.setVisible(true);
        //CAPS LOCK LABEL UPDATION STARTS HERE
        caps.setVisible(true);
        caps1.setVisible(true);
        Thread t = new Thread(new Runnable(){
            private int counter = 0;
            public void run() {
                while (true){
                    counter++;
                    SwingUtilities.invokeLater(new Runnable(){
                        public void run() {
                                boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
                                 if(isOn==true){ 
                                     caps1.setIcon(reference_caps.getIcon());
                                     caps.setText("CAPS LOCK IS ON");
                                 }
                                 else if(isOn==false){
                                     caps1.setIcon(null);
                                     caps.setText("");         
                                 }
                        }
                    });
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        //CAPS LOCK LABEL UPDATION ENDS HERE
        
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("login.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException ex)
        {
            System.out.println("Error with playing sound.");
        }
        UN.setVisible(true);
        PAS.setVisible(true);
        username.setVisible(true);
        password.setVisible(true);
        login_btn.setVisible(true);
        jButton2.setVisible(true);
        ID.setVisible(false);
        jPanel1.setVisible(true);
        background_lbl.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 dispose();
    new index().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        new index2().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        new index().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void caps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caps1ActionPerformed
        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
    }//GEN-LAST:event_caps1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.getText().equals("SHOW")){
            password.setEchoChar((char)0);
            show.setText("HIDE");
            show.setForeground(new Color(38,85,116));
        }
        else if(show.getText().equals("HIDE")){
            password.setEchoChar('*');
            show.setText("SHOW");
            show.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_showActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        login_btn.doClick();
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ID;
    private javax.swing.JLabel NOTIFICATION;
    private javax.swing.JLabel PAS;
    private javax.swing.JLabel UN;
    private javax.swing.JLabel background_lbl;
    private javax.swing.JLabel caps;
    private javax.swing.JButton caps1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel layer;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField password;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JLabel reference_caps;
    private javax.swing.JButton show;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
