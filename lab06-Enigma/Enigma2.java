////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 10, 2014
//Enigma2 Java Program
//The point of this program is to use the java.lang code to find the runtime error
//
import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * the java.lang tells you you cannot divide by 0
 * you know this because after java.lang.ArithmeticException: it says / by zero on line 15 of Enigma2
 * meaning that on line 15, there is a division by 0, which is not allowed, and that you should fix it
 * I fixed it and now its working fine
 * 
 */
