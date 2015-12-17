#include <iostream>
using namespace std;
int main()
{
  long n[1000],m[1000],i=0;
  do{
    cin>>n[i]>>m[i];
    i++;
  }while(n[i-1]!=0||m[i-1]!=0);
  for(long j=0;j<i-1;j++)
  {
    long x=n[j];long y=m[j];
    long count=0,count2=0;
    if(y==0)
    {
      if(j!=0)
        cout<<"\n";
      cout<<"No carry operation.";
      continue;
    }
    while(x!=0||y!=0)
    {
      if(count2+x%10+y%10>9)
      {
        count++;
        count2=1;
      }
      else
      {
        count2=0;
      }
      x/=10;
      y/=10;
    }
    if(j!=0)
        cout<<endl;
    if(count==0)
        cout<<"No carry operation.";
    else if(count==1)
        cout<<"1 carry operation.";
    else
        cout<<count<<" carry operations.";
  }
}
