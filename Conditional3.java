//nov 15
import java.util.*;
public class Conditional3{
  public static void main(String[] args){
  //Declarations
  Scanner x = new Scanner(System.in);
  System.out.println("What your height? Enter the feet:" );
  int f = x.nextInt();
  System.out.println("What your height? Enter the inches:" );
  int i = x.nextInt();
  int newf = 12*f;
  int newh = newf+i;
  if (newh>=108){
  System.out.println("You are capping " );
  }
  
  else if(newh>= (6*12)+3){
  System.out.println("You are tall " );
  }
  
  else if(newh<= (4*12)+10){
  System.out.println("You are short " );
  }
  
  else if(newh>=72){
  System.out.println("You are kina tall " ); 
  }
   // goes in order 
    // kinda tall
  
  else if (newh<=62){
  System.out.println("You are kina short" );
  }
  
  else if  (newh<= 24){
  System.out.println("You are capping " );
  }
  
  else{System.out.println("You are average " );  
  }
  
  // else if is used to connectt ifs together 
  }
}