///////////////////////////////////////////////////////////////
//David Mugavero
//September 21, 2014
//Month Java Program
//
//This program is designed to take in the input for the month and display the number of days in that month
//
import java.util.Scanner;
public class Month {
    //main method is required for all java programs
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares variable and assigns value
        System.out.print("Enter an int giving the number of the month (1-12): "); //print 
        int month;
        int year;
        if(myScanner.hasNextInt()) {//boolean variable that if true, the program progresses
            month = myScanner.nextInt(); //assigns value
            if(month > 0 && month >= 1 && month <= 12) { //makes sure number entered is positive
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    System.out.println("The month has 31 days"); //if number entered is any of the above, this message is displayed
                }
                 if(month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println("The month has 30 days"); //if number entered is any of the above, display this message
                }
                System.out.print("Enter an int giving the year: "); //message that is diplayed if number entered is 2
                if(month == 2) {
                    year = myScanner.nextInt();
                    if(year % 4 == 0) { //checks to see if year entered is a leap year
                        System.out.println("The month has 29 days"); //message displayed
                    }
                    if(year % 4 != 0) {
                        System.out.println("The month has 28 days"); //message displayed if not a leap year
                    }
                }
            }
            else {
                System.out.println("You did not enter an int between 1 and 12 "); //message displayed if invalid input
                return;//kills program
            }
        }
        
    }
}