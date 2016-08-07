#include <iostream>
using namespace std;
long long gcd(long long, long long);
int main(){
	int t;
	long long n,a,b;
	cin>>t;
	for(int j = 0; j < t; j++){
	cin>>n>>a>>b;
		for(long long i = 0; i<gcd(a,b); i++)
			cout<<n;
		cout<<endl;
	}
	return 0;
	
	
}
long long gcd(long long a, long long b){

	long long rem;
	if(b == a)
	{
		return a;
	}
	if(b > a)
	{
		long long temp = a;
		a = b;
		b = temp;
	}
	while(true)
	{
		rem = a%b;
		if(rem == 0)
			break;
		a = b;
		b = rem;
	}
		return b;

}