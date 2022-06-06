//sanatjon
//nov 24
import java.util.*;
public class Conditionals6{
  public static void main(String[] args){
  //Declarations
  Scanner x = new Scanner(System.in);
  System.out.println("Enter a food ");
  String food1 = x.nextLine();
  System.out.println("Enter another food ");
  String food2 = x.nextLine();
  int food1l = food1.length();
  int food2l = food2.length();
  boolean longer = food1l>food2l;
  boolean shorter = food2l>food1l;
  char a1  = food1.toLowerCase().charAt(0);
  char a2  = food2.toLowerCase().charAt(0);
  boolean first = a1 > a2;
  boolean last = a2>a1;
  boolean equalsize = food1l == food2l;
  boolean equalspeed = a1 == a2;
  
  System.out.println("Foods entered " + food1 + " " + food2);
  if(shorter && last){//first  // good
  System.out.println(food1 + " is shorter and alphabetically first compared to " + food2); 
  }//ends if 
  
  
  else if(longer && last){//first //good
  System.out.println(food1 + " is longer and but alphabetically first compared to " + food2);
  }//ends else if 
  
  
  else if (shorter && first){ //last 
  System.out.println(food1 + " is shorter and but alphabetically second compared to " + food2);  
  } //else
  
  
  else if(longer && first ){ //last
  System.out.println(food1 + " is longer and  alphabetically second compared to " + food2); 
  }
  
  else if(equalsize && equalspeed){
   System.out.println(food1 + " and " + food2 + " both start with the same letters and have same size. ");  
  }
  
  else if (equalsize && first){
   System.out.println(food1 + " and " + food2 + " both have same amount of characters but " + food1 + " is alphabetically first"); 
  }
  
  
  else if (equalsize && last){
   System.out.println(food1 + " and " + food2 + " both have same amount of characters but " + food2 + " is alphabetically first"); 
  }
  
  
  else if (shorter && equalspeed){
   System.out.println(food1 + " and " + food2 + " both are alpahbetically the same but " + food2 + " has more characters"); 
  }
  
  
  else if (longer && equalspeed){
   System.out.println(food1 + " and " + food2 + " both are alpahbetically the same but " + food1 + " has more characters"); 
  }
  
  //if food1 is both shorter and alphabetically first 1 done
  //longer  and aplha first 2 done 
  //short and aplha last 3 done 
  //longer and last 4  done
  //equal and equal 5 done
  //equal and first 6 done
  //equal and last 7 done
  //short and same 8 done
  //long and same 9 
  //System.out.println(food1 + " " + food2 +"They have the same amount of letters");                   
                     
  }//ends void
}//ends class