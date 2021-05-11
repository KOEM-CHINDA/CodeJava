
package Unit6.OOP.Class.Abstract;

public class ClassB extends ClassA{

  @Override
  public void show() {
    for(int i=1; i<=5; i++){
      for(int j=1; j<=i; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}
