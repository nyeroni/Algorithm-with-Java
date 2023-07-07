#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int x,y,w,h;
    int X,Y;
    cin>>x>>y>>w>>h;
    if(x<w){
        if(w-x>x){
            X=x;
        }
        else{
            X=w-x;
        }
    }
    else{
        if(x-w>x){
            X=x;
        }
        else{
            X=x-w;
        }
    }
    if(y<h){
        if(h-y>y){
            Y=y;
        }
        else{
            Y=h-y;
        }
    }
    else{
        if(y-h>y){
            Y=y;
        }
        else{
            Y=y-h;
        }
    }
    if(X<Y)cout<<X<<endl;
    else cout<<Y<<endl;
    return 0;
}
