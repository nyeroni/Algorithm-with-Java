#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int x,y,z,total=0;
    while(true){
        int max=0;
        total=0;
        cin>>x>>y>>z;
        if(x==0&&y==0&&z==0)break;
        total=x+y+z;
        if(x>y&&x>z){
            max=x;
        }
        else if(y>x&&y>z)max=y;
        else max=z;
        if(max<total-max){
            if(x==y&&y==z){
                cout<<"Equilateral\n";
            }
            else if((x==y&&x!=z)||(x==z&&y!=z)||(y==z&&x!=z)){
                cout<<"Isosceles\n";
            }
            else if(x!=y&&y!=z&&x!=z)cout<<"Scalene\n";
        }
        else cout<<"Invalid\n";

    }
    return 0;
}
