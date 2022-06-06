import java.util.*;
public class popquiz4{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Sanatjon's Calculator of Awesomeness");
  System.out.println("Pick a number interger please: ");
  int num1 = input.nextInt();
  System.out.println("Pick another number interger please: ");
  int num2 = input.nextInt();
  System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
  System.out.println(num1 + " x " + num2 +" = " + (num1*num2));
  System.out.println(num1 + " - " + num2 +" = " + (num1-num2));
  System.out.println(num1 + " / " + num2 +" = " + (double)(num1)/num2);
  
  }//ends void
}// end class2
