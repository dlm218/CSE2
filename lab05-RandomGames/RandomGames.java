/////////////////////////////////////////////////////////////
//David Mugavero
//September 24, 2014
//RandomGames Java Program
//
//This program is designed to play random games that the used wants to play
//It will play either roulette, craps, or cards
import java.util.Scanner;
public class RandomGames {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for pick a card: ");
        String game = myScanner.next();
        double roulette = Math.random() * 38;
        roulette = (int) roulette;
        double craps1 = ((Math.random() * 6) + 1) ;
        craps1 = (int) craps1;
        double craps2 = ((Math.random() *6) + 1);
        craps2 = (int) craps2;
        double suitNumber = ((Math.random() * 4) + 1);
        suitNumber = (int) suitNumber;
        String suit = "";
        String royal = "";
        double cardNumber = ((Math.random () * 13) + 1);
        cardNumber = (int) cardNumber;
        if(game.length() > 1) {
            System.out.println("Invalid entry");
            if(roulette == 0.0) {
            roulette = 00;
            }
        }
        else {
        switch (game) {
            case "R": case "r":
                if(roulette == 37){
                    System.out.println("00");
                    return;
                }
                else{
                System.out.println(roulette);
                return;
                }
            case "C": case "c":
                System.out.println(craps1+ " + " +craps2+ " = " +(craps1 + craps2));
                return;
            case "P": case "p":
                if(suitNumber == 1) {
            suit = "Hearts";
        }
        if(suitNumber == 2) {
            suit = "Diamonds";
        }
        if(suitNumber == 3) {
            suit = "Spades";
        }
        if(suitNumber == 4) {
            suit = "Clubs";
        }
        if(cardNumber == 11) {
            royal = "Jack";
            System.out.println(royal+ " of " +suit);
            return;
        }
        if(cardNumber == 12) {
            royal = "Queen";
            System.out.println(royal+ " of " +suit);
            return;
        }
        if(cardNumber == 13) {
            royal = "King";
            System.out.println(royal+ " of " +suit);
            return;
        }
        if(cardNumber == 1) {
            royal = "Ace";
            System.out.println(royal+ " of " +suit);
            return;
        }
                System.out.println(cardNumber+ " of " +suit);
                return;
            default:
                System.out.println("You did not enter R, r, C, c, P,or p");
                return;
            }
        }
    }
}