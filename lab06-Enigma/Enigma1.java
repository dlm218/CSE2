//////////////////////////////////////////////////////////////////////
//David Mugavero
//October 1, 2014
//Lab06-Enigma1 Java Program
//
//This program gives practice with debugging by debugging a program written by someone else
/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner x = new Scanner(System.in); //scanner variable with assigned value
    percent = x.nextDouble(); //inputed value gets assigned here
   System.out.println("You entered "+percent+"%");
   //print out the proportion remaining for select percentages
   double remainder = 1 - (percent / 100); //variable to hold remainder value
   remainder = remainder * 100;
   int tempRemainder = (int) remainder;
   remainder = (double) tempRemainder / 100; //casted to an int and back to double to make a nice number
   System.out.println("The proportion remaining is " +remainder);
  }
}
/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *    The problem was the if statement were not working. Onlt when 14 was entered did the if statements work
 *    So I got rid of all of them and declared a variable "remainder" this took in the proportion out of 100 left
 *    I then casted it to an int and back to a double to make it look nice and now the program works
 * 
 */

