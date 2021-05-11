package Unit2.DataType;

import java.util.Scanner;

public class Min {
  public static void main(String[] agrs){
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter Value 1: ");
    int a = cin.nextInt();
    System.out.print("Enter Value 2: ");
    int b = cin.nextInt();
    int min = (a<b)?a:b;
    System.out.println("Min is "+min);
  }
}
