//nov9
import java.util.*;
public class Ifs1{
  public static void main(String[] args){
  // Declarations
  String name,fname,lname,iname,firstn;
  firstn = "";
  Scanner x = new Scanner(System.in);
  
  
  
  System.out.println("What is your full name ");
  name = x.nextLine();
  int space = name.indexOf(' ');
  // we could also name.charAt(0) or name.charAt(space+1)
  fname = name.substring(0,1);
  lname = name.substring(space+1,space+2);
  iname = fname + lname;
  //System.out.println(iname);
  // if there are no spaces the computer gives the value of -1 for the indexOf
  // the () just holds the quesion
  if (space > 0 ) {
  System.out.println(name.substring(0,1).toUpperCase() + name.substring(space+1,space+2).toUpperCase());
  firstn = name.substring(0,space);
  }
  if (space == 0 ){//look for space being the first letter
    firstn = name.substring(1);
    System.out.print(name.substring(1,2).toUpperCase());
  }
  if (space < 0 ){//look for space being the first letter
    firstn = name.substring(0);
    System.out.print(name.substring(0,1).toUpperCase());
  }
  /*
   Rule 
   a variable declared in an if statemnts only lives in that if statement
   we call that local variables 
   a varibe called in the main is called a global variables
   */
  
  }//ends void
 }//ends class