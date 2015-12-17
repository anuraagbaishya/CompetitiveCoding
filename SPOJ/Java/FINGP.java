import java.util.*;
class FINGP{
	public static void main(String[] args){
		ArrayList<String> arr=new ArrayList<>();
		ArrayList<String> fingp=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String pttrn=sc.nextLine();
		String str=new String();
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			str=sc.nextLine();
			arr.add(str);
		}
		for(int i=0;i<=n;i++)
		{
			if(arr.get(i).endsWith(pttrn))
			{
				fingp.add(arr.get(i));
			}
		}
		if(fingp.size()!=0)
		{
			System.out.println(fingp.size());
			String s[]=new String[fingp.size()];
			fingp.toArray(s);
			Arrays.sort(s);
			for(int i=0;i<s.length;i++)
				System.out.println(s[i]);
		}
		else
			System.out.println("Wrong fingerprints!");

	}
}
