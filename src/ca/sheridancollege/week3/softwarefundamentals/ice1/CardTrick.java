/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             Random r = new Random();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(r.nextInt());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[r.nextInt(3)]);
            magicHand [i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("please enter card value");
        int cardVal = input.nextInt();
        System.out.println("please enter suit");
        String suitVal = input.next();
        
        // and search magicHand here
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == cardVal) {
                System.out.println("the card value matches!");
                
            } else if (magicHand1.getSuit().equals(suitVal)) {
                System.out.println("the suit type matches!");
            } 
            
            else{
                System.out.println("no matches try again");
            }
            //Then report the result here
        }
    
}
}
