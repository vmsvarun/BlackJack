package blackjack;

/**
 *
 * @author 
 */
import java.util.*;
import javax.swing.ImageIcon;
public class Deck
{
   private List<Card> deck;

   /**
    *  Constructor for the Deck class.
    *  The Deck will hold 52 Cards in the Deck
    */
   public Deck()
   {
     deck = new LinkedList<Card>();
     deck.add(new Card(new ImageIcon("src/images/0.png"), "clubs", "Two"));
     deck.add(new Card(new ImageIcon("src/images/1.png"), "clubs", "Three"));
     deck.add(new Card(new ImageIcon("src/images/2.png"), "clubs", "Four"));
     deck.add(new Card(new ImageIcon("src/images/3.png"), "clubs", "Five"));
     deck.add(new Card(new ImageIcon("src/images/4.png"), "clubs", "Six"));
     deck.add(new Card(new ImageIcon("src/images/5.png"), "clubs", "Seven"));
     deck.add(new Card(new ImageIcon("src/images/6.png"), "clubs", "Eight"));
     deck.add(new Card(new ImageIcon("src/images/7.png"), "clubs", "Nine"));
     deck.add(new Card(new ImageIcon("src/images/8.png"), "clubs", "Ten"));
     deck.add(new Card(new ImageIcon("src/images/9.png"), "clubs", "Jack"));
     deck.add(new Card(new ImageIcon("src/images/10.png"), "clubs", "Queen"));
     deck.add(new Card(new ImageIcon("src/images/11.png"), "clubs", "King"));
     deck.add(new Card(new ImageIcon("src/images/12.png"), "clubs", "Ace"));
	 
     deck.add(new Card(new ImageIcon("src/images/13.png"), "diamonds", "Two"));
     deck.add(new Card(new ImageIcon("src/images/14.png"), "diamonds", "Three"));
     deck.add(new Card(new ImageIcon("src/images/15.png"), "diamonds", "Four"));
     deck.add(new Card(new ImageIcon("src/images/16.png"), "diamonds", "Five"));
     deck.add(new Card(new ImageIcon("src/images/17.png"), "diamonds", "Six"));
     deck.add(new Card(new ImageIcon("src/images/18.png"), "diamonds", "Seven"));
     deck.add(new Card(new ImageIcon("src/images/19.png"), "diamonds", "Eight"));
     deck.add(new Card(new ImageIcon("src/images/20.png"), "diamonds", "Nine"));
     deck.add(new Card(new ImageIcon("src/images/21.png"), "diamonds", "Ten"));
     deck.add(new Card(new ImageIcon("src/images/22.png"), "diamonds", "Jack"));
     deck.add(new Card(new ImageIcon("src/images/23.png"), "diamonds", "Queen"));
     deck.add(new Card(new ImageIcon("src/images/24.png"), "diamonds", "King"));
     deck.add(new Card(new ImageIcon("src/images/25.png"), "diamonds", "Ace"));
     
     deck.add(new Card(new ImageIcon("src/images/26.png"), "hearts", "Two"));
     deck.add(new Card(new ImageIcon("src/images/27.png"), "hearts", "Three"));
     deck.add(new Card(new ImageIcon("src/images/28.png"), "hearts", "Four"));
     deck.add(new Card(new ImageIcon("src/images/29.png"), "hearts", "Five"));
     deck.add(new Card(new ImageIcon("src/images/30.png"), "hearts", "Six"));
     deck.add(new Card(new ImageIcon("src/images/31.png"), "hearts", "Seven"));
     deck.add(new Card(new ImageIcon("src/images/32.png"), "hearts", "Eight"));
     deck.add(new Card(new ImageIcon("src/images/33.png"), "hearts", "Nine"));
     deck.add(new Card(new ImageIcon("src/images/34.png"), "hearts", "Ten"));
     deck.add(new Card(new ImageIcon("src/images/35.png"), "hearts", "Jack"));
     deck.add(new Card(new ImageIcon("src/images/36.png"), "hearts", "Queen"));
     deck.add(new Card(new ImageIcon("src/images/37.png"), "hearts", "King"));
     deck.add(new Card(new ImageIcon("src/images/38.png"), "hearts", "Ace"));
     
     deck.add(new Card(new ImageIcon("src/images/39.png"), "spades", "Two"));
     deck.add(new Card(new ImageIcon("src/images/40.png"), "spades", "Three"));
     deck.add(new Card(new ImageIcon("src/images/41.png"), "spades", "Four"));
     deck.add(new Card(new ImageIcon("src/images/42.png"), "spades", "Five"));
     deck.add(new Card(new ImageIcon("src/images/43.png"), "spades", "Six"));
     deck.add(new Card(new ImageIcon("src/images/44.png"), "spades", "Seven"));
     deck.add(new Card(new ImageIcon("src/images/45.png"), "spades", "Eight"));
     deck.add(new Card(new ImageIcon("src/images/46.png"), "spades", "Nine"));
     deck.add(new Card(new ImageIcon("src/images/47.png"), "spades", "Ten"));
     deck.add(new Card(new ImageIcon("src/images/48.png"), "spades", "Jack"));
     deck.add(new Card(new ImageIcon("src/images/49.png"), "spades", "Queen"));
     deck.add(new Card(new ImageIcon("src/images/50.png"), "spades", "King"));
     deck.add(new Card(new ImageIcon("src/images/51.png"), "spades", "Ace"));
   }

   /**
    * function to shuffle the deck.
    */
   public void shuffle()
   {
       Collections.shuffle(deck);
   }

   /**
    *  function to get a card.
    */
   public Card getCard()
   {
       int index = (int) Math.random() * deck.size();
       return this.deck.remove(index);
   }
    
}
