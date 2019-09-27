/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/* Timothy Stanek
* Student Number : 991428353
*/




package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numLow = 1;
        int numHigh = 13;
        int cardLow = 0;
        int cardHigh = 3;
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(numHigh-numLow) + numLow);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(cardHigh-cardLow)]);
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        int userNum = 0;
        int userSuit = 0;
        
              
        System.out.println("please enter card value(1-13)");
        userNum = sc.nextInt();
        System.out.println("Please enter card suit");
        userSuit = sc.nextInt();
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if (Card[i].cardNum == userNum)
        }
        
        //Then report the result here
    }
    
}
