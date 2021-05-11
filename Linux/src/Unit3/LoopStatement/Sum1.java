
package Unit3.LoopStatement;
import java.util.Scanner;
public class Sum1 {
  public static void main(String []agrs){
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = cin.nextInt();
    int sum = 0;
    int t = 1;
    String str = "";
    for(int i=1; i<=n; i++){
      sum +=t;
      t =(t*10)+1;
    }
    System.out.println(sum);
  }
}
