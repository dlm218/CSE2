//////////////////////////////////////////////////////////////
//David Mugavero
//November 2, 2014
//BloackedAgain Java Program
//This program is designed to use modular methods to slove the same problem in the stacks homework assignment
//
import java.util.Scanner;
public class BlockedAgain{
    //main method rewuried for all java programs
    public static void main(String []s){
        int m;//declare variable where input will go to
        Scanner scan = new Scanner(System.in);//scanner needed to accept input
        //force user to enter int in range 1-9, inclusive.
        m = getInt(scan);//calls getInt method
        allBlocks(m);//passes value from getInt to allBlocks
    }
    
    public static int getInt(Scanner scan){//gets inputed int
        System.out.print("Enter an int in the range 1-9: ");//prompt user
        scan = new Scanner(System.in);//scanner gets next inputed value
        boolean yes = checkInt(scan);//makes sure input is an int
        while(yes){//if it is, continue
            int input = scan.nextInt();//assign value of scanner to input
            boolean input2 = checkRange(input);//check to make sure int within range
            if(input2){
                //if its in range, return input to m variable
                return input;
            }
        }
        return 0;
    }
    

    public static boolean checkInt(Scanner scan2){//makes sure int is entered
        while(!(scan2.hasNextInt())){
            //keeps reprompting until int is enetered
            System.out.print("You did not enter an int, please try again: ");
            scan2.next();//clears scan if int not entered
        }
        if(scan2.hasNextInt()){
            //moves getInt method along
            return true;
        }
        return false;
    }
    
    public static boolean checkRange(int input){//cheks intered int is within range
        if(input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 6 && input != 7 && input != 8 && input != 9){
            //remprompts if int not within range
            System.out.print("You did not enter an int within the range, please try again: ");
        }
        else{
            //moves getInt method along
            return true;
        }
        return false;
    }
    public static void allBlocks(int m){//controls number of stacks printed out
        int k = 2;//variable controls number of times value of output gets printed each time
        int x = 1;//controls number of times output is printed
        int b = 1;//controls number of rows of output is printed
        int u = 1;//controls number of times "-" is printed
        int output = 1;//value printed
        for(int i = 0; i < m; i++){//controls number of stacks of numbers
            for(int j = 1; j < k; j++){//controls number of times each for-loop is run
                block(output, x, b, u);//passes values to block method to print the block of numbers
            }
            output++;//increase by 1
            b++;
            b++;//increase by 2
            x++;
            x++;//increase by 2
            u++;
            u++;//increase by 2
        }
    }
    
    public static void block(int output, int x, int b, int u){//prints number of stacks of numbers
        for(int y = 0; y < x; y++){
            //number of times output is printed
            System.out.print(output);
        }
        for(int c = 1; c < output; c++){//controls how many rows of value of output printed
            System.out.println();//prints empty line
            for(int a = 0; a < b; a++){//controls number of times output is printed in new row
                if(output != 1){//doesnt print a second row if output=1
                    System.out.print(output);//prints value of output
                }
            }
        }
        line(u, output);//passes value of u and output to line method
    }
    
    public static void line(int u, int output){//controls number of - printed
            System.out.println();//prints empty line
            for(int w = 0; w < u; w++){//controls number of times "-" is printed
            System.out.print("-");//prints a "-"
            }
            System.out.println();//prints empty line
    }

}