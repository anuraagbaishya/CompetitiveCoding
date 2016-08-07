import java.util.*;
class PLNDROME{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int n = sc.nextInt();
			String str = sc.next();
			int m = sc.nextInt();
			System.out.println("Case "+(i+1)+":");
			for(int j = 0; j < m; j++){
				int x = sc.nextInt();
				char ch = sc.next().charAt(0);
				StringBuilder sb = new StringBuilder(str);
				sb.setCharAt(x-1, ch);
				str = sb.toString();
				if(str.equals(sb.reverse().toString()))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
