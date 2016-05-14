import java.util.*;
class GOO{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			long count = new Double(Math.pow(2, m-1)).longValue();
			long ones = count + (m-1)*(count/2);
			System.out.println(count+" "+ones);
		}
	}
}