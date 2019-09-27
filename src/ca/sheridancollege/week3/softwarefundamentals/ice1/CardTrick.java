/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        Card[] magicHand = new Card[6];

        for (int i = 0; i < magicHand.length - 1; i++)
        {

            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(rand.nextInt(12) + 1);
            //System.out.println(c.getValue());
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            //System.out.println(c.getSuit());
            magicHand[i] = c;
        }
        //create lucky card
                    Card luckyCard = new Card();
            luckyCard.setValue(1);
            luckyCard.setSuit("Spades");
        magicHand[7] = luckyCard;
        System.out.println("The value is " + magicHand[7].getValue());
        System.out.println("The suit is " + magicHand[7].getSuit());

        int value;
        String suit = "";
        //Gets value from user
        while (true)
        {
            System.out.print("Enter the number of the card: ");
            value = s.nextInt();
            if (value >= 1 && value <= 12)
            {
                break;
            } else
            {
                System.out.print("Please choose a number from 1 - 12: ");
                value = s.nextInt();
            }
        }
//Enter suit from user
        System.out.print("Please enter a suit. Spades, Hearts, Clubs, Diamands");
        suit = s.next();
        //searches for card in the hand
        for (int x = 0; x < magicHand.length; x++)
        {
            if (magicHand[x].getValue() == value && magicHand[x].getSuit().equals(suit))
            {
                System.out.println("You picked the card!");
                break;
            } else
            {
                System.out.println("Not this one");
            }
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
