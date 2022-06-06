//nov 30
import java.util.*;
public class Conditionals8 {
  public static void main(String[] args){
//Declaration of independence 
  Scanner input = new Scanner(System.in);
  String fry = "";
  
  System.out.println("Do you want fries? Press 0 for yes and 1 for no");
  int frychoice = input.nextInt();
  if(frychoice==0){
  System.out.println("what size would you like any? Press 1 for small and 2 for medium and 3 for Large");
  int choice = input.nextInt();
  if(choice == 1){
  fry = "Small";
  }//nested if#1
  else if(choice==2){
  fry = "Medium";
  }
  else if(choice==3){
  fry = "Large";
  }
  else{
  System.out.println("Error bad fry size ERROR");
  }
  System.out.println("Would you like any condiments? Press 1 for ketchup and 2 for Mustard and 3 for Mayo and 4 for none");
  int condomintschoice = input.nextInt();
  if(condomintschoice==1){
  System.out.println("You got ketchup with " + fry + " fries");
  }
  else if(condomintschoice==2){
  System.out.println("You got mustard with " + fry + " fries");
  }
  else if(condomintschoice==3){
  System.out.println("You got mayo with " + fry + " fries");
  }
  else if(condomintschoice==4){
  System.out.println("You got a " + fry + " fries");
  }
  else{
    System.out.println("Error bad Condiment Choice");
  }
  }//ends the yes for fries
  
  
  
  else if(frychoice==1){
  System.out.println("You got no fries");
  }
  
  else{
  System.out.println("ERROR");
  }
  
  
  
  
  }//ends void
}// ends class