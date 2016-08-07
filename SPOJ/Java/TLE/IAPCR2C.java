import java.util.*;
class IAPCR2C{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();  
			ArrayList<Integer> num = new ArrayList<>();
			for(int j = 0; j < m; j++){
				arr.add(sc.nextInt());
			}
			for(int j = 0; j < arr.size(); j++){
				int x = arr.get(j);
				if(x <= n){
					if(x!=1 && !num.contains(x-1))
						num.add(x-1);
					if((x+1 <= n) && !num.contains(x+1))
						num.add(x+1);
					if(!num.contains(x))
						num.add(x);
				}				
			}
			System.out.println("Case "+ (i+1)+": "+num.size());
		}
	}
}