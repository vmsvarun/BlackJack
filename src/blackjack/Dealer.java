package blackjack;

/**
 *
 * @author 
 */
public class Dealer
{
   private Hand hand;

   /**
    *  default constructor for the dealer class.
    */
   public Dealer()
   {
     this.hand = new Hand();
   }

   /**
    * function to deal initial Cards,
    * the function will deal 2 cards to dealer
    * and two cards to the player
    */
   public void dealInitial(Player player, Deck deck)
   {
       player.getHand().addCard(deck.getCard());
       player.getHand().addCard(deck.getCard());
   }
   
   public void dealDealer(Deck deck)
   {
   	   hand.addCard(deck.getCard());
       hand.addCard(deck.getCard());
       
   }
   
   
   /**
    * function to deal a card in case of a hit
    * @param Hand
    */
   public void hitCard(Hand aHand, Deck deck)
   {
     aHand.addCard(deck.getCard());
   }

   /**
    *  function for the dealer, if the dealer is
    *  having hand value less than 19, he will hit
    * @return true
    */
   public boolean willHit()
   {
     return hand.getValue() < 19;
   }

   public void reset()
   {
       hand.reset();
   }
   
   /**
    * get dealer hand
    * @return hand
    */
   public Hand getHand()
   {
       return this.hand;
   }
}
