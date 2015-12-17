#include<fstream>
#include<iostream>
using namespace std;
void max_heapify(int *a, int i, int n)
{
    int j, temp;
    temp = a[i];
    j = 2*i;
    while (j <= n)
    {
        if (j < n && a[j+1] > a[j])
            j = j+1;
        if (temp > a[j])
            break;
        else if (temp <= a[j])
        {
            a[j/2] = a[j];
            j = 2*j;
        }
    }
    a[j/2] = temp;
    return;
}
void heapsort(int *a, int n)
{
    int i, temp;
    for(i = n/2; i >= 1; i--)
    {
        max_heapify(a, i, n);
    }
    for (i = n; i >= 2; i--)
    {
        temp = a[i];
        a[i] = a[1];
        a[1] = temp;
        max_heapify(a, 1, i - 1);
    }
}
int main()
{
    int arr[101];
    int n,k,t,j;
    cin>>t;
    {
        for(int i=0;i<t;i++)
        {
            cin>>n;
            for(j=1;j<=n;j++)
                cin>>arr[j];
            cin>>k;
            int x=arr[k];
            heapsort(arr,n);
            for(j=1;j<=n;j++)
            {
                if(arr[j]==x)
                    cout<<j<<endl;
            }
        }
    }
}
