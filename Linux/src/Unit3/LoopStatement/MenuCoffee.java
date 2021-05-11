
package Unit3.LoopStatement;
import java.text.DecimalFormat;
import java.util.Scanner;
public class MenuCoffee {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##.00 Reil");
    int qty;
    char op;
    String str;
    double price = 0,dis = 0,total = 0;
    String sub[] = {"E: Expresso","H: Hot Chocolate","M: Green Tea","I: Ice-Green Tea"};
    LOOK:do {      
      for(String temp:sub)
        System.out.println(temp);
      System.out.print("Please selection one option: ");
      op = cin.nextLine().charAt(0);
      switch(op){
        case 'E', 'e' -> {
          price = 15000;
        }
        case 'H', 'h'->{
          price = 12000;
        }
        case 'M','m'->{
          price = 10000;
        }
        case 'I', 'i'->{
          price = 11000;
        }
        default -> {
          System.out.print("Please select correct option!!! ");
          break LOOK;
        }
      }
      //not allow qty equal 0
      do {        
        System.out.print("Enter QTY: ");
        qty = cin.nextInt();
      } while (qty<=0);
      switch(qty){
        case 1->
          dis = 8;
        case 2->
          dis = 12;
        case 3->
          dis = 15;
      }
      total += price*qty-price*qty*dis/100;
      System.out.print("Please [Yes/No] to continue: ");
      cin.nextLine();
      str = cin.nextLine();
    } while (str.equalsIgnoreCase("yes"));
    System.out.println("Total is "+df.format(total));
  }
}
