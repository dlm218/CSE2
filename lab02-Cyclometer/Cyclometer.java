/////////////////////////////////////////////////////////
//David Mugavero
//September 3, 2014
//lab02
//Cyclometer Java Program
//
//This program records two different kinds of data
//The time elapsed in seconds and the number of rotations
//of the front wheel during that time interval
//
public class Cyclometer{
    //main method required for every Java program
    public static void main (String [] args) {
        double secsTrip1=480; //stores the seconds for the first trip as 480
        double secsTrip2=3220; //stores seconds for the second trip as 3220
        int countsTrip1=1561; //stores number of rotations for the first trip as 1561
        int countsTrip2=9037; //stores number of rotations for the second trip as 9037
        double wheelDiameter=27.0; //gives a useful constant for wheel diameter
        double PI=3.14159; //stores the value of PI
        int feetPerMile=5280; //stores the number of feet in a mile as 5280
        int inchesPerFoot=12; //stores number of inches in a foot as 12
        int secondsPerMinute=60; //stores number of seconds in a minute as 60
        double distanceTrip1, distanceTrip2, totalDistance; //distance of each trip as well as both trips combined
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
        //print out the output data.
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}