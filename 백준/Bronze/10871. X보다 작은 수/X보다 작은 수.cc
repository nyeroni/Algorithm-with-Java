#include<iostream>
using namespace std;
int main()
{
    int N, X;
    int *A;
    cin>>N>>X;
    A=(int*)malloc(sizeof(int)*N);
    if(A==NULL){
        cout<<"No memory\n";
    }
    for(int i=0; i<N; i++){
        cin>>A[i];
    }
    for(int i=0; i<N; i++){
        if(A[i]<X){
            cout<<A[i]<<" ";
        }
    }
    free(A);
    return 0;
}