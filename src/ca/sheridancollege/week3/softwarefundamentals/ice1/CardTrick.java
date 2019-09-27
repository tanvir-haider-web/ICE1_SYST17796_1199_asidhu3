 import java.util.Scanner;
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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Math.round(i)*13);
              c.setSuit(Card.SUITS[0+Math.round(i)*4]);
        }
   
     String LuckyCard="10 Hearts";
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("enter card value");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter suit 0-4");
        Scanner su=new Scanner(System.in);
        // and search magicHand here
        //Then report the result here
        
        //“Finished adding code for 3 and 4 to CardTrick.java”. 
      //“ Hard-coded luckyCard” 
    }
    
}
