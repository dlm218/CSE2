//////////////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//September 10, 2014
//BigMac Java Program
//
//This program is used to to compute the cost of big macs eaten by an indivdual by their inputed vales of the number of big macs eaten
//
import java.util.Scanner;
public class BigMac{
    //main method required for every java program
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //delcates scanner and assigns variable
        System.out.print("Enter the nuber of Big Macs (an integer > 0) : "); //prints out message and allows input of number of bigmacs
        int nBigMacs = myScanner.nextInt(); //scanner takes the next int value inputed
        System.out.print("Enter the cost per Big Mac as "+ " a double (in the form xx.xx) : "); //prints out message and allows inout for value of bigmac
        double bigMac$ = myScanner.nextDouble(); //scanner takes double inputed and spits out the next line
        System.out.print("Enter the percent tax as a whole number (xx) : "); //prints out message prompting user to input tax
        double taxRate = myScanner.nextDouble(); //scanner takes in the value of sales tax
        taxRate/=100; //user enters percent, but I want proportion
        double cost$; //makes input vars for cost$ a double
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate); //sets value for cost
        //get the whole amount, dropping demical fraction
        dollars = (int) cost$; //converts cost$ to int value
        //get dimes amount, e.g,
        //(int) (6.73*10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the divison: 583%100 -> 83, 27%5 -> 2
        dimes = (int) (cost$*10)%10; //coverts this to int value
        pennies = (int) (cost$*100)%10; //vonverts to int value
        System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per BigMac, with a "+" sales tax of "+ (int) (taxRate*100) + "%, is $"+dollars+'.' +dimes+pennies);
        //displays final message of number of bigmacs, the cost of each, the sales tax, and the total cost
    }
}