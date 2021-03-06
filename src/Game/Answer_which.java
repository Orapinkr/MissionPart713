package Game;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Answer_which extends javax.swing.JFrame implements MyUtil {

    /**
     * Creates new form Answer_which
     */
    public Answer_which() {
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

        jPanel1 = new javax.swing.JPanel();
        Hammer = new javax.swing.JButton();
        Rope = new javax.swing.JButton();
        Cutter = new javax.swing.JButton();
        Chalang = new javax.swing.JButton();
        Kan = new javax.swing.JButton();
        Which = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Hammer.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Hammer.setText("ค้อน");
        Hammer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HammerActionPerformed(evt);
            }
        });
        jPanel1.add(Hammer);
        Hammer.setBounds(470, 550, 350, 50);

        Rope.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Rope.setText("เชือก");
        Rope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RopeActionPerformed(evt);
            }
        });
        jPanel1.add(Rope);
        Rope.setBounds(470, 460, 350, 50);

        Cutter.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Cutter.setText("มีด");
        Cutter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutterActionPerformed(evt);
            }
        });
        jPanel1.add(Cutter);
        Cutter.setBounds(470, 280, 350, 50);

        Chalang.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Chalang.setText("ชะแลง");
        Chalang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChalangActionPerformed(evt);
            }
        });
        jPanel1.add(Chalang);
        Chalang.setBounds(470, 370, 350, 50);

        Kan.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Kan.setText("ปืน");
        Kan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KanActionPerformed(evt);
            }
        });
        jPanel1.add(Kan);
        Kan.setBounds(470, 190, 350, 50);

        Which.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        Which.setForeground(new java.awt.Color(255, 255, 255));
        Which.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Which.setText("อาวุธที่ใช้ในการฆาตกรรม");
        jPanel1.add(Which);
        Which.setBounds(420, 70, 440, 80);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/AnsBG.png"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
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
    
    private void KanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KanActionPerformed
            File backk = new File("buttonMenu.wav");
            Playsound(backk);
            Text2[1] =Kan.getText();
            Answer_Where nextt = new Answer_Where();
            nextt.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_KanActionPerformed

    private void CutterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutterActionPerformed
            File backk = new File("buttonMenu.wav");
            Playsound(backk);
            Text2[1] =Cutter.getText();
            Answer_Where nextt = new Answer_Where();
            nextt.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_CutterActionPerformed

    private void ChalangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChalangActionPerformed
            File backk = new File("buttonMenu.wav");
            Playsound(backk);
            Text2[1] = Chalang.getText();
            Answer_Where nextt = new Answer_Where();
            nextt.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_ChalangActionPerformed

    private void RopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RopeActionPerformed
            File backk = new File("buttonMenu.wav");
            Playsound(backk);
            Text2[1] =Rope.getText();
            Answer_Where nextt = new Answer_Where();
            nextt.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_RopeActionPerformed

    private void HammerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HammerActionPerformed
            File backk = new File("buttonMenu.wav");
            Playsound(backk);
            Text2[1] = Hammer.getText();
            Answer_Where nextt = new Answer_Where();
            nextt.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_HammerActionPerformed

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
            java.util.logging.Logger.getLogger(Answer_which.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Answer_which.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Answer_which.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Answer_which.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Answer_which().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Chalang;
    private javax.swing.JButton Cutter;
    private javax.swing.JButton Hammer;
    private javax.swing.JButton Kan;
    private javax.swing.JButton Rope;
    private javax.swing.JLabel Which;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
