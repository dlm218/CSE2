//////////////////////////////////////////////////////////////
//David Mugavero
//September 22, 2014
//CourseNumber Java Program
//
//This program takes in a six digit number for a course offered at Lehigh and returns what year and the semester it was offered
//
import java.util.Scanner;
public class CourseNumber {
    //main method required for all java programs
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); //declares and assigns value to variable
        System.out.print("Enter a six digit number giving the course semester: "); //displays message
        int nCourse; //declares variable
        if(myScanner.hasNextInt()) { //boolean statement that if true, the program procedes
            nCourse = myScanner.nextInt(); //assigns value
            int courseYear = nCourse / 100; //declares variable and assigns value of the year
            int semester = nCourse % 100; //declares value and assigns value of which semester
            if(nCourse > 186510 && nCourse < 201440) { //sets range of possible inputs
                if(semester == 10) {
                    System.out.println("The course was offered in Spring semester of " +courseYear); //message displayed if variable has value of 10
                }
                else if(semester == 20) {
                    System.out.println("The course was offered in Summer 1 semester of " +courseYear); //message displayed if variable has value of 20
                }
                else if(semester == 30) {
                    System.out.println("The course was offered in Summer 2 semester of " +courseYear); //message displayed if variable has value of 30
                }
                else if(semester == 40) {
                    System.out.println("The course was offered in Fall semester of " +courseYear); //message displayed if variable has value of 40
                }
                else {
                    System.out.println(+semester+ " is not a legitimate semester"); //message displayed if semester variable is invalid
                    return; //kills program
                }
            }
            else {
                System.out.println("The number was outside the range [186510,201440] "); //displayed if inputed value is outside range
                return;//kills program
            }
        }
    }
}