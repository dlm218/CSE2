/////////////////////////////////////////////////////////////////////////
//David Mugavero
//November 13, 2014
//PokerOdds Java Program
//The point of this program is to randomly generate possible poker hands, as well as display the odds of getting a hand with a certain pair
//
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  //main method required for all java programs
  public static void main(String [] arg){
    showHands();//calls showHands method
    simulateOdds();//calls simulateOdds method
  }
  
  public static void showHands(){
    String answer = "";//whats eventually displayed
    do{
      //all this done while condition is true
    int [] deck = new int[52];//make deck array
    String [] shownHand = new String[5];//array that is displayed
    for(int i = 0; i < deck.length; i++){//initialized deck array
      deck[i] = i;
    }
    int hand[] = {-1, -1, -1, -1, -1};//creates and assigns values to hand array
    for(int j = 0, k = 51; j < 5; j++, k--){//takes "cards" from deck and places them in the hand
      int index = (int) (Math.random() * deck.length);//draws a card
      while(deck[index] == -1){//makes sure value of index is not -1
        index = (int) (Math.random() * deck.length);
      }
      int temp = deck[index];//stores value of index in deck in temp varible
      deck[index] = hand[j];//stores value of hand in decks empty spot
      hand[j] = temp;//stores temp into hand spot
      int temp2 = deck[index];//puts -1 value into temp variable
      deck[index] = deck[k];//put last real value in the deck in the selected card spot
      deck[k] = -1;//replaces last spot in deck with -1
    }
    for(int x = 0; x < hand.length; x++){//finds ranking and suit of each card of each card in hand
      if(hand[x] % 13 == 0){
        shownHand[x] = "Ace of ";//added to string if hand[x] % 13 = 0
      }
      if(hand[x] % 13 == 1){
        shownHand[x] = "King of ";//added to string if hand[x] % 13 = 1
      }
      if(hand[x] % 13 == 2){
        shownHand[x] = "Queen of ";//added to string if hand[x] % 13 = 2
      }
      if(hand[x] % 13 == 3){
        shownHand[x] = "Jack of ";//added to string if hand[x] % 13 = 3
      }
      if(hand[x] % 13 == 4){
        shownHand[x] = "10 of ";//added to string if hand[x] % 13 = 4
      }
      if(hand[x] % 13 == 5){
        shownHand[x] = "9 of ";//added to string if hand[x] % 13 = 5
      }
      if(hand[x] % 13 == 6){
        shownHand[x] = "8 of ";//added to string if hand[x] % 13 = 6
      }
      if(hand[x] % 13 == 7){
        shownHand[x] = "7 of ";//added to string if hand[x] % 13 = 7
      }
      if(hand[x] % 13 == 8){
        shownHand[x] = "6 of ";//added to string if hand[x] % 13 = 8
      }
      if(hand[x] % 13 == 9){
        shownHand[x] = "5 of ";//added to string if hand[x] % 13 = 9
      }
      if(hand[x] % 13 == 10){
        shownHand[x] = "4 of ";//added to string if hand[x] % 13 = 10
      }
      if(hand[x] % 13 == 11){
        shownHand[x] = "3 of ";//added to string if hand[x] % 13 = 11
      }
      if(hand[x] % 13 == 12){
        shownHand[x] = "2 of ";//added to string if hand[x] % 13 = 12
      }
      
      if(hand[x] / 13 == 0){
        shownHand[x] += "clubs";//added to string if hand[x] / 13 = 0
      }
      if(hand[x] / 13 == 1){
        shownHand[x] += "diamonds";//added to string if hand[x] / 13 = 1
      }
      if(hand[x] / 13 == 2){
        shownHand[x] += "hearts";//added to string if hand[x] / 13 = 2
      }
      if(hand[x] / 13 == 3){
        shownHand[x] += "spades";//added to string if hand[x] / 13 = 3
      }
    }
    System.out.println(shownHand[0]+ "\n" +shownHand[1]+ "\n" +shownHand[2]+ "\n" +shownHand[3]+ "\n" +shownHand[4]);//prints out hand
    System.out.print("Do you want a different hand? Enter Y or y: ");//prompts user
    Scanner scan = new Scanner(System.in);
    //set up scanner to take input
    answer = scan.next();
    }while(answer.equals("Y") || answer.equals("y"));//condition that needs to be true to repeat, otherwise quites
  }
  
  public static void simulateOdds(){//calculates odds of a pair coming up
    int [] odds = new int[13];//array that displaces number of times a particular pair comes up
    String [] lables = {"Rank  Freq of exactly one pair", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};//declared and initialized array
    int noPair = 0;//counter for number of no pairs
    for(int a = 0; a < 10000; a++){//simulates 10,000 hands
    int [] deck = new int[52];//array representing the deck
    for(int i = 0; i < deck.length; i++){//assigns values to deck
      deck[i] = i;
    }
    int hand[] = {-1, -1, -1, -1, -1};//declares and initializes hand
    for(int j = 0, k = 51; j < 5; j++, k--){//takes "cards" from deck and places them in the hand
      int index = (int) (Math.random() * deck.length);//"draws" a card
      while( deck[index] == -1){//makes sure -1 isnt selected
        index = (int) (Math.random() * deck.length);
      }
      int temp = deck[index];//stores value of index in deck in temp varible
      deck[index] = hand[j];//stores value of hand in decks empty spot
      hand[j] = temp;//stores temp into hand spot
      int temp2 = deck[index];//puts -1 value into temp variable
      deck[index] = deck[k];//put last real value in the deck in the selected card spot
      deck[k] = -1;//replaces last spot in deck with -1
    }
    for(int i = 0; i < hand.length; i++){
      hand[i] = hand[i] % 13;//puts the hand in terms of their rank
    }
    int number = exactlyOneDup(hand);//calls method
    if(number == 0){
      odds[0]++;//index in the array thats increased if number returned in 0
    }
    if(number == 1){
      odds[1]++;//index in the array thats increased if number returned in 1
    }
    if(number == 2){
      odds[2]++;//index in the array thats increased if number returned in 2
    }
    if(number == 3){
      odds[3]++;//index in the array thats increased if number returned in 3
    }
    if(number == 4){
      odds[4]++;//index in the array thats increased if number returned in 4
    }
    if(number == 5){
      odds[5]++;//index in the array thats increased if number returned in 5
    }
    if(number == 6){
      odds[6]++;//index in the array thats increased if number returned in 6
    }
    if(number == 7){
      odds[7]++;//index in the array thats increased if number returned in 7
    }
    if(number == 8){
      odds[8]++;//index in the array thats increased if number returned in 7
    }
    if(number == 9){
      odds[9]++;//index in the array thats increased if number returned in 8
    }
    if(number == 10){
      odds[10]++;//index in the array thats increased if number returned in 10
    }
    if(number == 11){
      odds[11]++;//index in the array thats increased if number returned in 11
    }
    if(number == 12){
      odds[12]++;//index in the array thats increased if number returned in 12
    }
    if(number == -1){
      noPair++;//counter of no pairs increased if -1 is returned
    }
  }
  System.out.println(lables[0]+ "\n" +lables[1]+ "       " +odds[0]+ "\n" +lables[2]+ "       " +odds[1]+ "\n" +lables[3]+ "       " +odds[2]+ "\n" +lables[4]+ "       " +odds[3]+ "\n" +lables[5]+ "      " +odds[4]+ "\n" +lables[6]+ "       " +odds[5]+ "\n" +lables[7]+ "       " +odds[6]+ "\n" +lables[8]+ "       " +odds[7]+ "\n" +lables[9]+ "       " +odds[8]+ "\n" +lables[10]+ "       " +odds[9]+ "\n" +lables[11]+ "       " +odds[10]+ "\n" +lables[12]+ "       " +odds[11]+ "\n" +lables[13]+ "       " +odds[12]); //displayes both arrays simultaneously
  System.out.println("-------------------------");//displayed
  System.out.println("Not exactly one pair: " +noPair);//displays number of times no pair came up
}
  
  public static int exactlyOneDup(int num []){//checks to see if exactly one duplicate and returns rank of the double
      int k = 0;//shows number of duplicates
      for(int j = 0; j < num.length; j++){//selects jth term of array
        for(int i = 0; i < num.length; i++){//compares jth term to every other term
            if(j != i && num[j] == num[i]){//if any of them are equal, increment k
                k++;
            }
        }
        if(k == 1){//if k is only incremented once, return value that was the double
            return num[j];
        }
    }
    return -1;//if more then one double or no doubles at all return -1
  }
}