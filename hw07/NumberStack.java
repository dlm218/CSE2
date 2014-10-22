///////////////////////////////////////////////////////////////////
//David Mugavero
//October 17, 2014
//NumberStack Java Program
//This program is designed to take an input number from a and print out a certain display using for-loops, while-loops, and do-while-loops
//
import java.util.Scanner;
public class NumberStack{
    //main method required for all java programs
    public static void main(String [] args){
        System.out.print("Enter an int between 1 and 9: ");//prompt user with input
        Scanner myScanner = new Scanner(System.in);//declare and assign value to scanner variable
        int input = 0; // declares variable that will later have the value inputted from user
        while(!(myScanner.hasNextInt())){//check to make sure int is entered
            System.out.print("Enter an int between 1 and 9: ");
            myScanner.next();//reprompt if neccessary and assign empty value to myScanner again
        }
        input = myScanner.nextInt(); //if int entered, inout has that value
        if(input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6 || input == 7 || input == 8 || input == 9){
        //only run if desired inputs are entered
        //start of for-loop
        int k = 2; //variable controls number of times value of z gets printed each time
        int z = 1; //value printed
        int x = 1; //controls number of times z is printed
        int u = 1; //controls number of times "-" is printed
        int b = 1; //controls number of rows of z is printed
        for(int i = 0; i < input; i++){ //controls number of cubes of numbers
            for(int j = 1; j < k; j++){ //controls number of times the next for-loop is run
                for(int y = 0; y < x; y++){//controls number of times value of z is printed
                    System.out.print(z);//prints value of z
                }
                for(int c = 1; c < z; c++){//controls how many rows of value of z printed
                    System.out.println();//prints empty line
                    for(int a = 0; a < b; a++){//controls number of times z is printed in new row
                        if(z != 1){//doesnt print a second row if z=1
                            System.out.print(z);//prints value of z
                        }
                    }
                }
                b++;
                b++;//b gets incremented twice
                x++;
                x++;//x gets incrimented twice
                z++;//z incremented once
            }
            System.out.println();//prints empty line
            for(int w = 0; w < u; w++){//controls number of times "-" is printed
            System.out.print("-");//prints a "-"
            }
            System.out.println();//prints empty line
            u++;
            u++;//u ncremented twice
            }
            
            //start of while-loop
            /*int i = 0;//variable used to run number of sets of numbers printed
            while(i < input){ //runs while i < input
                int j = 1; //variable used in next loop
                while(j < k){ //runs while condition is true
                    int y = 0;//variable used in next loop
                    while(y < x){ //controls number of times z is printed
                        System.out.print(z);//print value of z
                        y++;//y incremented again and repeat loop
                    }
                    int c = 1;//variable used in next loop
                    while(c < z){//controls number of times empty spaces and additional rows of z is printed
                        System.out.println();//prints empty line
                        int a = 0;//variable used in next loop
                        while(a < b){//controls number of times additional rows of z is printed 
                            if(z != 1){//doesnt print additional rows if z=1
                                System.out.print(z);//prints value of z
                            }
                            a++;//increments a
                        }//repeats loop
                        c++;//increments c
                    }//repeats loop
                    j++;//j incrementd
                    b++;
                    b++;//b incremented twice
                    x++;
                    x++;//x incremented twice
                    z++;//z incremented
                }//repeats loop
                System.out.println();//prints empty line
                int w = 0;//variable used in next loop
                while(w < u){//controls number of "-" printed
                    System.out.print("-");//prints "-"
                    w++;//increments w
                }//repeats loop
                System.out.println();//prints empty space
                u++;
                u++;//increments u twice
                i++;//i incremented
            }//repeat loop*/
            
            //start of do-while-loop
            /*int i = 0;//varible used in first do-loop
            do{//do everything within these brackets until condition isnt true
                int j = 1;//used in second do-loop
                do{//do everything within brackets until condition isnt true
                    int y = 0;//variable used in third do-loop
                    do{//do everything within loop until condition isnt true
                        System.out.print(z);//print value of z
                        y++;//increment y
                    } while(y < x);//loop runs while this condition is true
                    int c = 1;//variable used in next loop
                    do{//do eveything within these brackets while condition is true
                        if(c < z){
                        //print new line only if condition is true
                        System.out.println();//print empty line
                        }
                        int a = 0;//variable used in next loop
                        do{//do everything within bracket while conditions are true
                            if(z != 1){//only prints additional rows of z is z isnt 1
                                System.out.print(z);//print additional rows of z
                            }
                            a++;//increment a
                        } while(a < b);//runs while condition is truw
                        c++;//increment c
                    } while(c < z);//run while condition is true
                    j++;//increment j
                    b++;
                    b++;//increment b twice
                    x++;
                    x++;//increment x twice
                    z++;//increment z
                } while(j < k);//run while condition is true
                System.out.println();//print empty line
                int w = 0;//variable used in next loop
                do{//do everything within brackets
                    System.out.print("-");//prints -
                    w++;//increment w
                } while(w < u);//runs while condition is true
                System.out.println();//prints empty line
                u++;
                u++;//increments u twice
                i++;//increment i
            } while(i < input);//runs while condition is true*/
        }
        else{
            //otherwise it exits the program
            return;
        }
    }
}