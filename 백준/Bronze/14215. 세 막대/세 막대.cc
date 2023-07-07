#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int x,y,z,max=0,l=0;
    cin>>x>>y>>z;
    if(x>y&&x>z){
        max=x;
        l=y+z;
    }
    else if(y>x&&y>z){
        max=y;
        l=x+z;
    }
    else {
        max=z;
        l=x+y;
    }
    int total=0;
    if(l>max){
        total=x+y+z;
    }
    else {
        max=max-(max-l+1);
        total=l+max;
    }
    cout<<total<<endl;
    return 0;
}

