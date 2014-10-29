///////////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 22, 2014
//Methods Java Program
//This program is designed to use three different kinds of methods to take in three ints and rank them in order of how big they are and if they are entered in ascending order
//
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
		Scanner scan = new Scanner(System.in);
		int a = getInt(scan);
		int b = getInt(scan);
		int c = getInt(scan);
		int twoNums = larger(a, b);
		int threeNums = larger(c, (larger(a, b)));
		String ascend = ascending(a, b, c);
		System.out.println("The larger of "+a+" and "+b+" is "+twoNums);
		System.out.println("The larger of "+a+", "+b+", and "+c+" is "+threeNums);
	  System.out.println("It is " +ascend+ " that " +a+ ", " +b+ ", " +c+ " are in ascending order");
  }
  
    public static int getInt(Scanner scan){
	  	System.out.print("Enter an int: ");
			while(!(scan.hasNextInt())){
				System.out.print("That is incorrect, please enter an int: ");
				scan.next();
			}
			int firstNum = scan.nextInt();
			return firstNum;
		}
		
		public static int larger(int num1, int num2){
			if(num1 > num2){
				return num1;
			}
			else{
				return num2;
			}
		}
		
		public static String ascending(int num1, int num2, int num3){
			String ascendTrue = "true";
			String ascendFalse = "false";
			if(num1 < num2 && num1 < num3 && num2 < num3){
				return ascendTrue;
			}
			else{
				return ascendFalse;
			}
	}
}