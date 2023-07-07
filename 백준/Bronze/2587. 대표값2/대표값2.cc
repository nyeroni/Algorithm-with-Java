#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;

int main()
{
    int arr[5],total=0;
    for(int i=0; i<5; i++){
        cin>>arr[i];
        total+=arr[i];
    }
    sort(arr, arr+5);
    cout<<total/5<<endl;
    cout<<arr[2];
    return 0;
}

