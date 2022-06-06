//nov 2
//Sanatjon Burkhanov
//PIGGY BANK
import java.util.*;
import java.text.DecimalFormat;
public class piggybank{
  public static void main(String[] args){
  //Declarations
  Scanner input = new Scanner(System.in);
  DecimalFormat fd1 = new DecimalFormat("$#,###.00");
  String name;
  double q,d,n,p,w,c,y;
  System.out.println("Piggy Bank");
  System.out.println("What is your name? ");
  name = input.nextLine();
  System.out.println("How many quaters are in your piggy bank? ");
  q = input.nextDouble();
  System.out.println("How many dimes are in your piggy bank? ");
  d = input.nextDouble();
  System.out.println("How many nickels are in your piggy bank? ");
  n = input.nextDouble();
  System.out.println("How many pennies are in your piggy bank? ");
  p = input.nextDouble();
  System.out.println( "\t\t PIGGY BANK");
  String t = "\t\t";
  System.out.println("Quaters "+t  + fd1.format(q*.25));
  System.out.println("Dimes   " +t + fd1.format(d*.1));
  System.out.println("Nickels "+t  + fd1.format(n*.05));
  System.out.println("Pennies "+t + fd1.format(p*.01));
  System.out.println("How many weeks has it been since you started saving? "); 
  w = input.nextDouble();
  c = ((q*.25)+(d*.1)+(n*0.05)+(p*.01))/w;
  y = c *52;
  System.out.println(name+" you are saving at a rate of " + fd1.format(c) + " perweek.");
  System.out.println(name+", at this rate you can save "+ fd1.format(y)  +" in one year.");
   }//end void
}//end class