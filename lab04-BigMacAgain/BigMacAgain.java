//////////////////////////////////////////////////////////////////////
//David Mugavero
//September 17, 2014
//BigMacAgain Java Program
//
//This program is designed to take the input from the user for number of big macs and whether they want fries or not
// as well as show the total cost for big macs, fries, and total meal cost
//
import java.util.Scanner; //allows for user input
public class BigMacAgain {
    //main method required for every java program
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares scanner and assigns variable
        System.out.print("Enter the number of big macs : "); //displays message
        int nMacs; //declares variable
        double costMacs; //declares variable
        if(myScanner.hasNextInt()) { //if statement evaluates if boolean is true
            nMacs = myScanner.nextInt(); //assigns vaue to variable
            costMacs = nMacs * 2.22; //assigns value to variable
            costMacs = costMacs * 100; //start of casting process
            int tempCost = (int) costMacs;
            costMacs = (double) tempCost/100; //end casting process
                if(nMacs > 0) { //makes sure int entered is greater then 0
            System.out.println("You ordered " +nMacs+ " Big Macs for a cost of " +nMacs+ "*2.22 = $ " +costMacs); //displays message
                }
        else { //this is what happens if the if int is less then 0
            System.out.println("You did not enter an int > 0 "); //prints message
            return; //kills the program
            }    
        }
        else { //what happpens if an int is not entered
            System.out.println("You did not enter and int ");
            return; //kills the program
            
        }
        System.out.print("Do you want an order of fries (Y/y/N/n) ? "); //displays message
        String wantsFries = myScanner.next(); //declares variable and assigns value for next input for the scanner
        
        if(wantsFries.equals("Y") || wantsFries.equals("y")) { //makes sure the input is either Y or y
                System.out.println("You ordered fries at a cost of $2.15 "); //prints message
                System.out.println("The total cost of the meal is " +(costMacs + 2.15)); //prints message
            }
        else if(wantsFries.equals("N") || wantsFries.equals("n")) { //makes sure the input is N or n if it is not Y or y
                System.out.print("The total cost of the meal is " +(nMacs * 2.22)); //prints message
        }    
        else { //what happens if neither of the ubove if statements are true
                System.out.print("You did not enter one of 'Y' , 'y' , 'N' , 'n' ");
                return; //kills program
                
            }
        
    }
}