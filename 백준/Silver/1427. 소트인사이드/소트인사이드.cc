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
    int N;
    cin>>N;
    int n=N,cnt=0;
    while(n>0){
        n/=10;
        cnt++;
    }
    int *arr=(int*)malloc(sizeof(int)*cnt);
    n=N;
    int i=0;
    while(n>0){
        arr[i]=n%10;
        n/=10;
        i++;
    }
    sort(arr, arr+cnt,cmp);
    for(int j=0; j<i; j++){
        cout<<arr[j];
    }
    return 0;
}

