package Game;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Input_password extends javax.swing.JFrame implements MyUtil {

  String text = "";
    public Input_password() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Show = new javax.swing.JLabel();
        Two = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Fire = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Ok = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        BackBG = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");

        jPanel1.setLayout(null);

        Show.setBackground(new java.awt.Color(204, 255, 102));
        Show.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        Show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Show.setOpaque(true);
        jPanel1.add(Show);
        Show.setBounds(500, 90, 290, 90);

        Two.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Two.setText("2");
        Two.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });
        jPanel1.add(Two);
        Two.setBounds(600, 200, 90, 80);

        One.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        One.setText("1");
        One.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });
        jPanel1.add(One);
        One.setBounds(500, 200, 90, 80);

        Three.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Three.setText("3");
        Three.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });
        jPanel1.add(Three);
        Three.setBounds(700, 200, 90, 80);

        Four.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Four.setText("4");
        Four.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });
        jPanel1.add(Four);
        Four.setBounds(500, 300, 90, 80);

        Fire.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Fire.setText("5");
        Fire.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Fire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireActionPerformed(evt);
            }
        });
        jPanel1.add(Fire);
        Fire.setBounds(600, 300, 90, 80);

        Six.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Six.setText("6");
        Six.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });
        jPanel1.add(Six);
        Six.setBounds(700, 300, 90, 80);

        Eight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Eight.setText("8");
        Eight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });
        jPanel1.add(Eight);
        Eight.setBounds(600, 400, 90, 80);

        Nine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nine.setText("9");
        Nine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });
        jPanel1.add(Nine);
        Nine.setBounds(700, 400, 90, 80);

        Seven.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seven.setText("7");
        Seven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });
        jPanel1.add(Seven);
        Seven.setBounds(500, 400, 90, 80);

        Ok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ok.setText("OK");
        Ok.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });
        jPanel1.add(Ok);
        Ok.setBounds(700, 500, 90, 80);

        Del.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Del.setText("DEL");
        Del.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        jPanel1.add(Del);
        Del.setBounds(500, 500, 90, 80);

        Zero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Zero.setText("0");
        Zero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });
        jPanel1.add(Zero);
        Zero.setBounds(600, 500, 90, 80);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/LeftHallways.png"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1280, 720);

        Back.setText("back");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(70, 590, 70, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    static void Playsound(File Sound){
        try {
         // Open an audio input stream.
         Clip clip = AudioSystem.getClip();
         clip.open(AudioSystem.getAudioInputStream(Sound));
         clip.start();
         
         Thread.sleep(clip.getMicrosecondLength()/1000);
         
        }catch(Exception e){
        }
    }
    
    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
      File back = new File("buttonMenu.wav");
      Playsound(back);
      text += One.getText();
      Show.setText(text);
    }//GEN-LAST:event_OneActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
      File back = new File("buttonMenu.wav");
      Playsound(back);
      text += Two.getText();
      Show.setText(text);
    }//GEN-LAST:event_TwoActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Three.getText();
        Show.setText(text);
    }//GEN-LAST:event_ThreeActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Four.getText();
         Show.setText(text);
    }//GEN-LAST:event_FourActionPerformed

    private void FireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FireActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Fire.getText();
         Show.setText(text);
    }//GEN-LAST:event_FireActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Six.getText();
         Show.setText(text);
    }//GEN-LAST:event_SixActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back); 
        text +=  Seven.getText();
         Show.setText(text);
    }//GEN-LAST:event_SevenActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Eight.getText();
         Show.setText(text);
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Nine.getText();
         Show.setText(text);
    }//GEN-LAST:event_NineActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text +=  Zero.getText();
        Show.setText(text);
    }//GEN-LAST:event_ZeroActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        File back = new File("buttonMenu.wav");
        Playsound(back);
        text = "";
        Show.setText(text);
    }//GEN-LAST:event_DelActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed

            try (OutputStream output = new FileOutputStream(PATH)){
            Properties prop = new Properties();
           
            if("579".equals(text)|| "589".equals(text)|| "586".equals(text)||"592".equals(text)||"801".equals(text)||"277".equals(text)){
                File open = new File("closedoor.wav");
                Playsound(open);
                prop.setProperty(KEY_Room2, "true");
                 prop.store(output, null);
                 System.out.println(prop);
                 ButlerRoom next = new ButlerRoom();
                  next.setVisible(true);
                 setVisible(false);
            }
            else{
                prop.setProperty(KEY_Room2, "false");
                 prop.store(output, null);
                 System.out.println(prop);
                 JOptionPane.showInternalMessageDialog(null, "Please again");
                
            }
        }
        catch(IOException io){
            JOptionPane.showInternalMessageDialog(null, "Please again");
        }
    }//GEN-LAST:event_OkActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        File back = new File("back.wav");
        Playsound(back);
        LeftHallways backk = new LeftHallways();
        backk.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Input_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Del;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Fire;
    private javax.swing.JButton Four;
    private javax.swing.JButton Nine;
    private javax.swing.JButton Ok;
    private javax.swing.JButton One;
    private javax.swing.JButton Seven;
    private javax.swing.JLabel Show;
    private javax.swing.JButton Six;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
