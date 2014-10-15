//////////////////////////////
//
//
//
//
//
import java.util.Scanner;
public class PracticeforExam{
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        int example = myScanner.nextInt();
        int x,y,z;
        x = 4;
        y = x++;
        boolean tiger = x == y;//false
        z = ++y * x++;
        System.out.println(x + " " + y + " " + z); //6 5 25
        y += x;//11
        --x;//5
        z -= --y;//15
        x = y;
        if(tiger){//gotcha
            System.out.println("Gotcha");
            --z;//14
            int q = --z;//13
            System.out.println(q + " " + y + " " + z);//13 11 13
        }
        else{
            System.out.println("Sucks");
        }
        int s = x * y; //55
        switch(x){
            default: System.out.print("Hey there");break;
            case 3: System.out.println("Case 3!!!!!!!!!!!!!!!!!!!!!");
            case 4: System.out.println("Zomg case 4");
            case 7: System.out.println("7777777777777777777777777");
        }
        
    }
}