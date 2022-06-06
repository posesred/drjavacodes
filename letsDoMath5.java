//nov 3
import java.util.*;
import java.text.DecimalFormat;
public class letsDoMath5 {
  public static void main(String[] args){
    //declarations 
    Scanner x = new Scanner(System.in);
    DecimalFormat m = new DecimalFormat("$#,###.00");
    double w,r,g,b,p,t;
    System.out.println("How man white chips do you have? ");
    w = x.nextDouble();
    System.out.println("How many red chips do you have? ");
    r = x.nextDouble();
    System.out.println("How many green chips do you have? ");
    g = x.nextDouble();
    System.out.println("How many black chips do you have? ");
    b = x.nextDouble();
    System.out.println("How many purple chips do you have? ");
    p = x.nextDouble();
    t = w+(r*5)+(g*25)+(b*100)+(p*500);
    System.out.println("\t\t\t PAYOUT");
    System.out.println("You are going to be payed " + m.format(t));
    
    /*
     *****NEW Stuff about String
     1) how does a String work?
     by definition String is a goruping of characters
     AWESOME A w e s o m e
             0 1 2 3 4 5 6
     These character slots are called index vaules 
     Index values Always starts at 0
             
     
     */
    String word = "Awesome";
    
    x.close();
  }
}