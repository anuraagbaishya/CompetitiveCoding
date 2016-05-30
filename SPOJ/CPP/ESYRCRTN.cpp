#include <iostream>
using namespace std;
long long f(long long);

int main()
{
	int m;
	cin>>m;
	for(int j = 0; j < m; j++)
	{
		int n;
		cin>>n;
		switch(n%6)
		{
			case 0:
				cout<<0<<endl;
				break;
			case 1:
				cout<<1<<endl;
				break;
			case 2:
				cout<<4<<endl;
				break;
			case 3:
				cout<<6<<endl;
				break;
			case 4:
				cout<<5<<endl;
				break;
			case 5:
				cout<<2<<endl;
				break;
		}
	}
}

