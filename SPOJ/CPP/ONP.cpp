#include<iostream>
#include<ctype.h>
#include<stdio.h>
using namespace std;
class Stack
{
	int top;
	char arr[400];
	public:
		Stack()
		{
			top=-1;
		}
		void push(char ch)
		{
				arr[++top]=ch;
		}
		char pop()
		{
			char ch;;
			ch=arr[top--];
			return ch;
		}
		char stktop()
		{
            return arr[top];
		}
		bool isEmpty()
		{
            if(top==-1)
                return true;
            else return false;
		}
};
int main()
{
    int n,j;
    char infix[400];
    cin>>n;
    char c;
    for(int i=0;i<n;i++)
    {
        j=1;
        scanf("%s",infix);
        Stack stack;
        stack.push('(');
        while(!stack.isEmpty())
            {
                if(isalpha(infix[j]))
                {
                    cout<<(infix[j]);
                }
                else if(infix[j]==')')
                {
                    while(stack.stktop()!='(')
                    {
                        cout<<stack.pop();

                    }
                    stack.pop();

                }
                else
                {
                    stack.push(infix[j]);

                }
                j++;
            }
        }
    return 0;
}
