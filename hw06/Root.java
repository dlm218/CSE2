////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 11, 2014
//Root Java Program
//This program uses loops to calculate the squareroot of a number
//
import java.util.Scanner;
public class Root{
    //main method required for every java program
    public static void main(String [] args){
        System.out.print("Enter a number you wish to find the square root of: ");
        Scanner myScanner = new Scanner(System.in);//declare and assign value to scanner variable
        double number = 0.0;//makes it not initilized only conditionally
        while(!(myScanner.hasNextDouble())){//check to make sure double is entered
            System.out.print("Enter a number you wish to find the square root of: ");
            myScanner.next();//reprompt if neccessary and assign empty value to myScanner again
        }
        number = myScanner.nextDouble();//if doubl is entered store in number
        double low = 0;
        double high = number + 1;//high and low are boundaries of squareroot of number
        while((high - low) > (0.0000001 * high)){//condition to stop the loop
            double middle = ((low + high) / 2);
            if((middle * middle) > number){//narrows range for squareroot
                high = middle;
        }
            if((middle * middle) < number){//narrows range for squareroot
                low = middle;
            }
        }
        System.out.println("The square root is " +high);//print answer
    }
}