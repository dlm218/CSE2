//////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//November 12, 2014
//ArrayArithmetic Java Program
//This program is designed to perform various functions with arrays and methods, passing values into and out of the methods
//
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14, 0, 0, 0},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static double [] addArrays(double [] x, double [] y){
      double result [] = new double[x.length];
      for(int i = 0; i < x.length; i ++){
          result[i] = x[i] + y[i];
      }
      return result;
  }
  
  public static boolean equals(double [] x, double [] y){
    boolean equal [] = new boolean [x.length];
    int k = 0;
    if(x.length == y.length){
      for(int i = 0; i < x.length; i++){
        if(x[i] == y[i]){
          equal[i] = true;
        }
      }
    }
    for(int j = 0; j < x.length; j++){
      if(equal[j] == true){
        k++;
      }
    }
    if( k == x.length){
      return true;
    }
      return false;
  }
}