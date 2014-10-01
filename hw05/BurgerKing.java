//////////////////////////////////////////////////////////////////
//David Mugavero
//September 28, 2014
//BurgerKing Java Program
//
//This program is designed to take the input from a user to customize their order to their liking
//
import java.util.Scanner; //allows user to input values
public class BurgerKing {
    //every java program needs main method
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares and assigns value to variable
        Scanner myScanner2 = new Scanner(System.in); //declares and assigns value to variable
        Scanner myScanner3 = new Scanner(System.in); //declares and assigns value to variable
        Scanner myScanner4 = new Scanner(System.in); //declares and assigns value to variable
        System.out.print("Enter a letter to indicate a choice of\nBurger (B or b)\nSoda (S or s)\nFries (F or f): "); //prints message
        String order = myScanner.next(); //declres and assign variable that takes in order
        switch (order) { //these are all the options for the order variable
            case "B": case "b": //when B or b is entered
                System.out.print("Enter A or a for all the fixins\nC or c for cheese\nN or n for none of the above: "); //prints message
                String toppings = myScanner2.next(); //declares and assigns value to variable that takes in toppings
                switch(toppings) { //all options for the toppings variable
                    case "C": case "c": //when C or c is entered
                        System.out.println("You ordered a burger with cheese"); //prints message
                        return; //kills program
                    case "A": case "a": //when A or a is entered
                        System.out.println("You ordered a burger with all the fixins"); //prunts message
                        return; //kills program
                    case "N": case "n": //when N or n is entered
                        System.out.println("You ordered a plain burger"); //print message
                        return; //kills program
                    default:
                        System.out.println("Invalid input"); //default message displayed
                        return;
                }
            case "S": case "s": //when S or s is entered
                System.out.print("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m): "); //prints message
                String flavor = myScanner3.next(); //declares and assigns value to variable that takes in flavor options
                switch (flavor) { //options for the flavor variable
                    case "P": case "p": //when P or p is entered
                        System.out.println("You ordered a Pepsi"); //prints message
                        return; //kills program
                    case "C": case "c": //when C or c is entered
                        System.out.println("You ordered a Coke"); //prints message
                        return; //kills program
                    case "S": case "s": //when S or s is entered
                        System.out.println("You ordered a Sprite"); //prints message
                        return; //kills program
                    case "M": case "m": //when M or m is entered
                    System.out.println("You ordered a Mountain Dew"); //prints message
                    return; //kills program
                    default:
                        System.out.println("Invalid input"); //default message displayed
                        return;
                }
            case "F": case "f": //when F or f is entered
                System.out.print("Do you want a large or small order of fries (L, l, S, or s): "); //prints message
                String size = myScanner4.next(); //declares and assigns value to variable that deels with size of fries
                switch (size) { //all options for fries
                    case "L": case "l": //when L or l is entered
                        System.out.println("You ordered large fries"); //prints message
                        return; //kills program
                    case "S": case"s": //when S or s is entered
                        System.out.println("You ordered small fries"); //prints message
                        return; //kills message
                    default:
                        System.out.println("Invalid input"); //default message displayed
                        return;
                }
            default: //what happens is B, b, S, s, F, or f is not entered
            System.out.println("Invalid input"); //prints message
            return; //kills program
        }
    }
}