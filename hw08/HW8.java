//////////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 25, 2014
//HW8 Java Program
//The objectibe of this program is to use three overloads of the getInt method andoutput the desired outputs
//
import java.util.Scanner;
public class HW8{
	//main method required for all methods
  public static void main(String []arg){
		Scanner scan=new Scanner(System.in);//declare scanner for user input
		String input=getInput(scan,"Cc");//calls the scanner and one string method of getInput
		System.out.println("You entered '"+input+"'");//returns output of method
		
		input=getInput(scan,"yYnN",5); //call getInput method with a scanner, a string, and an int. give up after 5 attempts
		if(input!=""){
   		System.out.println("You entered '"+input+"'");//printer if input is not empty
		}
		input=getInput(scan,"Choose a digit: ","0123456789");//calls getInput with scanner and two strings
		System.out.println("You entered '"+input+"'");//output from method
  }
  
  public static String getInput(Scanner scan, String firstString){//method with a scanner and one string
  	while(true){//reruns method if the scanner length is not 1
  		System.out.print("Enter 'C' or 'c' to continue, anything else to quit: ");//prompts
  		while(scan.hasNextInt()){//checks to see if int entered
  			System.out.print("Invalid input, please try again: ");
  			scan.next();//clears value in scanner
  		}
  		String tempInput = scan.next();//value of scan assigned to string
  		if(firstString.contains(tempInput) && tempInput.length() == 1){//checks if inout is part of desried string and if one character in length
  			return tempInput;//returns to input
  		}
  		else{
  			System.out.println("You must enter one character");//displayed if string length is not 1
  			continue;//continues loop from beining
  		}
  	}
  }
  public static String getInput(Scanner scan, String firstString, int num){//method fro scanner, a string, and an int
  	int i = 0;//determines iterations of loop
  	while(i < num){//runs loop 5 times at most
  		System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//prompt
  		while(scan.hasNextInt()){//checks to see if int is entered
  			System.out.print("Invalid input, please try again: ");
  			scan.next();//clears value in scanner
  		}
  		String tempInput = scan.next();//value assigned to string
  		if(firstString.contains(tempInput) && tempInput.length() == 1){//makes sure inout is of desired charcater and length 1
  			return tempInput;//returns to input
  		}
  		else{//what happens if more then one character is entered
  			System.out.println("You must enter one character");
  			i++;//increment i
  		}
  	}
  	return " ";//returns empty string if loop runs out of interations
  }
  public static String getInput(Scanner scan, String firstString, String secondString){//method of scanner and two strings
  	while(true){//continues to rerun method if desired inout not entered
  		System.out.println(firstString);//prints message
  		System.out.print("Enter a digit 0-9: ");//prints message
  		while(!(scan.hasNextInt())){//checks to see if int entered
  			System.out.print("Invalid input, please try again: ");
  			scan.next();//clears value of scanner
  		}
  		String tempInput = scan.next();//assigns value to variable
  		if(secondString.contains(tempInput) && tempInput.length() == 1){//checks if inout is in desired range and of 1 character length
  			return tempInput;//value returned
  		}
  		else{//happened if not desired input
  			System.out.println("You must enter one character");
  			continue;//re-runs loop
  		}
  	}
  }
}
