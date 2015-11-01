package blackjack;

/**
 *
 * @author Experts
 */
import java.util.*;
public class Hand
{
   private ArrayList<Card> cards;
   private int value;

   /**
    * Hand constructor, will construct
    * empty Hand
    */
   public Hand()
   {
       this.cards = new ArrayList<Card>();
       value = 0;
   }

   /**
    *  function to compute the total hand value.
    */
   private void compute()
   {
      value = 0;
       for (Card c : cards)
      {
         value += c.getValue();
      }
   }

   /**
    * function to return the value of hand
    * @return value
    */
   public int getValue()
   {
       return this.value;
   } 
   
   public void reset()
   {
       cards.clear();
       value = 0; 
   }

   /**
    *  function to add a card.
    */
   public void addCard(Card card)
   {
       this.cards.add(card);
       compute(); //compute total;
   }

   /**
    *  function to get Cards.
    */
   public ArrayList<Card> getCards()
   {
       return this.cards;
   }
}
