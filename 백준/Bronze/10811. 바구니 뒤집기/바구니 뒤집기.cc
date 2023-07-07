#include<iostream>
using namespace std;
void swap(int&a,int&b){
    int tmp=a;
    a=b;
    b=tmp;
}
int main()
{
    int N, M,i,j;
    cin>>N>>M;
    int arr[N+1];
    for(int t=1; t<=N; t++){
        arr[t]=t;
    }
    for(int t=1; t<=M; t++){
        cin>>i>>j;
        for(int k=0; k<(j-i)/2+1; k++){//0, 1
            swap(arr[k+i], arr[(j-i)-k+i]);//
        }
    }
    for(int t=1; t<=N; t++){
        cout<<arr[t]<<" ";
    }
    return 0;
}