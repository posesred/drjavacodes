//Sanat
//java
import java.util.*;
public class intro10{
  public static void main(String[] args){
    //Declaration
    Scanner input = new Scanner(System.in);
    System.out.println("What is your favorite clothing brand? ");
    String clothing = input.nextLine();
    System.out.println("How tall are you? Answer the feet value then inches ");
    System.out.print("Feet: ");
    int feet = input.nextInt();
    System.out.print("Inches: ");
    int inches = input.nextInt();
    System.out.println("What is your favorite beverage? ");
    input.nextLine();// this was used to fill in after the int got skipped
    String bev = input.nextLine();
    
    
    //output 
    System.out.println("\n");
    System.out.println("our favorite brand is " + clothing);
    System.out.println("You are " + feet + "ft and " + inches + "in tall");
    System.out.println("You are " + (feet * 12 +inches) +" total inches tall"); // total
    System.out.println("Asking all these quesions makes you thristy, enjoy a " + bev);
    
    /*
     RULES FOR DECLARING VARIABLES
     1)All variables should begin with a letter (A - Z, a-z), currency counter ($) or an underscore(_)
     a) we will start all variables in lower case
     2)after first character you can have any combination of characters
     a)EXECPT no SPACES ALLOWED
     3)Keywords CANNOT be used as a variables name - they are "blue" word
     a) CANT use int double if for while do import
     4) variables are case sensitive (age AGE Age aGE agE are all different)
     5) if your variable has two names we can declare as...age year
     a) camelCase ageYear
     b)use _ -> age_year
     
     */
    int age;
    double salary;
    double yearlySalary;// no space double yearly salary;
    String words; // var needs to start from a-z String 2Words;
    String $2Words; // $ start is okay
    String badWords;
    String goodWords; //_ is okay to start
    int a123nums;
    float thise;
    
    
    
  }//ends void
}//ends class
