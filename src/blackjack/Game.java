package blackjack;

/**
 *
 * @author
 */

public class Game {

    private Dealer dealer;
    private Player player;
    private Deck deck;
    private Player players[];
    private int size;

    /**
     * constructor for the black jack game
     *
     * @param num number of players
     * @param names of the players
     */
    public Game(int num, String names[]) {
        size = num;
        players = new Player[num];
        for (int i = 0; i < size; i++) {
            players[i] = new Player();
            players[i].setName(names[i]);
        }
        dealer = new Dealer();
        player = new Player();
        deck = new Deck();
        deck.shuffle();
    } 
    
    public Player getPlayer(int index)
    {
        return this.players[index];
    }
    
    public int getNumberOfPlayers()
    {
        return this.players.length;
    }

    /**
     * set current player
     * @param index
     */
    public void setCurrentPlayer(int index) {
        this.player = this.players[index];
    }

    /**
     * function to deal initial cards.
     */
    public void initialDeal() {
        dealer.dealInitial(player, deck);
    }

    /**
     * deal all cards to all players
     */
    public void dealAll() {
        dealer.dealDealer(deck);

        for (int i = 0; i < size; i++) {
            dealer.dealInitial(players[i], deck);
        }
    }

    /**
     * function to get player.
     *
     * @return dealer
     */
    public Dealer getDealer() {
        return this.dealer;
    }

    /**
     * function to get player of the game
     *
     * @return player
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * function for the who to hit Who is passed as P or D
     *
     * @param who
     */
    public void hit(String who) {
        if (who.equalsIgnoreCase("P")) {
            this.dealer.hitCard(player.getHand(), deck);
        } else if (who.equalsIgnoreCase("D")) {
            this.dealer.hitCard(dealer.getHand(), deck);
        }
    }

    /**
     * function to move, if H is passed to the function means hit for the
     * player. we check the result, if player is not busted, we check for the
     * dealer, if he wanted to hit, if not then we compute the winner String
     * move
     * @param m
     */
    public void move(String m) {
        if (m.equalsIgnoreCase("H")) {
            this.hit("P");
        } else if (m.equalsIgnoreCase("DH")) {
            this.hit("D");
        }
    } 
    
    //reset the game for new start
    public void reset()
    {
        players = new Player[size];
        for (int i = 0; i < size; i++) {
            players[i] = new Player();
            player.reset();
        }
        dealer = new Dealer();
        dealer.reset();
        player = new Player();
        deck = new Deck();
        deck.shuffle();
    }

    /**
     * function to check winner.
     * @return 
     */
    public boolean checkWinner() {
        if (this.isBusted(this.player.getHand())) {
            return false;
        } else if (this.isBusted(this.dealer.getHand())) {
            return true;
        } else if (this.isBlackJack(this.player.getHand())) {
            return true;
        } else if (this.isBlackJack(this.dealer.getHand())) {
            return false;
        } else {
            if (player.getHand().getValue() > dealer.getHand().getValue()) {
                return true;
            } else if (player.getHand().getValue() < dealer.getHand().getValue()) {
                return false;
            } else {
                return false;
            }
        }
    }

    public boolean isBlackJack(Hand hand) {
        return hand.getValue() == 21;
    }

    /**
     * function to test the hand is busted.
     *
     * @param hand
     * @return true if busted > 21
     */
    public boolean isBusted(Hand hand) {
        return hand.getValue() > 21;
    }
}
