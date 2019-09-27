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
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random r = new Random();
            //set Random Values for the Card
            c.setValue(r.nextInt(8));
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            System.out.println(""+c.getValue()+" "+c.getSuit());
            magicHand[i] = c;

        }
        //get card info from the USER and store
        Card usrCard = new Card();
        System.out.println("Please Enter Card Value");
        usrCard.setValue(scn.nextInt());
        System.out.println("Please Enter Card Suit - 0 for Heart, 1 for Diamond, 2 for Spade, 3 for Clubs");
        usrCard.setSuit(Card.SUITS[scn.nextInt()]);
        
        //check if the user's card is in the magic hand
        boolean check = false;
        for (Card magicHand1 : magicHand) {
            if (usrCard.getValue() == magicHand1.getValue() && (usrCard.getSuit() == null ? magicHand1.getSuit() == null : usrCard.getSuit().equals(magicHand1.getSuit()))) {
                check = true;
            }
        }
        
        if (check)
            System.out.println("Your Card is in the Magic Hand");
        else
            System.out.println("Sorry your Card is not in the Magic Hand");
    }
    
}
