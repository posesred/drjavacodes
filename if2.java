//nov10
import java.util.*;
public class if2{
  public static void main(String[] args){
  // declaration
  Scanner x = new Scanner(System.in);
  
  
  // Even = number /2 and no remainder
  /*
   if the IF is false it will run 
   if and else statemnes are connected chain or flow nothing can get between and they need to be together
   */
  System.out.println("Enter 0 if you ate and Enter 1 if you didnt eat ");
  int a = x.nextInt();
  if(a==0){
  System.out.println("You are not hungry ");
  
  }
  else{
  System.out.println("You are hungry ");
  
  }
  }//end void
}//ends class