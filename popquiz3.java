//Sanatjon Bukrhanov
//oct 17 pop quiz
import java.util.Scanner;
public class popquiz3{
  public static void main(String[] args){
  // Declarations...
    String color;
    String tv;
    int year;
    double gas;
    double age;
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name? ");
    String name = input.nextLine();
    System.out.println("What is your favorite color? ");
    color = input.nextLine();
    System.out.println("What is your favorite tv show? ");
    tv = input.nextLine();
    System.out.println("What year were you born in? ");
    year = input.nextInt();
    System.out.println("What is the gas price around your neighberhood? ");
    gas = input.nextDouble();
    age = (2021.0-year);
    System.out.println("Hi " + name + " your favorite color is " + color + ".\nWe see you like watching " + tv + "\nWow you were born this year " + year + ".\nthat makes you " + age + " year old.\nThats a pretty high gas price $" + gas);
  
  
  
  }//ends mains
}//ends class
