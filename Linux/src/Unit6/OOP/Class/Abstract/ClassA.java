
package Unit6.OOP.Class.Abstract;

public abstract class ClassA {
  private int a;

  public ClassA() {
  }

  public ClassA(int a) {
    this.a = a;
  }
  public int getA(){
    return a;
  }
  public abstract void show();
  
}
