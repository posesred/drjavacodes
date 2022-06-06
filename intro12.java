//Sanat
//oct 21
import java.util.*;
public class intro12{
  public static void main(String[] args){
  //Declaration
  Scanner input = new Scanner(System.in);
  int myInt = 1;
  double myDouble = 3;
  // we call declare a varible without setting a value.
  System.out.println("MyInt = " + myInt);
  System.out.println("MyDouble = "+myDouble);
  myInt = 6 + (int)myDouble;
  System.out.println("MyInt v2 = " + myInt);
  System.out.println("MyDouble = "+myDouble);
  /*
   We can change temorarily change our varable type by doing somehting called CASTiNG.
   casting allwes u to quick chnage a varibale tye in a single statemnet of code.
   
   if a situation accus when a double is bein converted to an int the code drops all decimals TRUNCATE
   */
  System.out.println("please enter a number with a decimal: ");
  int x = 2, y =3; //multiple line declaration
  
  System.out.println(x + " / " + y + " = " +   ((double)(x)/(y)));
  // int/ int = int answer so 2/3 = 0.667 is just 0 so it just removes the decimals.
  int x = 7;
  System.out.println(x + (double)x + 6);
  double y = 9.2;
  System.out.println(x/(int)y);
  }
}