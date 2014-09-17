/////////////////////////////////////////////////////////////////
//David Mugavero
//September 14, 2014
//hw03
//Root Java Program
//
//This program is designed to print out an estimate value of the cube root of a number entered by the user
//
import java.util.Scanner; //imports scanner for user input use
public class Root {
    //main method required for every java program
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares scanner and assigns value
        System.out.print("Enter a double, and I print out the cube root : "); //prompts the user to input a double
        double nNumber = myScanner.nextDouble(); //declares the variable and scanner takes in double value
        double guess = nNumber/3; //declares variable and assigns value of first guess
        guess = ((guess * guess * guess + nNumber)/( 3 * guess * guess)); //improves guess
        guess = ((2 * guess * guess * guess + nNumber)/( 3 * guess * guess)); //improves guess more
        guess = ((2 * guess * guess * guess + nNumber)/( 3 * guess * guess)); //improves guess even more
        guess = ((2 * guess * guess * guess + nNumber)/( 3 * guess * guess)); //improves guess yet again
        System.out.println("The cube root is " +guess); //displayes the crude estimate of the cube root of the inputed number
        System.out.println("Guess cubed is " +guess * guess * guess); //displayes crude estimate of the guess cubed
    }
}
