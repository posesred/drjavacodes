//nov 4
import java.util.*;
public class StringsIntro1 {
  public static void main(String[] args){
  //Declarations
  Scanner x = new Scanner(System.in);
  String word = x.nextLine();
  int wordl = word.length();
  char first = word.charAt(0);
  char second = word.charAt(1);
  char last = word.charAt(wordl-1);
  String nword = "something crazy";
  int space = nword.indexOf(' ');
  /*
    How does a String work? 
    What is a string
    a grouping of characters
    we use String to print out info for the User
    A String is saved as a location of data fo the computer to access at any given time.
    The computer allocates a slot for each char in the String
    String word = "Awesome"
    Awesome -> A w e s o m e
               0 1 2 3 4 5 6
    These slots are called INDEX VALUES
    String always start at Index value 0.
    
   */
  System.out.println("Please enter a word");
 
  
  System.out.println("Number of letters in " +word + " = " + wordl);
  System.out.println("First letter of " + word + " is " + first);
  System.out.println("First letter of " + word + " is " + second);
  System.out.println("First letter of " + word + " is " + last);
  
  /*
   String Methods
   1) .length()-> tells is the amount of char in the String
   2) .charAt(INDEX VALUE) -> 
   3) to find last we need to do .charAt(wordlength-1)
   4) .substring(INDEX OF START, INDEX OF LETTER AFTER
   -> .substring(Start INDEX)-> this will start at the ponint and print until the end of the string
   */ 
  System.out.println("The new word is " + nword);
  System.out.println(nword.substring(0,9) );
  System.out.println(nword.substring(10,14) );
  System.out.println(nword.substring(10,15) );
  System.out.println(nword.substring(10) );
  System.out.println("Space was found at index " + space );
  System.out.println(nword.substring(0,space));
  
  
  
  
  
  
  }//ends main
  
}//ends class