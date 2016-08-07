import java.util.*;
class NINJA4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			Double n = sc.nextDouble();
			Double a, b;
			a = Math.ceil(n/2);
			if(a % 2 == 0)
				a = -a;
			if((Math.ceil((n-1)/2))%2==0)
				b = -Math.ceil((n-1)/2);
			else
				b = Math.ceil((n-1)/2)+1;
			System.out.println(a.intValue()+" "+b.intValue());
			
		}
	}
}	