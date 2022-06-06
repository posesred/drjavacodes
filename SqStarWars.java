//nov 5
//Sanatjon
import java.util.*;
public class SqStarWars{
  public static void main(String[] args){
  //Declarations 
  Scanner x = new Scanner(System.in);
  int ln;
  String fname,lname,mname,city,car,sfname,slname,lnamel;
  
  System.out.println("\t\t\t\t\tStar Wars Name Generator");
  System.out.println("What is your first name? ");
  fname = x.nextLine();
  System.out.println("What is your last name? ");
  lname = x.nextLine();
  System.out.println("What is your mother's maiden name? ");
  mname = x.nextLine();
  System.out.println("What city were you born in? ");
  city = x.nextLine();
  System.out.println("What was the first car you drove? ");
  car = x.nextLine();
  sfname = (fname.substring(0,3)) + (lname.substring(0,2));
  slname = (mname.substring(0,2)) + (city.substring(0,3));
  ln = lname.length();
  lnamel = lname.substring(ln-2,ln);
  System.out.println("You are " + sfname + " " + slname + " of " + lnamel + car);
  
  
  
  
  }
}