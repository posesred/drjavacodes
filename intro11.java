//Sanatjon
//oct19
import java.util.*;
public class intro11{
  public static void main(String[] args){
    // Declarations
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is your name? "); //1 used
    String name = input.nextLine();
    System.out.println("How old are you? "); //2 used
    int age = input.nextInt();
    System.out.println("What is your favorite color? "); //3 used
    input.nextLine();
    String color = input.nextLine();
    System.out.println("What are your scared of? "); //4 used
    String fear = input.nextLine();
    System.out.println("What is your least favorite candy? "); //5 used
    String candy = input.nextLine();
    System.out.println("Where do you live? "); //6 used
    String adress = input.nextLine();
    System.out.println("Who are your friends? "); //7 used
    String friends = input.nextLine();
    System.out.println("Is it day or night: Dark or Bright "); //8 used
    String time = input.nextLine();
    System.out.println("Pick: Yes or Yes ");
    String yesNo = input.nextLine(); //9 used
    System.out.println("What happens at october 30 "); //10 used
    String halloween = input.nextLine();
    System.out.println("What do people do at Hallowen? "); // 11 used
    String trick = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick one: "); //12used
    String monster = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //12 used
    String monster2 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //13 used
    String monster3 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //14
    String monster4 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //15
    String monster5 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //16 
    String monster6 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //17
    String monster7 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //18
    String monster8 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //19
    String monster9 = input.nextLine();
    System.out.println("What are some scary monsters at hallowen? pick another one: "); //20
    String monster10 = input.nextLine();
    
    
    
    System.out.println("At october 30th " + name + " being " + age+ " years old was walking with " + friends + ".However he was shocked when " + fear + " was infornt of him/her at " + adress + " with a " + candy + " and the place felt very " + time );
    System.out.println("Are you going to " + trick + " at " + halloween + ". " + "\"" + yesNo + ". Wow that is crazy.");
    System.out.println("Covered in color " + color + " " + monster + ", " + monster2 + ", and " + monster3);
    System.out.println("We saw you running buts its okay becuase " + monster4 + ", " + monster5 + monster6+ ", " + monster5+ monster7+ ", " + monster8+ monster9+ ", " + monster10+".");
  }//ends main
}//ends class