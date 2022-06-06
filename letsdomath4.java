import java.util.*;
import java.text.DecimalFormat; // java.text.* is all he same.
public class letsdomath4{
  public static void main(String [] args){
  //Declaration
  Scanner input = new Scanner(System.in);
  DecimalFormat df1 = new DecimalFormat("$#,###.00");  // for money it adds the money sign dont use for others
  /*
   Decimal format will format doubles into any parttern or form we chose.
   To format it, we put the style inside of the () of the declaration.
   TO format money -> $#,###.00
   */ 
  // code for monthly income no decimal format
  System.out.println("How much money do you spend in a week : ");
  double week = input.nextDouble();
  double month=week*4;
  System.out.println("This is how much you spend a week " + df1.format(week));
  System.out.println("This is how much you spend a month" + df1.format(month));
  
  //In sciece now many digits does a decimal need?
  DecimalFormat df2 = new DecimalFormat("0,000.###;"); // science stuff
  double x = .12345;
  double y = 1.234;
  double z = 12.34;
  double q = 123.4;
  double r = 1234.5;
  System.out.println(df2.format(x));
  System.out.println(df2.format(y));
  System.out.println(df2.format(z));
  System.out.println(df2.format(q));
  System.out.println(df2.format(r));
  /*
   1)putting 0 in the format forces a number in that place 0.4 -> 0.400 but if too big cuts it 0.45643 ->  0.456 assuming 0.000 is the format
   if used on whole numbers it just makes sure it has that amount of number if not adds a 0 
   2)# ruound of to the given value 0.044 fomrat of 0.## so it will be 0.04
   3) decimal formatted numer is a string you cannot do math wiht this type of formated number!
   4) using it in Print is a good idea no need to use this when you can use the acutal number then convert
   */ 
          

  
  
  }
}