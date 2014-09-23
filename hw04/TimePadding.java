///////////////////////////////////////////////////
//David Mugavero
//September 22, 2014
//TimePadding Java Program
//
//This program is desgined to take an input of seconds that have past during the day and outputs the time of day
//
import java.util.Scanner;
public class TimePadding {
    //main method required for all java programs
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares and assigns value to variable
        System.out.print("Enter the time in seconds: "); //displayes message
        double inputSeconds; //declares variable
        String paddedMins = ""; //declares an empty string
        String paddedSecs = ""; //declares an empty string
        if(myScanner.hasNextInt()) { //boolean avriable that if true the program continues
            inputSeconds = myScanner.nextInt(); //assigns value
            if(inputSeconds > 0) { //makes sure inputed value is not negative
                double nHours = inputSeconds / 3600; //stores number of hours as double
                double nMinutes = ((inputSeconds / 3600) % 1 * 60); //finds number of minutes as double
                double nSeconds = (((inputSeconds / 3600) % 1) * 60) % 1 * 60; //finds number of seconds as double
                int Hours = (int) nHours; //converts hours from double to int and stores as new variable
                int Minutes = (int) nMinutes; //converts minutes from double to int and stores as new variable
                int Seconds = (int) nSeconds; //converts seconds from double to int and stores as new variable
                if(nMinutes < 10) {
                    if(nSeconds < 10) {
                        paddedSecs = String.format("%02d" , Seconds); //adds extra 0 to left of number if seconds are less then 10
                    }
                    paddedMins = String.format("%02d" , Minutes); //adds extra 0 to left of number if minutes are less then 10
                    System.out.println("The time is: " +Hours+ ":" +paddedMins+ ":" +paddedSecs); //displayed message if padded is needed
                }
                else {
                    System.out.println("The time is: " +Hours+ ":" +Minutes+ ":" +Seconds); //message displayed if padding is not needed
                }
            }
        }
    }
}