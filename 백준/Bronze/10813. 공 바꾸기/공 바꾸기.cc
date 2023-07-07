#include<iostream>
using namespace std;
int main()
{
    int N, M,i,j;
    cin>>N>>M;
    int *arr=(int*)malloc(sizeof(int)*(N+1));
    if(arr==NULL)cout<<"No memory!";
    for(int t=1; t<=N; t++){
        arr[t]=t;
    }
    for(int t=1; t<=M; t++){
        cin>>i>>j;
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    for(int t=1; t<=N; t++){
        cout<<arr[t]<<" ";
    }
    return 0;
}