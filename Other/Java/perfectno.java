import java.util.Scanner;
public class perfectno{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 1;
		int sum = 0;
		for(;;){
			input = sc.nextInt();
			if(input == 0)
				break;
			for(int i = 1; i < input; i++){
				if(input % i == 0)
					sum = sum + i;
			}
			if(sum == input)
				System.out.println("true");
			else
				System.out.println("false");
			sum = 0;
		}
	}
}