import java.util.*;
class Onoz{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int x = 0; x < n; x++){
      int hours = sc.nextInt();
      int mins = sc.nextInt();
      int count = 0, flag = 0;
      for(int i = 0; i < hours; i++){
        for(int j = 0; j < mins; j++){
          String time = Integer.toString(i) + Integer.toString(j);
          for(int k = 0; k < time.length()-1; k++)
            if(time.charAt(k)!=time.charAt(k+1)){
              flag = 1;
              break;
            }
            if(flag == 0)
              count++;
            flag = 0;
        }
      }
      System.out.println(count);
    }
  }
}
