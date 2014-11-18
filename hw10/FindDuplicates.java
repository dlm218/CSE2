///////////////////////////////////////////////////////////////
//David Mugavero
//November 13, 2014
//FindDuplicates Java Program
//The objective of this program is to test if the entries entered into an array has duplicates, and then see if there are more then one duplicate
//
import java.util.Scanner;
public class FindDuplicates{
    //every java program needs a main method
  public static void main(String [] arg){
    Scanner scan= new Scanner(System.in);//variable declared and initialized
    int num[]= new int[10];//declared array and array type and length
    String answer = "";//takes in decion to re-run program
    do{
        //does all this while condition is true
      System.out.print("Enter 10 ints- ");//promts
      for(int j=0; j<10; j++){//assigns numbers entered to each spot in the array
        num[j]=scan.nextInt();
      }
      String out="The array ";//declared variable
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){//return true if theres a duplicate number in the array
        out+="has ";//adds to string if true
      }
      else{
          //adds to string if false
        out+="does not have ";
      }
      out+="duplicates.";//more additions to string
      System.out.println(out);//prints if there are duplicates in tha array
      out="The array ";//declares variable
      out+=listArray(num);//return a string of the form "{2, 3, -9}"
      if(exactlyOneDup(num)){//returns true if there is only one duplicate in array
        out+="has ";//added to string if true
      }
      else{
          //added to string if false
        out+="does not have ";
      }
      out+="exactly one duplicate.";//added to string
      System.out.println(out);//prints string
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//repormpts
      answer=scan.next();//takes in answer
    }while(answer.equals("Y") || answer.equals("y"));//condition that re-runs loop if true
  }

  public static String listArray(int num[]){//make array into {num, num2, num3} form
    String out="{";//start of string
    for(int j=0; j<num.length; j++){
        //adds numbers and , to the string
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";//added to string
    return out;//returns string
  }
  
  public static boolean hasDups(int num []){//looks to see if duplicates are present in array
    for(int j = 0; j < num.length; j++){//selects jth term of array
        for(int i = 0; i < num.length; i++){//compares jth term to every other term
            if(j != i && num[j] == num[i]){//if any of them are equal return true
                return true;
            }
        }
    }
      return false;//if none are the same
  }
  
  public static boolean exactlyOneDup(int num []){//checks to see if exactly one duplicate
      int k = 0;//shows number of duplicates
      for(int j = 0; j < num.length; j++){//selects jth term of array
        for(int i = 0; i < num.length; i++){//compares jth term to every other term
            if(j != i && num[j] == num[i]){//if any of them are equal, increment k
                k++;
            }
        }
        if(k == 1){//if k is only incremented once, return true
            return true;
        }
    }
    return false;//k != 1
  }
}