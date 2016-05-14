import java.util.*;
/**
 *
 * @author student
 */
public class NAJD {
    public static void main(String args[]){
        
        String str=new String();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++){
            ArrayList<String> arr=new ArrayList<String>();
            int m=sc.nextInt();
        for(int j=0;j<=m;j++){
            str=sc.nextLine();
            String words[] = str.split("\\s+");
            for(int i=0;i<words.length;i++)
            {    
                words[i] = words[i].replaceAll("[^\\w]", "");
                arr.add(words[i]);
            }    
        }
        Set<String> s = new LinkedHashSet<>(arr);
        String str1[]=new String[s.size()];
        s.toArray(str1);
        Arrays.sort(str1);
    }
        for(int i=0;i<str1.length;i++)
        {
            System.out.println(str1[i]);
        }
    }
}
