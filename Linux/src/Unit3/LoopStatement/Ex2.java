
package Unit3.LoopStatement;

import java.util.Scanner;

public class Ex2 {
  public static void main(String []agrs){
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = cin.nextInt();
    int sum = 0;
    String str = "";
    for(int i=1; i<=n; i++){
      sum+=i*2-1;
      str +=(i*2-1)+" + ";
    }
    System.out.println(str+"\b\b = "+sum);
  }
}
