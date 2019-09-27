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
 * @author Gonzalo Jurado 991303719
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random count = new Random();
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(count.nextInt(12) + 1);
            c.setSuit(Card.SUITS[count.nextInt(3)]);
        }
        
        System.out.println("Pick any card from the deck, a suit followed by the value.");
        Card luckyCard = new Card();
        luckyCard.setValue(in.nextInt());
        luckyCard.setSuit(in.next());
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
