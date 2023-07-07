#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int sosoo(int N){
    int c=0;
    for(int i=1; i<N; i++){
        if(N%i==0){
            c++;
        }
    }
    if(c==1) return 1;
    else return 0;
}
int main()
{
    int M,N,cnt=-1,total=0;
    int arr[10000];
    cin>>M>>N;
    for(int i=M; i<=N; i++){
        if(sosoo(i)==1){
            cnt++;
            arr[cnt]=i;
            total+=i;
        }
    }
    if(cnt==-1){
        cout<<"-1"<<endl;
    }
    else{
        cout<<total<<'\n'<<arr[0]<<endl;
    }
    return 0;
}
