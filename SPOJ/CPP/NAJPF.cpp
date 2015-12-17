#include<iostream>
#include<string>
#include<vector>
using namespace std;
// returns count of non-overlapping occurrences of 'sub' in 'str'
void countSubstring(const string& str, const string& sub)
{

    vector<int> posc;
    if (sub.length() == 0) return 0;
    int count = 0;
    for (size_t offset = str.find(sub);
    offset != string::npos;
    offset = str.find(sub, offset + sub.length()))
    {
        posc.push_back(offset);
        ++count;
    }
    cout<<count;
    for (vector<int>::iterator it = posc.begin(); it != posc.end(); ++it)
        cout<<' '<<*it;
    cout<<"\n";

}
int main()
{
    int n,count;
    string str1,str2;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>str1>>str2;
        countSubstring(str1,str2);
    }
}
