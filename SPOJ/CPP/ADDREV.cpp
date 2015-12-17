#include<iostream>
#include<stdio.h>
using namespace std;
int revno(int);
int main(){
    int i,sum,m,n;
    cin>>i;
    for(int j=0;j<i;j++)
    {
        cin>>m>>n;
        sum=revno(m)+revno(n);
        cout<<revno(sum)<<endl;
    }
}
int revno(int i){
int n=0;
while(i!=0)
    {
        n=(n*10)+i%10;
        i/=10;
    }
    return n;
}
