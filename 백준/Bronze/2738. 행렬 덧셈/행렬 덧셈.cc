#include<iostream>
#include<string>
using namespace std;

int main()
{
    int N, M;
    int **A, **B;

    cin>>N>>M;
    A=(int**)malloc(sizeof(int*)*N);
    if(A==NULL)cout<<"no memory!"<<endl;
    for(int i=0; i<N; i++){
        A[i]=(int*)malloc(sizeof(int)*M);
        if(A[i]==NULL)cout<<"no memory!"<<endl;
    }
    B=(int**)malloc(sizeof(int*)*N);
    if(B==NULL)cout<<"no memory!"<<endl;
    for(int i=0; i<N; i++){
        B[i]=(int*)malloc(sizeof(int)*M);
        if(B[i]==NULL)cout<<"no memory!"<<endl;
    }
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            cin>>A[i][j];
        }
    }
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            cin>>B[i][j];
        }
    }
    int **C;
    C=(int**)malloc(sizeof(int*)*N);
    if(C==NULL)cout<<"no memory!"<<endl;
    for(int i=0; i<N; i++){
        C[i]=(int*)malloc(sizeof(int)*M);
        if(C[i]==NULL)cout<<"no memory!"<<endl;
    }
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            cout<<A[i][j]+B[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}