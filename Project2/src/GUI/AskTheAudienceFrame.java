package GUI;

import Model.Lifeline;
import Model.AskTheAudience;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AskTheAudienceFrame extends javax.swing.JFrame {

    private static Lifeline l;

    /**
     * Creates new form AskTheAudienceFrame
     */
    public AskTheAudienceFrame(Lifeline a) {
        this.l = a;
        this.setContentPane(new JLabel(new ImageIcon("src/Image/Background.png")));
        initComponents();

        this.jProgressBar1.setValue(((AskTheAudience) a).getRandNumA());
        this.jProgressBar2.setValue(((AskTheAudience) a).getRandNumB());
        this.jProgressBar3.setValue(((AskTheAudience) a).getRandNumC());
        this.jProgressBar4.setValue(((AskTheAudience) a).getRandNumD());

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        ContinueLabel = new javax.swing.JLabel();
        ALabel = new javax.swing.JLabel();
        BLabel = new javax.swing.JLabel();
        CLabel = new javax.swing.JLabel();
        DLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ask the Audience");
        setPreferredSize(new java.awt.Dimension(400, 300));

        jProgressBar1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jProgressBar1.setMinimumSize(new java.awt.Dimension(10, 25));
        jProgressBar1.setStringPainted(true);

        jProgressBar2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jProgressBar2.setStringPainted(true);

        jProgressBar3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jProgressBar3.setStringPainted(true);

        jProgressBar4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jProgressBar4.setStringPainted(true);

        ContinueLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Continue.png"))); // NOI18N
        ContinueLabel.setText("Continue game");
        ContinueLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ContinueLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContinueLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContinueLabelMouseExited(evt);
            }
        });

        ALabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        ALabel.setForeground(new java.awt.Color(255, 255, 255));
        ALabel.setText("A");

        BLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        BLabel.setForeground(new java.awt.Color(255, 255, 255));
        BLabel.setText("B");

        CLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        CLabel.setForeground(new java.awt.Color(255, 255, 255));
        CLabel.setText("C");

        DLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        DLabel.setForeground(new java.awt.Color(255, 255, 255));
        DLabel.setText("D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ALabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(ContinueLabel)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DLabel))
                .addGap(18, 18, 18)
                .addComponent(ContinueLabel)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_ContinueLabelMouseClicked

    private void ContinueLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueLabelMouseEntered
        this.ContinueLabel.setIcon(new ImageIcon("src/Image/Continue2.png"));
    }//GEN-LAST:event_ContinueLabelMouseEntered

    private void ContinueLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueLabelMouseExited
        this.ContinueLabel.setIcon(new ImageIcon("src/Image/Continue.png"));
    }//GEN-LAST:event_ContinueLabelMouseExited

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
            java.util.logging.Logger.getLogger(AskTheAudienceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AskTheAudienceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AskTheAudienceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AskTheAudienceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AskTheAudienceFrame(l).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALabel;
    private javax.swing.JLabel BLabel;
    private javax.swing.JLabel CLabel;
    private javax.swing.JLabel ContinueLabel;
    private javax.swing.JLabel DLabel;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    // End of variables declaration//GEN-END:variables
}
