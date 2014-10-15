///////////////////////////////////////////////////////////
//David Mugavero
//October 1, 2014
//Lab06-Enigma Java Program
//
//This program is set up to practice debugging the created program
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan = new Scanner(System.in);
    int n = 0;
    if(scan.hasNextInt()){
      n = scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n = 4;
      System.out.println("You entered "+n);
    }
    
    int k = 4,p = 6,q = 7,r = 8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
    }
    System.out.println("Again, you entered " +n);
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *   The error here occured in the default case
 *   The variable was not defined within that scope and therefore the system could not print out a value for that variable
 *   To fix this I assigned a vaule of the inputed number to the variable "n"
 *   Also since the last line of print was in the default case, it wouldn't get printed because the if statement was printed
 *   So i just took the printed statement out of the default case, deleted the default case, and just made it a print statement
 *   Also n was only conditionally initialized so I declared n outside the if statement and assigned it the va;ue of 0, it now works proerly
 */
