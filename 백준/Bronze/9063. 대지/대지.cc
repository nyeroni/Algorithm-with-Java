#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int N,x[100000],y[100000],min_x=10000, min_y=10000,max_x=-10000,max_y=-10000;
    cin>>N;
    for(int i=0; i<N; i++){
        cin>>x[i]>>y[i];
        if(x[i]<min_x){
            min_x=x[i];
        }
        if(y[i]<min_y){
            min_y=y[i];
        }
        if(x[i]>max_x){
            max_x=x[i];
        }
        if(y[i]>max_y){
            max_y=y[i];
        }
    }
    int S = (max_x-min_x) * (max_y-min_y);
    cout<<S<<endl;
    return 0;
}
