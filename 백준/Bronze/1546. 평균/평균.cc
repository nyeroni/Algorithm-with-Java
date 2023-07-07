#include<iostream>
using namespace std;
void swap(int&a,int&b){
    int tmp=a;
    a=b;
    b=tmp;
}
int main()
{
    int N, max=0;
    float total=0;
    float g[1000];
    cin>>N;
    for(int i=0; i<N; i++){
        cin>>g[i];
        if(g[i]>max){
            max=g[i];
        }
    }
    for(int i=0; i<N; i++){
        g[i]=g[i]/max*100;
        total+=g[i];
    }
    float avg=0.0;
    avg=total/static_cast<float>(N);
    cout<<avg;

    return 0;
}