////////////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 15, 2014
//MoreLoops Java Program
//This program is designed to convert between different types of loops
//
import java.util.Scanner;
public class MoreLoops{
    //main method required for all java programs
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);//declares and assigns value to scanner variable
        int n = 0; //variable later used for inputed value from user
        System.out.print("Enter an int: ");//prompts user to enter an int
        n = scan.nextInt();//inputted int assigned to n
        //n = scan.nextInt();
        /*while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
        }*/
        
        if(!scan.hasNextInt()){
            do{//do-while-loop converted from while-loop
                scan.next();//clears value of scan if int is not entered
                System.out.print("You did not enter an int; try again: ");//reprompts user for input
            } while(!scan.hasNextInt());//loop runs while condition is true
        }
        
        //n=scan.nextInt();

        /*for(int j=0;j<n && j<40;j++){
    	    for(int k=0;k<j+1;k++){
   	            System.out.print('*');
    	}
    	System.out.println();
        }*/
        
        //converted while-loop from for-loop
        int j = 0;//variable used in condition for loop
        while(j < n && j< 40){//runs while conditions are true
            int k = 0;//variable used in next loop
            while(k < (j + 1)){//runs while conditions are true
                System.out.print("*");//prints *
                k++;//increments k
            }//repeat loop
            System.out.println();//print empty line
            j++;//increment j
        }//repeat loop
        
       /* int k=4;

        do{
    	    System.out.println("k="+k);
    	    k++;
        } while(k<4);*/
        
        int k = 4;//converted while-loop from do-while-loop
        while(k <= 4){//runs while condition is true
            System.out.println("k= " +k);//prints message
            k++;//increments k
        }//repeats loop
        
        /*int count=0;
    	while(true){
    	    switch(n){
    	        default: System.out.println(n + " is > 5 or <1");
   	            break;
    	        case 1:
    	        case 2: System.out.print("Case 2 ");
   	            continue;
    	        case 3: break;
    	        case 4: System.out.println("Case 4");
    	        case 5: System.out.println("Case 5");
   	            break;
    	    }
    	    count++;
    	    if(count>10)
   	            break;
        }*/
        
        //converted for-loop from while-loop
        for(int count = 0; true; count++){//declares varible and assigns value, runs when condition is true, incremnts variable at end of loop
            if(n != 1 && n != 2 && n != 3 && n != 4 && n != 5){
                //this happens if n isnt any of those values
                System.out.println(n+ " is > 5 or < 1");//message printed
                break;//exits nearest loop
            }
            if(n == 1){
                //happens if n=1
                System.out.println("Case 2");
                continue;//continues forever
            }
            if(n == 2){
                //happens if n=2
                System.out.println("Case 2");
                continue;
            }
            if(n == 3){
                break;//exits loop if n=3
            }
            if(n == 4){
                //printed if n=4
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            if(n == 5){
                break;//exits program if n=5
            }
            if(count > 10)
                break;//once count gets greater then 10, exit loop
        }
    }
}