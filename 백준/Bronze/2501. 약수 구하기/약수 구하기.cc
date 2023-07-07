#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int factor(int a, int b){
    if(b%a==0) return 1;
    else return 0;
}
int main()
{
    int N, K;
    int *arr;
    cin>>N>>K;
    arr=(int*)malloc(sizeof(int)*N);
    if(arr==NULL){
        cout<<"No memory"<<endl;
        return 0;
    }
    int cnt=0;
    for(int i=1; i<=N; i++){
        if(factor(i,N)==1){
            arr[cnt]=i;
            cnt++;
        }
    }
    cout<<arr[K-1]<<endl;
    return 0;
}