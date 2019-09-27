/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * Modifier Name: Justin Caringal
 * Student Number: 991522385
 */
import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner keysIn = new Scanner(System.in);
        Random random = new Random();
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue = (0 + Math.random() * 14);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit = (0 + Math.random() * 4);
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Input Card Number (1-13): ");
        int userInput = keysIn.nextInt();
        System.out.print("Input Suit: ");
        String userInput2 = keysIn.nextLine();
        
        System.out.println("Your card is " +userInput+ " and your suit is " +userInput2+ ".");
        
        // and search magicHand here
        //Then report the result here
    }
    
}
