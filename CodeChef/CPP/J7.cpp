#include <iostream>
#include <math.h>
#include <stdio.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	int s,p;
	for(int i=0;i<t;i++)
	{
		cin>>p>>s;
        float l=(float)(p-sqrt(p*p-24*s))/12;
        float h=(float)(p/4-2*l);
        printf("%.2f\n",l*l*h);
    }
	return 0;
}
