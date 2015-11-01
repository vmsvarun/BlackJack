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
     deck.add(new Card(new ImageIcon("images/0.png"), "clubs", "Two"));
     deck.add(new Card(new ImageIcon("images/1.png"), "clubs", "Three"));
     deck.add(new Card(new ImageIcon("images/2.png"), "clubs", "Four"));
     deck.add(new Card(new ImageIcon("images/3.png"), "clubs", "Five"));
     deck.add(new Card(new ImageIcon("images/4.png"), "clubs", "Six"));
     deck.add(new Card(new ImageIcon("images/5.png"), "clubs", "Seven"));
     deck.add(new Card(new ImageIcon("images/6.png"), "clubs", "Eight"));
     deck.add(new Card(new ImageIcon("images/7.png"), "clubs", "Nine"));
     deck.add(new Card(new ImageIcon("images/8.png"), "clubs", "Ten"));
     deck.add(new Card(new ImageIcon("images/9.png"), "clubs", "Jack"));
     deck.add(new Card(new ImageIcon("images/10.png"), "clubs", "Queen"));
     deck.add(new Card(new ImageIcon("images/11.png"), "clubs", "King"));
     deck.add(new Card(new ImageIcon("images/12.png"), "clubs", "Ace"));
     deck.add(new Card(new ImageIcon("images/13.png"), "diamonds", "Two"));
     deck.add(new Card(new ImageIcon("images/14.png"), "diamonds", "Three"));
     deck.add(new Card(new ImageIcon("images/15.png"), "diamonds", "Four"));
     deck.add(new Card(new ImageIcon("images/16.png"), "diamonds", "Five"));
     deck.add(new Card(new ImageIcon("images/17.png"), "diamonds", "Six"));
     deck.add(new Card(new ImageIcon("images/18.png"), "diamonds", "Seven"));
     deck.add(new Card(new ImageIcon("images/19.png"), "diamonds", "Eight"));
     deck.add(new Card(new ImageIcon("images/20.png"), "diamonds", "Nine"));
     deck.add(new Card(new ImageIcon("images/21.png"), "diamonds", "Ten"));
     deck.add(new Card(new ImageIcon("images/22.png"), "diamonds", "Jack"));
     deck.add(new Card(new ImageIcon("images/23.png"), "diamonds", "Queen"));
     deck.add(new Card(new ImageIcon("images/24.png"), "diamonds", "King"));
     deck.add(new Card(new ImageIcon("images/25.png"), "diamonds", "Ace"));
     
    deck.add(new Card(new ImageIcon("images/26.png"), "hearts", "Two"));
    deck.add(new Card(new ImageIcon("images/27.png"), "hearts", "Three"));
    deck.add(new Card(new ImageIcon("images/28.png"), "hearts", "Four"));
    deck.add(new Card(new ImageIcon("images/29.png"), "hearts", "Five"));
    deck.add(new Card(new ImageIcon("images/30.png"), "hearts", "Six"));
    deck.add(new Card(new ImageIcon("images/31.png"), "hearts", "Seven"));
    deck.add(new Card(new ImageIcon("images/32.png"), "hearts", "Eight"));
    deck.add(new Card(new ImageIcon("images/33.png"), "hearts", "Nine"));
    deck.add(new Card(new ImageIcon("images/34.png"), "hearts", "Ten"));
    deck.add(new Card(new ImageIcon("images/35.png"), "hearts", "Jack"));
    deck.add(new Card(new ImageIcon("images/36.png"), "hearts", "Queen"));
    deck.add(new Card(new ImageIcon("images/37.png"), "hearts", "King"));
    deck.add(new Card(new ImageIcon("images/38.png"), "hearts", "Ace"));
     
     deck.add(new Card(new ImageIcon("images/39.png"), "spades", "Two"));
     deck.add(new Card(new ImageIcon("images/40.png"), "spades", "Three"));
     deck.add(new Card(new ImageIcon("images/41.png"), "spades", "Four"));
     deck.add(new Card(new ImageIcon("images/42.png"), "spades", "Five"));
     deck.add(new Card(new ImageIcon("images/43.png"), "spades", "Six"));
     deck.add(new Card(new ImageIcon("images/44.png"), "spades", "Seven"));
     deck.add(new Card(new ImageIcon("images/45.png"), "spades", "Eight"));
     deck.add(new Card(new ImageIcon("images/46.png"), "spades", "Nine"));
     deck.add(new Card(new ImageIcon("images/47.png"), "spades", "Ten"));
     deck.add(new Card(new ImageIcon("images/48.png"), "spades", "Jack"));
     deck.add(new Card(new ImageIcon("images/49.png"), "spades", "Queen"));
     deck.add(new Card(new ImageIcon("images/50.png"), "spades", "King"));
     deck.add(new Card(new ImageIcon("images/51.png"), "spades", "Ace"));
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
