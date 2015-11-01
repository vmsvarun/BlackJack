package blackjack;

/**
 *
 * @author 
 */
public class Player
{
   private Hand hand;
   private String name;

   /**
    *  Default Constructor for the Player
    */
   public Player()
   {
     this.hand = new Hand();
   } 
   
   public void reset()
   {
       hand.reset();
   }
   
   /**
    * parameter constructor
    */
   public Player(String name)
   {
       this.name = name;
       this.hand = new Hand();
   }
   
   /**
    * Get the name of the player
    * 
    * @return name of the player
    */
   public String getName()
   {
       return name;
   }
   
   /**
    * Set the name of the palyer
    * 
    * @param name
    */
   public void setName(String name)
   {
       this.name = name;
   }

   /**
    *  Function to get Player hand
    * @return hand
    */
   public Hand getHand()
   {
     return this.hand;
   }

   /**
    *  function to get total value of hand
    *  @return value
    */
   public int getValue()
   {
       return this.hand.getValue();
   }

   /**
    *  function for the Player, if the dealer is
    *  having hand value less than 17, he will hit
    * @return true
    */
   public boolean willHit()
   {
     if(hand.getValue() < 17)
         return true;
     else
         return false;
   }
}
