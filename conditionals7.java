//nov 29
import java.util.*;
public class conditionals7{
  public static void main(String[] args){
  //Declarations
  Scanner x = new Scanner(System.in);
  
  
  
  //*EDitin this code
  //ask the user if they want to go to the vocation
  //yes do the ifs
  //no just say bye
  //anyother result say ERROR
  
  System.out.println("Do you want to go to a vocation. Press 0 for yes, 1 for no ");
  int vacay = x.nextInt();
  if(vacay==0){
    System.out.println("What is the ideal temp for vocaion is ");
    int temp = x.nextInt();
    
    if(temp>=110 || temp<0){
      System.out.println("These conditions are not suitable for vocation ");
    }
    
    else if(temp>=95){
      System.out.println("Aruba ");
    }
    
    else if(temp<95 && temp>80){//80-95
      System.out.println("Vegas ");
    }
    
    else if(temp<80 && temp>50){ // 50-80
      System.out.println("NYC ");
    }
    
    else if(temp<50 && temp>35){ //35-50
      System.out.println("sking ");
    }
    
    else if(temp<=35){
      System.out.println("Alaska "); 
    } 
  } // if  
  
  
  
  else if (vacay == 1 ){
  System.out.println("Okay bye bye :( ");  
  }
  
  
  else{
   System.out.println("ERROR :( "); 
   if (vacay > 2){
     System.out.println("You messed up on purpose.. HOW RUDE");
   }
   else{
   
   System.out.println("It was a honest mistake.. press 0 or 1 next time");
   }
  
  
  }
  
  } // end void
} // end class
