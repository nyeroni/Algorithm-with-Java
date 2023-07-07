#include<iostream>
#include<string>
#include<cmath>
using namespace std;

void money(int M){
    int q, d, n, p;
    q=M/25;
    M=M-q*25;
    d=M/10;
    M=M-d*10;
    n=M/5;
    M=M-n*5;
    p=M/1;
    cout<<q<<" "<<d<<" "<<n<<" "<<p<<endl;
}
int main()
{
    int T;
    cin>>T;
    int *C=(int*)malloc(sizeof(int)*T);
    if(C==NULL)cout<<"no memory"<<endl;
    for(int i=0; i<T; i++){
        cin>>C[i];
    }
    for(int i=0; i<T; i++){
        money(C[i]);
    }
    return 0;
}