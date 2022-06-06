//sanatjon
//nov8
import java.util.*;
public class StringsIntro2{
  public static void main(String[] args){
  // Declarations
  Scanner x = new Scanner(System.in);
  String name,fname,lname,namem,temp,mname,fnamem,lnamem,mnamem;
  //inputs 
  System.out.println("What is you full name");
  //name input
  name = x.nextLine();
  // vars
  int space = name.indexOf(' ');  
  fname = name.substring(0,space);
  lname = name.substring(space+1);
  System.out.println("Enter full name with middle name " );
  namem = x.nextLine();
  int space1 = name.indexOf(' '); 
  temp = namem.substring(space1+1);
  int space2 = temp.indexOf(' '); 
  fnamem = namem.substring(0,space1);
  mnamem = temp.substring(0,space2);
  lnamem = temp.substring(space2 + 1);
  
  /*
   5) STRINGname.indexOf(' '); finds the fiest instance of something.
   -> if the respond is -1 that eans there were no mathces
   6) String name.toUpperCase() -> write the string in all upper case letters
   7) String name.toLowerCase() -> write the string in all upper case letters
   */

  
  
  System.out.println("Index of the space is: " + space);
  System.out.println("First name " + fname.toUpperCase() + " Last name " + lname.toLowerCase());

  
  }
}