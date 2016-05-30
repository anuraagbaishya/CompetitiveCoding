import java.util.*;
class SMPCPH1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Character> chr = new ArrayList<>();
		int size = sc.nextInt();
		String str = sc.next();
		for(int i = 0; i < size; i++)
			chr.add(str.charAt(i));
		int m = sc.nextInt();
		String ostr = sc.nextLine();
		for(int i = 0; i < m; i++){

			ostr = sc.nextLine();
			String nstr = "";
			for(int j = 0; j < ostr.length(); j++){

				if(chr.contains(ostr.charAt(j)) && (chr.indexOf(ostr.charAt(j)) == chr.size()-1))
					nstr += chr.get(0);
				else if(chr.contains(ostr.charAt(j)))
					nstr += chr.get(chr.indexOf(ostr.charAt(j))+1);
				else
					nstr += ostr.charAt(j);
			}
			System.out.println(nstr);
		}
	}
}