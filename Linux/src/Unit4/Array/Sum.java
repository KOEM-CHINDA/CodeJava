
package Unit4.Array;

public class Sum {
  public static void main(String[] args) {
    int sum = 0;
//    for(int i=1; i<=2; i++){
//      sum+=Math.pow(i, 3);
//    }
  int subSum=1;
  int count = 0;
    for(int i=1; i<=2; i++){
      for(int j=1; j<=2; j++){
        subSum *=i;
        count++;
        if(count==3){
          sum+=subSum;
          subSum=0;
          i--;
        }
      }
    }
    System.out.println(sum);
  }
}
