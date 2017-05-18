
package blackjack;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RulesPage extends javax.swing.JFrame {

    /**
     * Creates new form RulesPage
     */
    public RulesPage() {
        initComponents();
        this.getContentPane().setBackground(new Color(0, 155, 250));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Game Rules");
        setBackground(new java.awt.Color(0, 153, 255));
        setLocationByPlatform(true);

        displayArea.setColumns(20);
        displayArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        displayArea.setRows(5);
        displayArea.setText("Game Rules. \n1. Game can be played in 2-Player or 4-Player Mode. \n2. 2-Player Mode: Player Vs Dealer\n3. 4-Player Mode: 3 Players Vs Dealer\n4. Dealer Deals 2 Initial Cards. \n    a. If the dealer Busted, He lose\n    b. If a Player Busted He Lose\n5. If Dealer is Not busted and a player is not busted, Player can Either Hit (deal a Card) or Can \n    Stand. \n6. On Each Hit, Game checks if the currently player scored a Black Jack, or is Busted. if so, it \n    moves to any next player or the deal if no player is left to take the turn. \n7. One a player stands, game moves to next player turn if any otherwise, move to dealer. \n8. Dealer can hit until he has less than 19 scores. \n9. Once dealer finishes the turn, game checsk for the winners. Each player against the dealer. ");
        pane.setViewportView(displayArea);

        closeBtn.setBackground(new java.awt.Color(0, 102, 255));
        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(RulesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RulesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RulesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RulesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RulesPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JScrollPane pane;
    // End of variables declaration//GEN-END:variables
}