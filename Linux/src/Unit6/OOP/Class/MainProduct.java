
package Unit6.OOP.Class;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class MainProduct {
  public static int menu(){
    Scanner cin = new Scanner(System.in);
    int index;
    System.out.println("1.Add Product.");
    System.out.println("2.Show Product.");
    System.out.println("3.Search Product.");
    System.out.println("4.Update Product.");
    System.out.println("5.Sort Product.");
    System.out.println("6.Remove Product.");
    System.out.println("7.Input Again.");
    System.out.println("8.Exit.");
    do {      
      System.out.print("Enter Option: ");
      index = cin.nextInt();
    } while (!(index>=1 && index<=8));
    return index;
  }
  public static void addProduct(List<Product> ls){
    Scanner cin = new Scanner(System.in);
    System.out.print("Please add size for store data: ");
    int add = cin.nextInt();
    Again:for(int i=0; i<add; i++){
      Product pro = new Product();
      pro.input();
      ls.add(pro);
      for(int j=0; j<i; i++)
        if(ls.get(i).getId() == ls.get(j).getId()){
          ls.remove(i);
          i--;
          continue Again;
        }
    }
  }
  public static void showProduct(List<Product> ls){
//    ls.forEach(temp -> {
//      System.out.println(temp);
//    });
    for(Product temp:ls)
      System.out.println(temp);
  }
  public static void searchProduct(List<Product> ls){
    Scanner cin = new Scanner(System.in);
    int id,b=0;
    System.out.print("Enter ID: ");
    id = cin.nextInt();
    for(int i=0; i<ls.size(); i++)
      if(id == ls.get(i).getId()){
        System.out.println(ls.get(i));
        b++;
        break;
      }
    if(b==0)
      System.out.println("ID not found!!.");
  }
  public static void upDateProduct(List<Product> ls){
    Scanner cin = new Scanner(System.in);
    Product pro = new Product();
    int id,b=0;
    System.out.print("Enter ID: ");
    id = cin.nextInt();
    for(int i=0; i<ls.size(); i++)
      if(id==ls.get(i).getId()){
        System.out.println(ls.get(i));
        pro.input();
        ls.set(i, pro);
      }
  }
  public static void sortProduct(List<Product> ls){
    Collections.sort(ls,new Comparator<Product>(){
      public int compare(Product pro1,Product pro2){
        return Integer.valueOf(pro1.getId()).compareTo(pro2.getId());
      }
    });
    System.out.println("Sorted!!!");
  }
  public static void removeProduct(List<Product> ls){
    Scanner cin = new Scanner(System.in);
    System.out.print("Search ID: ");
    int id = cin.nextInt();
    for(int i=0; i<ls.size(); i++){
      if(id == ls.get(i).getId())
        ls.remove(i);
    }
    System.out.println("Removed!!");
  }
  public static void main(String []agrs) {
    Scanner cin = new Scanner(System.in);
    List<Product> ls = new ArrayList<>();
    Menu:do{
      System.out.print("Enter Size for store Data: ");
      int n = cin.nextInt();
      Again:for(int i=0; i<n; i++){
        Product pro = new Product();
        pro.input();
        ls.add(pro);
        for(int j=0; j<i; j++)
          if(ls.get(i).getId()== ls.get(j).getId()){
            ls.remove(i);
            i--;
            continue Again;
          }
      }
      do{
        int op = menu();
        switch(op){
          case 1 -> addProduct(ls);
          case 2 -> showProduct(ls);
          case 3 -> searchProduct(ls);
          case 4 -> upDateProduct(ls);
          case 5 -> sortProduct(ls);
          case 6 -> removeProduct(ls);
          case 7 -> {
            continue Menu;
          }
          case 8 -> System.exit(0);
        }
      }while(true);
    }while(true);
  }
}
