import java.util.*;
public class fortytwo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer num;
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<1000;i++){
			num=sc.nextInt();
			if(num==42)
				break;
			else
				arr.add(num);
		}
		for(int i=0;i<arr.size();i++){
				System.out.println(arr.get(i));
		}
	}
}