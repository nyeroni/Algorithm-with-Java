#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;

bool cmp(int a, int b){
    return a>b;
}
int main()
{
    int N, k,arr[1000];
    cin>>N>>k;
    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    sort(arr, arr+N,cmp);
    cout<<arr[k-1]<<endl;
    return 0;
}

