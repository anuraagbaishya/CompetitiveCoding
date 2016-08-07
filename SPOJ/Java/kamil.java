import java.util.*;
class kamil{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		Double res = Math.pow(line.length()-line.replaceAll("[TDLF]","").length(),2);
		System.out.println(res.intValue());
	}
}