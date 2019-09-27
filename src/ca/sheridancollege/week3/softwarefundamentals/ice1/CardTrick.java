/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Vadim Andreev
 */
public class CardTrick 
{
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        Card luckyCard = new Card;
        luckyCard.setValue(0);
        luckyCard.setSuit(Card.SUITS[0]);
        
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomCard());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
      Card card = new Card();
        System.out.println("Enter The Suit: ");
        String suit = sc.nextLine();
        System.out.println("Enter the Number of Card: ");
        int num = sc.nextInt();
        card.setValue(num);
        card.setSuit(suit);
        
        boolean bol = false;
        
        for(int i = 0; i < 7; i++){
            if(card.getValue() == magicHand[i].getValue() && card.getSuit().equals(magicHand[i].getSuit())){
                bol = true;
                break;
            }
        }
        if(bol == false){
            System.out.println("Card is not present");
        }
        else{
             System.out.println("Card is present");
        }
        System.out.println("Your lucky card value is "+ luckyCard.getValue()+" The suit is "+luckyCard.getSuit());
    }
    
}
