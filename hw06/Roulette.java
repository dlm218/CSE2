/////////////////////////////////////////////////////////////////
//David Mugavero
//October 11, 2014
//Roulette Java Program
//This program is designed to find the winnings of a certain method in playing roulette
//
import java.util.Scanner;
public class Roulette{
    //main method required for all java programs
    public static void main(String [] args){
        System.out.print("Enter Y or y to play roulette: ");
        Scanner myScanner = new Scanner(System.in);//declares and assignes inputted value to scanner variable
        String play = myScanner.next();//assign value of scanner to variable
        String Y = "";
        String y = "";
        int i = 0;//controls inner while loop
        int j = 0;//controls outer while loop
        int k = 0;//used to see how many times you win a roulette spin
        int z = 0;//used to print out if you lose everything
        int w = 0;//used for winnings each 100 soin round
        int t = 0;//total winnings
        if(play.equals ("Y") || play.equals ("y")){
            double choice = Math.random() * 38;//the number that the player places a bet on
            choice = (int) choice;
            while(j < 10){//loop to run 100 spin simulation 1000 times
                i = 0;//reset to 0
                k = 0;//reset to 0
                z = 0;//reset to 0
                w = 0;//reset to 0
            while(i < 100){//100 spin simulation
                double number = Math.random() * 38;//number that comes up on each spin
                number = (int) number;
                if(choice == number){//when you win
                    k++;
                    z++;
                    }
                i++;
                }
                if(k >= 3){//you win money from 100 spins
                    w = (k * 36) - 100;
                    System.out.println("You won money!!");
                    System.out.println("Your winnings were: $" +w);
                }
                else if(z == 0){
                    System.out.println("You lost everything");
                }
                t += w;
                j++;
            }
            System.out.println("Your total winnings were: $" +t);
        }
        else{
            return;
        }
    }
}