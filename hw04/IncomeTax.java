/////////////////////////////////////////////////////////////////
//David Mugavero
//September 21, 2014
//IncomeTax Java Program
//
//This program is designed to take in an input for the income of an individual (in thousands of dollars) and tells you the tax rate and how much tax
//
import java.util.Scanner;
public class IncomeTax {
    //main method required for all java programs
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares and assigns value to scanner
        System.out.print("Enter an int that gives the number of thousands of dollars in income: "); //display message
        int nIncome; //declares variable
        double incomeTax = 0; //declares variable and assigns empty value
        if(myScanner.hasNextInt()) { //boolean statement that if = true, the statement continues
            nIncome = myScanner.nextInt(); //assigns value
            nIncome = nIncome * 1000; //puts into thousands of dollars
            int taxRate = 0; //declares and assigns empty value to variable
            if(nIncome > 0) { //makes sure inputed value is not negative
                if((nIncome < 20000)) { //assigns value to taxRate if inputed value is < 20000
                    taxRate = 5;
                    incomeTax = (nIncome * taxRate) / 100;
                }
                else if((nIncome >= 20000 && nIncome < 40000)) { //assigns value to taxRate if 20000 < inputed value < 40000
                    taxRate = 7;
                    incomeTax = (nIncome * taxRate) / 100;
                }
                else if((nIncome >= 40000 && nIncome < 78000)) { //assigns value to taxRate if the inputed value falls within range
                    taxRate = 12;
                    incomeTax = (nIncome * taxRate) / 100;
                }
                else if((nIncome >= 78000)) { //assigns value to taxRate if inputed value falls within range
                    taxRate = 14;
                    incomeTax = (nIncome * taxRate) / 100;
                }
                System.out.println("The tax rate on $" +nIncome+ " is " +taxRate+ "%, and the tax is " +incomeTax);
            }//displays message
            else {
                System.out.println("You did not enter a positive int");
                return; //displayed is a negative int is entered, then kills program
            }
        }
        else {
            System.out.println("You did not enter an int");
            return; //displayed if an int is not entered, then kills programs
            }
        }
    }