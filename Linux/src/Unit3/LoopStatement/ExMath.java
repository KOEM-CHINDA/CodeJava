
package Unit3.LoopStatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExMath {
  public static void main(String []agrs){
    DecimalFormat df = new DecimalFormat("#0.00");
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = cin.nextInt();
    double sum = 0;
    String str = "";
    if(n==0){
      sum = 1;
      str = "COS("+n+") + ";
    }
    else{
      for(int i=1; i<=n; i++){
      sum+=Math.cos(i);
      str+="COS("+i+") + ";
      }
    }
    System.out.println(str+"\b\b= "+df.format(sum));
    
  }
  
}
