///////////////////////////////////////////////////////////////////////////
//David Mugavero
//December 3, 2014
//PokerHands Java Program
//The objective of this program is to take input for a poker hand from a user and print that hand out and indicate what type of hand it is
//
import java.util.Scanner;
public class PokerHands{
    //main method required for all java programs
    public static void main(String [] args){
        System.out.print("Enter 'Y' or 'y' to enter a hand: ");//prompt user to enter a hand
        Scanner scan = new Scanner(System.in);//set up scanner to accept input
        String answer = scan.next();//takes in answer
        int [] hand = new int[5];//declare array and initialize length
        while(answer.equals("Y") || answer.equals("y")){//if condition is true, do the following
            for(int i = 0; i < 5; i++){
                //loop takes input and puts into hand array
                System.out.print("Enter the numbers corresponding to the cards you want" +"\n"+ "0-12 for a club, 0 = ace, 1 = king, 2 = queen, ... 12 = 2"+ "\n"+ "13-25 for a diamond, 13 = ace ... 25 = 2"+ "\n"+ "26-38 for a heart, 26 = ace ... 38 = 2"+ "\n"+ "39-51 for a spade, 39 = ace ... 51 = 2: ");
                //tells user what to enter and what each number 0-51 means in terms of the cards of a deck
                Scanner scan2 = new Scanner(System.in);//scanner that takes in card input
                int card = scan2.nextInt();//assigned to variable
                while(card < 0 || card > 51){
                    //makes sure numbers entered are within range
                    System.out.print("Invalid input, please try again: ");
                    card = scan2.nextInt();
                }
                hand[i] = card;//assigns input to hand
            }
            showOneHand(hand);//call to method that displays hand
            tellTheRank(hand);//call to method that tells what kind of hand is inputed
            System.out.print("Enter Y or y to enter another hand: ");
            //whether the user wants to input another hand
            answer = scan.next();
        }
    }
    
    public static void showOneHand(int hand[]){//displays hand
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	//arrays that hold suit and ranks of cards
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";//what gets displayed
	for(int s=0;s<4;s++){
  	out+=suit[s];//suit categories added to output
  	for(int rank=0;rank<13;rank++)//deals with rank of the card
    	for(int card=0;card<5;card++)//specific card of the hand
     	if(hand[card]/13==s && hand[card]%13==rank)//checks what suit and rank each card is
      	out+=face[rank];//adds to output
  	out+='\n';//new line
	}
	System.out.println(out);//displayed
  }
  
  public static void tellTheRank(int hand[]){//tells what kind of hand
      int [] suit = new int [5];//holds the suit of each card in the hand
      int [] rank = new int [5];//holds the ranks of each card in the hand
      for(int i = 0; i < 5; i++){
          //suit added to array
          suit[i] = hand[i]/13;
      }
      for(int j = 0; j < 5; j++){
          //rank added to array
          rank[j] = hand[j]%13;
      }
      int pair = 0;
      int z = 0;
      for(int j = 0; j < rank.length - 1; j++){//tests to see how many pairs are in the hand
          for(int i = z; i < rank.length - 1; i++){
              if(rank[j] == rank[i+1]){
                  pair++;//incremented if there is a pair
              }
          }
          z++;//specifices new starting card
      }
      int a = 0;//number of cards with same suit
      int b = 0;//new starting card for comparison
      for(int j = 0; j < suit.length - 1; j++){//sees if the hand is a flush
          for(int i = b; i < suit.length - 1; i++){
              if(suit[j] == suit[i+1]){
                  a++;//incremented if two cards have the same suit
              }
          }
          b++;
      }
      //sorts the ranks in acending order
      for(int j = 0; j < rank.length; j++){
          int min = rank[j];
          for(int i = 0; i < rank.length; i++){
              if(rank[j] != rank[i] && rank[i] > min){
                  int temp = min;
                  min = rank[i];
                  rank[i] = temp;
              }
          }
          rank[j] = min;
        }
        int straight = 0;
        if(rank[0] + 1 == rank[1] && rank[1] + 1 == rank[2] && rank[2] +1 == rank[3] && rank[3] + 1 == rank[4]){
            //sees if hand if a straight
            straight++;//increment if yes
        }
        int straightFlush = 0;
        if(straight == 1 && a == 10){
            //sees if hand is a straight flush
            straightFlush++;//increment if so
        }
        int royalFlush = 0;
        if(a == 10 && straight == 1 && rank[4] == 4 && rank[3] == 3 && rank[2] == 2 && rank[1] == 1 && rank[0] == 0){
            //sees if hand is royal flush
            royalFlush++;//increment if so
        }
        int invalid = 0;
      if(hand[0] == hand[1] || hand[0] == hand[2] || hand[0] == hand[3] || hand[0] == hand[4] || hand[1] == hand[2] || hand[1] == hand[3] || hand[1] == hand[4] || hand[2] == hand[3] || hand[2] == hand[4] || hand[3] == hand[4]){
          //if any of the cards in the hand are the same invalid is incremented
          invalid++;
      }
      if(invalid == 1){//displayed if the same card is entered twice
          System.out.println("You entered the same card two or more times, please enter another one");
      }
      if(pair == 0 && a < 10 && straight == 0 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a high card");
      }
      if(pair == 1 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a pair");
      }
      if(pair == 3 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a pair");
      }
      if(pair == 2  && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a two pair");
      }
      if(straight == 1 && royalFlush == 0 && straightFlush == 0 && invalid == 0){//if criteria is met, below message is displayed
            System.out.println("This is a straight");
      }
      if(a == 10 && royalFlush == 0 && straightFlush == 0 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a flush");
      }
      if(pair == 4 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a full house");
      }
      if(pair == 6 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a four of a kind");
      }
      if(straightFlush == 1 && royalFlush == 0 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a straight flush");
      }
      if(a == 10 && straight == 1 && rank[4] == 4 && rank[3] == 3 && rank[2] == 2 && rank[1] == 1 && rank[0] == 0 && invalid == 0){//if criteria is met, below message is displayed
          System.out.println("This is a royal flush!!!!");
      }
  }
}