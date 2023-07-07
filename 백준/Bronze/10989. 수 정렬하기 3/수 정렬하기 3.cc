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
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int arr[10001]={0};
    int N,max=-1;
    cin>>N;
    for(int i=0; i<N; i++){
        int x;
        cin>>x;
        arr[x-1]++;
        if(x>max)max=x;
    }
    for(int i=0; i<=max;){
        if(arr[i]!=0){
            cout<<i+1<<"\n";
            arr[i]--;
        }
        else i++;
    }
    return 0;
}

