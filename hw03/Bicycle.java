//////////////////////////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//September 16, 2014
//hw03
//Bicycle Java Program
//
//This program is designed to input two numbers, the number of counts of s cyclometer and the seocnds on which those counts occured over, and output the distance travelled and the average miles per hour
//
import java.util.Scanner; //imports java scanner for user input use
public class Bicycle {
    //main method required for every java program
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares variable for scanner and assigns value
        System.out.print("Enter the number of seconds : "); //tells user to input value for seocnds
        int nSeconds = myScanner.nextInt(); //scanner takes in int value
        System.out.print("Enter the number of counts : "); //tells user to input value for counts
        int nCounts = myScanner.nextInt(); //scanner take in int value
        int inchesPerFoot = 12; //assigned value to variable
        int feetPerMile = 5280; //assigned value to variable
        int secondsPerMinute = 60; //assigned value to variable
        double wheelDiameter = 27.0; //assigned value to variable
        double PI = 3.141593; //assigned value to variable
        double distanceTrip; //declares variable
        double distanceTrip3 = (nCounts * wheelDiameter * PI) / (inchesPerFoot * feetPerMile); //declares variable, used this to conserve accuracy for the avg mph
        distanceTrip = (nCounts * wheelDiameter * PI) / (inchesPerFoot * feetPerMile); //assigns value to variable
        //process of casting value of distance begings
        distanceTrip = distanceTrip*100; 
        int tempDistance = (int) distanceTrip;
        distanceTrip = (double) tempDistance/100; //process of casting value of distance ends
        double timeTrip; //declares variable
        double timeAvgTrip; //decalres variable
        double avgMph; //declares variable
        timeTrip = nSeconds / secondsPerMinute; //assigns value to varible
        timeAvgTrip = timeTrip/60; //assigns value to variable
        avgMph = distanceTrip3/timeAvgTrip; //assigns value to variable
        //process of casting avg mph beings
        avgMph = avgMph*100;
        int tempAvg = (int) avgMph;
        avgMph = (double) tempAvg/100; //process of casting ends
        System.out.println("The distance was " +distanceTrip+ " miles and took " +timeTrip+ " minutes "); //displays distance and time
        System.out.println("The avg mph was " +avgMph); //displays avg mph
        
    }
}