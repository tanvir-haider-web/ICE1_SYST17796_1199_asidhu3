/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Sarah Radulovich
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length-1; i++)
        {
            Card c = new Card();
            Random ran = new Random();
            c.setValue(ran.nextInt(13)+1);
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");
        magicHand[6] = luckyCard;
        
        System.out.println("Lucky Card Suit: "+luckyCard.getSuit()+" Value: "+luckyCard.getValue());
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card value (1-13)");
        Scanner scan = new Scanner(System.in);
        int input_value = scan.nextInt();
        System.out.println("Pick a card suit!");
        String input_suit = scan.next();
        
        boolean result = false;
        // and search magicHand here
        for (int j=0; j<magicHand.length; j++)
        {
            Card c = new Card();
            if(input_suit.equalsIgnoreCase(magicHand[j].getSuit()))
            {
                if(input_value == magicHand[j].getValue())
                {
                    result = true;
                }
            }
        }
        //Then report the result here
        if(result)
        {
            System.out.println("Congrats! Your card is in the magic hand!");
        }
        else {
            System.out.println("Your card isn't in the magic hand. Try again next time.");
        }
    }
    
}
