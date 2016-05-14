import java.util.*;
class Laddu{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rec = 0;
		for(int i = 0; i < n; i++){
			int pts = 0;
			rec = sc.nextInt();
			String country = sc.next();
			int m = 0;
			for(int j = 0; j < rec; j++){
				String res = sc.next();
				if(res.equals("CONTEST_WON")){
					m = sc.nextInt();
					if(m <= 20)
						pts += 300 + (20 - m);
					else
						pts += 300;
				}
				
				else if(res.equals("BUG_FOUND")){
					m = sc.nextInt();
					pts += m;
				}

				else if(res.equals("TOP_CONTRIBUTOR"))
					pts += 300;

				else if(res.equals("CONTEST_HOSTED"))
					pts += 50;
			}
			int count = 0;
			if (country.equals("INDIAN")){
				while(pts >= 200){
					count ++;
					pts -= 200;
				}
			}
			else{
				while(pts >= 400){
					pts -= 400;
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}