
package blackjack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class GamePage extends javax.swing.JFrame {

    /**
     * Creates new form GamePage
     */
    public GamePage() {
        initComponents();
        
        //setup the command panel
        this.setupCommandPanel();
        this.setPreferredSize(new Dimension(800, 800));
        this.setLayout(new BorderLayout());
        this.add(this.dealerPanel, BorderLayout.NORTH);
        this.add(this.playerOnePanel, BorderLayout.SOUTH);
        this.add(this.playerTwoPanel, BorderLayout.WEST);
        this.add(this.playerThreePanel, BorderLayout.EAST);
        this.add(this.commandPanel, BorderLayout.CENTER);
        
        
        this.getContentPane().setBackground(new Color(100, 150, 100));
        this.dealerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.playerOnePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.playerTwoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.playerThreePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        
        this.playerTwoPanel.setPreferredSize(new Dimension(200, 300));
        this.playerThreePanel.setPreferredSize(new Dimension(200, 300));
        panels = new JPanel[3];
        panels[0] = playerOnePanel;
        panels[1] = playerTwoPanel;
        panels[2] = playerThreePanel;
        
        //Setup first player
        display();
    } 
    
    //setup command panel
    private void setupCommandPanel()
    {
        this.commandPanel = new JPanel();
        this.commandPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.commandPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        this.commandPanel.setBackground(Color.BLACK);
        
        //game handler
        GameHandler listener = new GameHandler();
        
        
        //Add commands
        this.area = new JTextArea();
        this.pane = new JScrollPane(area); 
        this.pane.setPreferredSize(new Dimension(350, 250));
        this.add(pane);
        this.pane.setAutoscrolls(true);
        
        /*if(game.getNumberOfPlayers() == 1)
            this.msgLabel.setPreferredSize(new Dimension(700, 40));
        else 
            this.msgLabel.setPreferredSize(new Dimension(400, 40));
        */
        
        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(300, 180));
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.dealButton = new JButton("Deal");
        this.dealButton.setPreferredSize(new Dimension(100, 50));
        this.dealButton.setBackground(Color.cyan);
        this.dealButton.setForeground(Color.black);
        this.dealButton.addActionListener(listener);
        btnPanel.add(dealButton);
        
        this.hitButton = new JButton("HIT");
        this.hitButton.setPreferredSize(new Dimension(100, 50));
        this.hitButton.setBackground(Color.cyan);
        this.hitButton.setForeground(Color.black);
        this.hitButton.setEnabled(false); 
        this.hitButton.addActionListener(listener);
        btnPanel.add(hitButton);
        
        this.standButton = new JButton("Stand");
        this.standButton.setPreferredSize(new Dimension(100, 50));
        this.standButton.setBackground(Color.cyan);
        this.standButton.setForeground(Color.black);
        this.standButton.setEnabled(false);
        this.standButton.addActionListener(listener);
        btnPanel.add(standButton);
        
        this.newGameButton = new JButton("New Game");
        this.newGameButton.setPreferredSize(new Dimension(100, 50));
        this.newGameButton.setBackground(Color.cyan);
        this.newGameButton.setForeground(Color.black);
        this.newGameButton.setEnabled(false);
        this.newGameButton.addActionListener(listener);
        btnPanel.add(newGameButton);
        
        
        this.closeButton = new JButton("Back To Main");
        this.closeButton.setPreferredSize(new Dimension(150, 50));
        this.closeButton.setBackground(Color.cyan);
        this.closeButton.setForeground(Color.black);
        this.closeButton.setEnabled(true);
        this.closeButton.addActionListener(listener);
        btnPanel.add(closeButton);
        
        this.rulesButton = new JButton("Rules");
        this.rulesButton.setPreferredSize(new Dimension(80, 50));
        this.rulesButton.setBackground(Color.cyan);
        this.rulesButton.setForeground(Color.black);
        this.rulesButton.setEnabled(true);
        this.rulesButton.addActionListener(listener);
        btnPanel.add(closeButton);
        
        
        this.commandPanel.add(this.pane);
        
        this.commandPanel.add(btnPanel);
        
    } 
    
    class GameHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Object src = event.getSource();
            
            if(src.equals(dealButton)) 
            {
                game.dealAll();
                currentPlayer = 0; 
                turn = 'P';
                game.setCurrentPlayer(currentPlayer);
                area.append(game.getPlayer().getName() + " - Your Turn\n");
                dealButton.setEnabled(false);
                hitButton.setEnabled(true);
                standButton.setEnabled(true);
                commandPanel.repaint();
                
                //check if the dealer is busted
                if(!canPlay(game.getDealer().getHand()))
                {
                    checkWinners();
                    dealButton.setEnabled(false);
                    hitButton.setEnabled(false);
                    standButton.setEnabled(false);
                }
            }
            else if(src.equals(hitButton))
            {
                if(turn == 'P')
                    game.move("H");
                else 
                    game.move("DH");
                
                checkMove();
                
            }
            else if(src.equals(standButton))
            {
                if(game.getNumberOfPlayers() > (currentPlayer+1))
                {
                    currentPlayer++;
                    game.setCurrentPlayer(currentPlayer);
                    area.append(game.getPlayer().getName() + " Your Turn\n");
                }
                else 
                {
                    System.out.println("HERE");
                    dealerMove();
                }
            } 
            else if(src.equals(newGameButton))
            {
                newGame();
            }
            else if(src.equals(closeButton))
            {
                startPage.setVisible(true);
                dispose();
            }
            else if(src.equals(rulesButton))
            {
                RulesPage.main();
            }
            display();
        }
    } 
    
    private void newGame()
    {
        this.currentPlayer = 0; 
        this.dealButton.setEnabled(true);
        this.hitButton.setEnabled(false);
        this.standButton.setEnabled(false);
        this.area.setText("Dealer Deal The Initial Cards");
        
        game.reset();
        
        this.newGameButton.setEnabled(false);
        
    }
    
    private void checkMove()
    {
        Hand aHand = game.getPlayer().getHand();
        
        if(game.isBlackJack(aHand) || game.isBusted(aHand))
        {
            if(game.getNumberOfPlayers() > (currentPlayer+1))
                {
                    currentPlayer++;
                    game.setCurrentPlayer(currentPlayer);
                    area.setText(game.getPlayer().getName() + " Your Turn\n");
                }
                else 
                {
                    this.area.append("Dealer's Move\n");
                    dealerMove();
                }
        }
    }
    
    private void dealerMove()
    {
        Dealer dealer = game.getDealer();
        
        while(dealer.willHit())
        {
            game.hit("D");
            display();
            System.out.println("HIT - " + dealer.getHand().getValue());
        }
        
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        
        display();
        
        //Winner Messages
        checkWinners();
    }
    
    private boolean canPlay(Hand aHand)
    {
        return !game.isBlackJack(aHand) && !game.isBusted(aHand);
    }
    
    
    private void checkWinners()
    { 
        for(int i=0; i<game.getNumberOfPlayers(); i++)
        {
            game.setCurrentPlayer(i);
            if(game.checkWinner())
            {
                area.append(game.getPlayer().getName() + " Won from Dealer\n");
            }
            else 
            {
                area.append(game.getPlayer().getName() + " Lost from Dealer\n");
            }
        } 
        
        //enable the new game button
        newGameButton.setEnabled(true);
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dealerPanel = new javax.swing.JPanel();
        playerThreePanel = new javax.swing.JPanel();
        playerOnePanel = new javax.swing.JPanel();
        playerTwoPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Black Jack Game");
        setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        setLocationByPlatform(true);
        setResizable(false);

        dealerPanel.setBackground(new java.awt.Color(0, 153, 153));
        dealerPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        dealerPanel.setForeground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout dealerPanelLayout = new javax.swing.GroupLayout(dealerPanel);
        dealerPanel.setLayout(dealerPanelLayout);
        dealerPanelLayout.setHorizontalGroup(
            dealerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        dealerPanelLayout.setVerticalGroup(
            dealerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        playerThreePanel.setBackground(new java.awt.Color(0, 153, 153));
        playerThreePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        playerThreePanel.setForeground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout playerThreePanelLayout = new javax.swing.GroupLayout(playerThreePanel);
        playerThreePanel.setLayout(playerThreePanelLayout);
        playerThreePanelLayout.setHorizontalGroup(
            playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        playerThreePanelLayout.setVerticalGroup(
            playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        playerOnePanel.setBackground(new java.awt.Color(0, 153, 153));
        playerOnePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        playerOnePanel.setForeground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout playerOnePanelLayout = new javax.swing.GroupLayout(playerOnePanel);
        playerOnePanel.setLayout(playerOnePanelLayout);
        playerOnePanelLayout.setHorizontalGroup(
            playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        playerOnePanelLayout.setVerticalGroup(
            playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        playerTwoPanel.setBackground(new java.awt.Color(0, 153, 153));
        playerTwoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        playerTwoPanel.setForeground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout playerTwoPanelLayout = new javax.swing.GroupLayout(playerTwoPanel);
        playerTwoPanel.setLayout(playerTwoPanelLayout);
        playerTwoPanelLayout.setHorizontalGroup(
            playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        playerTwoPanelLayout.setVerticalGroup(
            playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(playerTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dealerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 259, Short.MAX_VALUE)
                        .addComponent(playerThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dealerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);
            }
        });
    } 
    
    //display the hands
    private void display()
    {
        Hand dealerHand = game.getDealer().getHand();
        ArrayList<Card> cards = dealerHand.getCards();
        this.dealerPanel.removeAll();
        JLabel dealerLabel = new JLabel("Dealer", JLabel.CENTER);
        dealerLabel.setPreferredSize(new Dimension(200, 40));
        this.dealerPanel.add(dealerLabel);
        
        if(game.isBlackJack(dealerHand))
            {
                dealerLabel.setText(dealerLabel.getText() + " BlackJack");
            }
            else if(game.isBusted(dealerHand))
            {
                dealerLabel.setText(dealerLabel.getText() + " Busted");
            }
        
        for(Card c: cards)
        {
            JLabel label = new JLabel(c.getImage());
            this.dealerPanel.add(label);
        }
        this.dealerPanel.repaint();
        
        for(int i=0; i<game.getNumberOfPlayers(); i++)
        {
            panels[i].removeAll();
            
            Player aPlayer = game.getPlayer(i);
            Hand aHand = aPlayer.getHand();
            cards = aHand.getCards();
            JLabel aLabel = new JLabel(aPlayer.getName() + "(Score = " + aPlayer.getValue() +")" , JLabel.CENTER); 
            
            if(game.isBlackJack(aHand))
            {
                aLabel.setText(aLabel.getText() + " BlackJack");
            }
            else if(game.isBusted(aHand))
            {
                aLabel.setText(aLabel.getText() + " Busted");
            }
            
            aLabel.setPreferredSize(new Dimension(200, 40));
            panels[i].add(aLabel);
            
            for(Card c: cards)
            {
                JLabel label = new JLabel(c.getImage());
                this.panels[i].add(label);
            }
            this.panels[i].repaint();
        }
        
        invalidate();
        pack();
    }
    
    //setup the game
    public static void setupGame(int num, String names[])
    {
        game = new Game(num, names);
    }
    
    
    //set the start game
    public static void setStartPage(StartPage page)
    {
        startPage = page;
    }
    
    //Main Frame reference
    private static StartPage startPage;
    private static Game game;
    
    
    private JPanel commandPanel;
    private JButton hitButton, standButton, dealButton;
    private JButton ruleButton, backButton;
    private JTextArea area;
    private JScrollPane pane;
    private int currentPlayer;
    private JButton rulesButton;
    private JButton newGameButton, closeButton;
    private char turn;
    private JPanel panels[];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dealerPanel;
    private javax.swing.JPanel playerOnePanel;
    private javax.swing.JPanel playerThreePanel;
    private javax.swing.JPanel playerTwoPanel;
    // End of variables declaration//GEN-END:variables
}
