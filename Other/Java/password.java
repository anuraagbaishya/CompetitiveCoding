import java.util.Scanner;
public class password{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		boolean length, uppercase, number;
		length = uppercase = number = false;
		if(pass.length() >= 8)
			length = true;
		for(int i = 0; i<pass.length();i++){
			if(pass.charAt(i)>=65 && pass.charAt(i)<=97)
				uppercase = true;
			if(Character.isDigit(pass.charAt(i)))
				number = true;
		}
		if(length && uppercase && number)
			System.out.println("Strong");
		else if(length || uppercase || number)
			System.out.println("Good");
		else
			System.out.println("Weak");
	}
}