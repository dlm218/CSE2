///////////////////////////////////////////////////////////////////////////
//David Mugavero
//October 29, 2014
//Java Program MethodsCalls
//This objective of this program is to get practice in having a method call a method
//
public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(98,-3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(9,90));
    }
    
    public static int addDigit(int num1, int num2){
        String stringOne = Integer.toString(num1);
        String stringTwo = Integer.toString(num2);
        String answer = stringTwo + stringOne;
        return Integer.parseInt(answer);
    }
    
    public static int join(int num1, int num2){
        String stringOne = Integer.toString(num1);
        String stringTwo = Integer.toString(num2);
        String answer = stringOne + stringTwo;
        return Integer.parseInt(answer);
    }
}