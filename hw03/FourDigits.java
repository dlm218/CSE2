///////////////////////////////////////////////////////////////////
//David Mugavero
//Septmeber 14, 2014
//hw03
//FourDigits Java Program
//
//This program asks the user to input a double with many decimal places and it displays the first four decimal places as an int
//
import java.util.Scanner; //imports scanner for user input use
public class FourDigits {
    //main method required for every java program
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares scanner and assigns value
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- "); //prompts user to enter in a double
        double nNumber = myScanner.nextDouble(); //declares the variable the scanner stores and scanner stores inputed value as a double
        nNumber = nNumber * 10000; //allows for keeping all the digits of the double when converted to int
        String answer = ""; //declares a blank string
        answer = answer+(int) ((nNumber / 1000) % 10); //keeps the thousands place digit after the modulus operation
        answer = answer+(int) ((nNumber / 100) % 10); //keeps the hundereds place digit after the modulus operation
        answer = answer+(int) ((nNumber / 10) % 10); //keeps the tens place digit after the modulus operation
        answer = answer+(int) (nNumber) % 10; //keeps the ones place digit after the modulus operation
        System.out.println("The four digits are - " +answer); //displays answer
    }
}