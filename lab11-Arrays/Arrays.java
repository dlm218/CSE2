////////////////////////////////////////////////////////////
//David Mugavero
//November 5, 2014
//Arrays Java Program
//The function of this program is to prompt the user to enter 10 ints into an array and perform various functions with it
//
import java.util.Scanner;
public class Arrays{
    public static void main(String [] args){
        int numsEntered = 10;
        int [] numbers = new int[numsEntered];
        int [] numbers2 = new int[numsEntered];
        System.out.print("Enter 10 ints: ");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min: " +min);
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max: " +max);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum: " +sum);
        for(int i = 0, j = 9; i < numbers.length; i++, j--){
            numbers2[j] = numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]+ "  " +numbers2[i]);
        }
    }
}