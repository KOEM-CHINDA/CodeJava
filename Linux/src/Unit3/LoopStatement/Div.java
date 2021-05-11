
package Unit3.LoopStatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Div {
  public static void main(String []agrs){
    DecimalFormat df = new DecimalFormat("#0.00");
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = cin.nextInt();
    if(n>0){
      double sum = 0;
      String str = "";
      for(int i=1; i<=n; i++){
        sum += (double)1/i;
        str += 1.0/i+"+ ";
      }
      System.out.println(str+"\b\b= "+df.format(sum));
    }else
      System.out.println("Try again..");
            
  }
}
