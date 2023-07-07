#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int x[3],y[3],k,l;
    for(int i=0; i<3; i++){
        cin>>x[i]>>y[i];
    }
    int tmp=0;
    if(x[0]==x[1]){
        k=x[2];
    }
    else{
        if(x[1]==x[2]){
            k=x[0];
        }
        else{
            k=x[1];
        }
    }
    if(y[0]==y[1]){
        l=y[2];
    }
    else{
        if(y[1]==y[2]){
            l=y[0];
        }
        else{
            l=y[1];
        }
    }
    cout<<k<<" "<<l<<endl;
    return 0;
}
