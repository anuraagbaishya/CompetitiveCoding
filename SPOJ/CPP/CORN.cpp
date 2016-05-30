/* strtok example */
#include <stdio.h>
#include <string.h>
#include <iostream> 
#include <string>
#include <vector>
#include <math.h>
using namespace std;
int main ()
{
  	int t;
  	cin>>t;
  	while(t > 0)
  	{
	  char str[15];
	  cin>>str;
	  char * splt;
	  splt = strtok (str,"e");
	  int i = 0;
	  vector<string> num;
	  while (splt != NULL)
	  {
	    num.push_back(string(splt));
	    splt = strtok (NULL, "e");
	  }
	  int idx = 0;
	  double nums[3];
	  for(vector<string>::const_iterator i = num.begin(); i != num.end(); i++)
	  {
	  	nums[idx] = stod(*i);
	  	idx++;
	  }
	  cout<<ceil((3.1415*nums[0]*sqrt((nums[0]*nums[0])+(nums[2]*nums[2]))*nums[1]))<<endl;
	  t--;
	}
  return 0;
}