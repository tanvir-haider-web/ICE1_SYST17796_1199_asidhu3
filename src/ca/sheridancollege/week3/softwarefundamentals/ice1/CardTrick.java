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
 * @author Allanah Brisebois
 * Student ID: 991479740
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];

        for (int i=0; i<magicHand.length; i++)
        // end of while loop
        {
            Card c = new Card();
            Random ran = new Random();
            //c.setValue(insert call to random number generator here)
            c.setvalue(ran.nextInt(13)+1);
            c.setSuit(Card.SUITS[ran.nextInt(4)]);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;

        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a card");
        System.out.println("What is the card value? ( Jack=11, Queen=12, King =13, Ace = 1: ");
        int value = sc.nextInt();


        System.out.println("What is the suit of the card (Diamonds = 1, Hearts = 2, Spades = 3, Clubs = 4: ");
        String suit = sc.nextLine();

        boolean result = false;

        // and search magicHand here
        for (int r=0; r<magicHand.length; r++){
            Card c = new Card();
            if(input_suit.equalsIgnoreCase(magicHand[r].getSuit()) ){
                if(input_value == majicHand[j].getValue()){
                    result = true;
                }
            }
        }
        //Then report the result here

        if(result){
            System.out.println("Your card is found!");
        }
        else{
            System.out.println("Please pick a valid card");
        }
    }

}
