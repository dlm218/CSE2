/////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 8, 2014
//LoopTheLoop Java Program
//This program is designed to take the input from a user and print out a star pattern corresponding to the inputted value
//
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String [] args) {
        while(true){
        System.out.print("Enter an int 1-15: ");
        Scanner myScanner = new Scanner(System.in);
        int number = 0;
        int k = 0;
        String Y = "";
        String y = "";
        if(myScanner.hasNextInt()){
            number = myScanner.nextInt();
        }
        else {
            return;
        }
            
        while(k < number){
            System.out.print("*");
            k++;
        }
        System.out.println();
        int i = 0;
        while(i < number){
            i++;
            int j = 0;
            while(j < i){
                j++;
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Enter Y or y to go again: ");
        Scanner myScanner2 = new Scanner(System.in);
        String again = myScanner2.next();
        if(again.equals("Y") || again.equals("y")){
            }
        else{
            return;
            }    
        }
    }
}