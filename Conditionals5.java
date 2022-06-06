// sanatjon
//nov 22
import java.util.*;

public class Conditionals5{
  public static void main(String[] args){
  // Declarations
  Scanner x = new Scanner(System.in);
  System.out.println("Enter your first name ");
  String fname = x.nextLine();
  char v = fname.toLowerCase().charAt(0);//u can put it in order
  boolean vowel = (v=='a' || v=='e' || v=='i' || v=='o' || v=='u');
  boolean con != vowel
  
  if(vowel && fname.length()<5){   //|| stand for or && stand for and
  System.out.println("This is a short vallosit ");  
  }//ends the first if
  else if (vowel && fname.length()>5){ // u can also remove the fname.length here becuase if the first one is less then the second doesnt need it 
    System.out.println("This is a long vallosit");
  } // ends the else if 
  
  else if (fname.length()<5){ 
    System.out.println("This is a short non  vallosit");
  }//ends else if of non val
  else{ 
    System.out.println("This is a long non vallosit");
  }//ends else
  
  }//ends void 
}//ends class
