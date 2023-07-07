#include<iostream>
using namespace std;
int main()
{
    int N,M,i,j,k;
    int arr[100]={0,};
    cin>>N>>M;
    for(int t=0; t<M; t++){
        cin>>i>>j>>k;
        for(int l=i-1; l<j; l++){
            arr[l]=k;
        }
    }
    for(int t=0; t<N; t++){
        cout<<arr[t]<<" ";
    }
    return 0;
}