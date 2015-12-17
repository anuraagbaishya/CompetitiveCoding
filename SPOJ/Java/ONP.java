import java.util.Stack;
import java.util.Scanner;
class postfix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0,n;
        n=sc.nextInt();
        String s;
        int i;
        for(int ii=0;ii<n;ii++)
        {
            s=sc.next();
            Stack<Character> stack=new Stack<>();
            stack.push(new Character('('));
            i=1;
            while(!stack.empty())
            {
                if(s.charAt(i)=='(')
                    stack.push(new Character('('));
                else if(s.charAt(i)==')')
                {
                    while(stack.peek().charValue()!='(')
                    {
                        System.out.print(stack.peek());
                        stack.pop();
                        
                    }
                    stack.pop();
                    
                }
                else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='^')
                {
                    stack.push(new Character(s.charAt(i)));
                    
                }
                else
                {
                    System.out.print(s.charAt(i));
                }
                i++;
            }
            System.out.println();
        }
    }   
}
