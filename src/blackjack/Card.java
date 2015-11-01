package blackjack;

/**
 * @author 
 */
import javax.swing.ImageIcon;

public class Card implements Comparable<Card>
{
  private String face;
  private ImageIcon cardPic;
  private String suit;

  /**
   * Constructs a card. to the default
   * values through Constructor Chaining.
   */
  public Card()
  {
    this(null, "", "");
  }

  /**
   * Parameter constructor for the Card class.
   * 
   * @param icon the image of the card
   * @param suit - the suit name
   * @param face - the face name
   */
  public Card(ImageIcon icon, String suit, String face)
  {
    this.cardPic = icon;
    this.suit = suit;
    this.face = face;
  }

  /**
   * function to return the ImageIcon of this card.
   * @return the picture image of card
   */
  public ImageIcon getImage()
  {
    return this.cardPic;
  }

  /**
   * function to returns the value of this card.
   * @return the numeric value of card
   */
  public int getValue()
  {
    int value = 0;

    if(this.face.equalsIgnoreCase("Two"))
        value = 2;
    else if(this.face.equalsIgnoreCase("Three"))
        value = 3;
    else if(this.face.equalsIgnoreCase("Four"))
        value = 4;
    else if(this.face.equalsIgnoreCase("Five"))
        value = 5;
    else if(this.face.equalsIgnoreCase("Six"))
        value = 6;
    else if(this.face.equalsIgnoreCase("Seven"))
        value = 7;
    else if(this.face.equalsIgnoreCase("Eight"))
        value = 8;
    else if(this.face.equalsIgnoreCase("Nine"))
        value = 9;
    else if(this.face.equalsIgnoreCase("Ten"))
        value = 10;
    else if(this.face.equalsIgnoreCase("Jack"))
        value = 10;
    else if(this.face.equalsIgnoreCase("Queen"))
        value = 10;
    else if(this.face.equalsIgnoreCase("King"))
        value = 10;
    else if(this.face.equalsIgnoreCase("Ace"))
        value = 11;

    return value;
  }

  /**
   * function to return the suit of this card.
   * @return the suit name
   */
  public String getSuit()
  {
    return this.suit;
  }

  /**
   * function to returns the face of this card.
   * @return the face name
   */
  public String getFace()
  {
    return this.face;
  }

  @Override
  /**
   * Function to return the comparison of
   * the Cards based on the face value
   */
  public int compareTo(Card card)
  {
     if(this.getValue() < card.getValue())
       return -1;
     else if(this.getValue() > card.getValue())
         return 1;
     else
         return 0;

  }

  @Override
  /**
   * Function to returns a string representation this card.
   * @return face name, suit name, and numeric value
   */
  public String toString()
  {
    return "Face: "+ face + " Suit"+ suit;
  }
}
