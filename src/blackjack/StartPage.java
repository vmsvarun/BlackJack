package blackjack;

import java.awt.*;
import javax.swing.*;

public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    public StartPage() {
        initComponents();
        this.getContentPane().setBackground(new Color(0, 153, 153));
        this.btnGroup.add(this.rdbTwoPlayerMode);
        this.btnGroup.add(this.rdbFourPlayerMode);
    }
    
    //Show Error Message
    public void showError(String message)
    {
        JOptionPane.showMessageDialog(this, message, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    //validate the names passed to the game based on number of players
    private boolean validate(int numPlayers)
    {
        String str = this.txtPlayerOne.getText();
        
        if( str == null || str.isEmpty())
        {
            showError("Provide Player One's Name");
            this.playerOnePanel.requestFocus();
            return false; 
        }
        
        if(numPlayers == 4)
        {
            str = this.txtPlayerTwo.getText();
        
            if( str == null || str.isEmpty())
            {
                showError("Provide Player Two's Name");
                this.txtPlayerTwo.requestFocus();
                return false; 
            }
            
            str = this.txtPlayerThree.getText();
        
            if( str == null || str.isEmpty())
            {
                showError("Provide Player Three's Name");
                this.txtPlayerThree.requestFocus();
                return false; 
            }
        }
        
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        rdbFourPlayerMode = new javax.swing.JRadioButton();
        rdbTwoPlayerMode = new javax.swing.JRadioButton();
        lblMode = new javax.swing.JLabel();
        playerOnePanel = new javax.swing.JPanel();
        lblPlayerOne = new javax.swing.JLabel();
        txtPlayerOne = new javax.swing.JTextField();
        playerThreePanel = new javax.swing.JPanel();
        lblPlayerThree = new javax.swing.JLabel();
        txtPlayerThree = new javax.swing.JTextField();
        playerTwoPanel = new javax.swing.JPanel();
        lblPlayerTwo = new javax.swing.JLabel();
        txtPlayerTwo = new javax.swing.JTextField();
        btnStartGame = new javax.swing.JButton();
        btnExitGame = new javax.swing.JButton();
        btnRules = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Black Jack Game");
        setBackground(new java.awt.Color(0, 153, 153));
        setLocationByPlatform(true);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 255, 51));
        lblTitle.setText("Welcome To Black Jack Game");

        rdbFourPlayerMode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdbFourPlayerMode.setForeground(new java.awt.Color(51, 255, 204));
        rdbFourPlayerMode.setText("4 Player Mode");

        rdbTwoPlayerMode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdbTwoPlayerMode.setForeground(new java.awt.Color(51, 255, 204));
        rdbTwoPlayerMode.setSelected(true);
        rdbTwoPlayerMode.setText("2 Player Mode");

        lblMode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMode.setForeground(new java.awt.Color(51, 255, 204));
        lblMode.setText("Select Game Mode");

        playerOnePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblPlayerOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlayerOne.setForeground(new java.awt.Color(0, 0, 255));
        lblPlayerOne.setText("Player One Name");

        txtPlayerOne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout playerOnePanelLayout = new javax.swing.GroupLayout(playerOnePanel);
        playerOnePanel.setLayout(playerOnePanelLayout);
        playerOnePanelLayout.setHorizontalGroup(
            playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerOnePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblPlayerOne)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(playerOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPlayerOne)
                .addContainerGap())
        );
        playerOnePanelLayout.setVerticalGroup(
            playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayerOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        playerThreePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblPlayerThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlayerThree.setForeground(new java.awt.Color(0, 0, 255));
        lblPlayerThree.setText("Player Three Name");

        txtPlayerThree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout playerThreePanelLayout = new javax.swing.GroupLayout(playerThreePanel);
        playerThreePanel.setLayout(playerThreePanelLayout);
        playerThreePanelLayout.setHorizontalGroup(
            playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerThreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPlayerThree, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerThreePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPlayerThree)
                .addGap(25, 25, 25))
        );
        playerThreePanelLayout.setVerticalGroup(
            playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerThreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayerThree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlayerThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playerTwoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblPlayerTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlayerTwo.setForeground(new java.awt.Color(0, 0, 255));
        lblPlayerTwo.setText("Player Two Name");

        txtPlayerTwo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout playerTwoPanelLayout = new javax.swing.GroupLayout(playerTwoPanel);
        playerTwoPanel.setLayout(playerTwoPanelLayout);
        playerTwoPanelLayout.setHorizontalGroup(
            playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPlayerTwo)
                .addContainerGap())
            .addGroup(playerTwoPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblPlayerTwo)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        playerTwoPanelLayout.setVerticalGroup(
            playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayerTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlayerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnStartGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStartGame.setForeground(new java.awt.Color(255, 0, 255));
        btnStartGame.setText("Start Game");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });

        btnExitGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExitGame.setForeground(new java.awt.Color(255, 0, 255));
        btnExitGame.setText("Exit Game");
        btnExitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitGameActionPerformed(evt);
            }
        });

        btnRules.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRules.setForeground(new java.awt.Color(255, 0, 255));
        btnRules.setText("Rules");
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMode)
                                .addGap(34, 34, 34)
                                .addComponent(rdbTwoPlayerMode)
                                .addGap(18, 18, 18)
                                .addComponent(rdbFourPlayerMode))
                            .addComponent(lblTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbFourPlayerMode)
                    .addComponent(rdbTwoPlayerMode)
                    .addComponent(lblMode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(playerTwoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerThreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        int numPlayers = 2; 
        
        if(rdbFourPlayerMode.isSelected())
        {
            numPlayers = 4; 
        }
        
        String names [] = new String[numPlayers-1];
        names[0] = this.txtPlayerOne.getText();
        
        if(numPlayers == 4)
        {
            names[1] = this.txtPlayerTwo.getText();
            names[2] = this.txtPlayerThree.getText();
        }
        
        if(validate(numPlayers))
        {
            GamePage.setStartPage(this);
            GamePage.setupGame(numPlayers-1, names);
            GamePage.main();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnStartGameActionPerformed
    
    //exit the game
    private void btnExitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitGameActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitGameActionPerformed

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        RulesPage.main();
    }//GEN-LAST:event_btnRulesActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StartPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitGame;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel lblMode;
    private javax.swing.JLabel lblPlayerOne;
    private javax.swing.JLabel lblPlayerThree;
    private javax.swing.JLabel lblPlayerTwo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel playerOnePanel;
    private javax.swing.JPanel playerThreePanel;
    private javax.swing.JPanel playerTwoPanel;
    private javax.swing.JRadioButton rdbFourPlayerMode;
    private javax.swing.JRadioButton rdbTwoPlayerMode;
    private javax.swing.JTextField txtPlayerOne;
    private javax.swing.JTextField txtPlayerThree;
    private javax.swing.JTextField txtPlayerTwo;
    // End of variables declaration//GEN-END:variables
}
