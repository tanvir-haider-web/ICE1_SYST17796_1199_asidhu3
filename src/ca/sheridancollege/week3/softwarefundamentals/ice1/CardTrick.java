/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Ognjen Cicovic STUDENT# 991589759
 */


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int randomNum = rand.nextInt(13 - 1) + 1;
            //c.setValue(insert call to random number generator here)
            c.setValue(randomNum);
            int randomSuit = rand.nextInt(3);
            c.setSuit(Card.SUITS[randomSuit]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
       
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a card value: ");
        int numberVal = value.nextInt();
     
        Scanner suit = new Scanner(System.in);
        System.out.print("Enter a card suit: ");
        int numberSuit = value.nextInt();
        
        
        
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)
        {
           Card getC = new Card();
           System.out.println(getC.getValue());
        }
        
        
        //Then report the result here
        
    }
    
 public class LuckyCard{
     int cardNum = 5;
     String suitCard = "spade";
 }

    
    
}
