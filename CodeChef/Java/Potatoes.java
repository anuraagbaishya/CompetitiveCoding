import java.util.*;
class Potatoes{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0; i < t; i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum = x+y+1;
      while(!isPrime(sum)){
        sum++;
      }
      System.out.println(sum-(x+y));
    }
  }
  public static boolean isPrime(int n){
    for(int i = 2; i <= Math.sqrt(n); i++)
      if(n % i == 0)
        return false;
      else
        continue;
    return true;
  }
}
