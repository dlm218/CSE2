/////////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//September 29, 2014
//BoolaBoola Java Program
//
//This program is designed to randomly assign the value of true or false to three boolean variables and then randomly allign them in order with randomly && or || which then the user has to input whether the statement is true or false
import java.util.Scanner;
public class BoolaBoola {
    //main method reruired for all java programs
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares and assigns value to variable
        boolean bool1 = true; //declares and sets to value so no error forms
        boolean bool2 = true; //declares and sets to value so no error forms
        boolean bool3 = true; //declares and sets to value so no error forms
        int randbool1 = (int) (Math.random() * 2); //declares and assigns a value of 0 or 1 from the math.random function
        int randbool2 = (int) (Math.random() * 2); //declares and assigns a value of 0 or 1 from the math.random function
        int randbool3 = (int) (Math.random() * 2); //declares and assigns a value of 0 or 1 from the math.random function
        int randop1 = (int) (Math.random() * 2); //declares and assigns a value of 0 or 1 from the math.random function
        int randop2 = (int) (Math.random() * 2); //declares and assigns a value of 0 or 1 from the math.random function
        String op1 = null; //declares and assigns empty value
        String op2 = null; //declares and assigns empty value
        switch(randbool1) { //in the case of randbool1, if randbool1 = 0, make true, if randbool1 = 1, make false
            case 0:
                bool1 = true;
            break;    
            case 1:
                bool1 = false;
            break;    
        }
         switch(randbool2) { //in the case of randbool2, if randbool2 = 0, make true, if randbool2 = 1, make false
            case 0:
                bool2 = true;
            break;    
            case 1:
                bool2 = false;
            break;    
        }
        switch(randbool3) { //in the case of randbool3, if randbool3 = 0, make true, if randbool3 = 1, make false
            case 0:
                bool3 = true;
            break;    
            case 1:
                bool3 = false;
            break;    
        }
        switch(randop1) { //if randop1 = 0 make op1 = &&, if randop1 = 1 op1 = ||
            case 0:
                op1 = "&&";
            break;    
            case 1:
                op1 = "||";
            break;    
        }
        switch(randop2) { //if randop2 = 0 make op1 = &&, if randop2 = 1 op1 = ||
            case 0:
                op2 = "&&";
            break;    
            case 1:
                op2 = "||";
            break;    
        }
        boolean final1 = false; //declare and set default value
        boolean final2 = false; //declare and set defalut value
        boolean final3 = false; //declare and set default value
        if(op1.equals("||") && bool1 == true && bool2 == true){ //checks to see if first part of expression is true, sets final1 = true if it is, if not, goes back to default value
            final1 = true;
        }
        if(op1.equals("||") && bool1 == true && bool2 == false){ //checks to see if first part of expression is true, sets final1 = true if it is, if not, goes back to default value
            final1 = true;
        }
        if(op1.equals("&&") && bool1 == true && bool2 == true){ //checks to see if first part of expression is true, sets final1 = true if it is, if not, goes back to default value
            final1 = true;
        }
        if(op1.equals("||") && bool1 == false && bool2 == true){ //checks to see if first part of expression is true, sets final1 = true if it is, if not, goes back to default value
            final1 = true;
        }
        if(op2.equals("||") && final1 == true && bool3 == true){ //checks to see if second part of expression is true, sets final2 = true if it is, if not, goes back to default value
            final2 = true;
        }
        if(op2.equals("&&") && final1 == true && bool3 == true){ //checks to see if second part of expression is true, sets final2 = true if it is, if not, goes back to default value
            final2 = true;
        }
        if(op2.equals("||") && final1 == true && bool3 == false){ //checks to see if second part of expression is true, sets final2 = true if it is, if not, goes back to default value
            final2 = true;
        }
        if(op2.equals("||") && final1 == false && bool3 == true){ //checks to see if second part of expression is true, sets final2 = true if it is, if not, goes back to default value
            final2 = true;
        }
        System.out.print("Does " +bool1+op1+bool2+op2+bool3+ " have the value true (T/t) or false (F/f)? : "); //prints message
        String answer = myScanner.next(); //declares variable and assigns value of next inputed value
        switch(answer) { //what goes about if T or t is entered
            case "T":
            case "t":
              if(final2 == true){
                  System.out.println("Correct!"); //message displayed if inputed value by user equals final2
                  return;
              }
              else {
                  System.out.println("Wrong, try again"); //message displayed if inputed value does not equal final2
                  return;
              }
            case "F":
            case "f":
                if(final2 == false){
                    System.out.println("Correct!"); //message displayed if inputed value by user equals final2
                    return;
                }
                else {
                    System.out.println("Wrong, try again"); //message displayed if inputed value does not equal final2
                    return;
                }
            default:
                System.out.println("Invalid input"); //message displayed if T, t, F, or f are not entered
                return;
        }
    }
}