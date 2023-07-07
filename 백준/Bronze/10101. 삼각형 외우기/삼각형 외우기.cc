#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int x[3], total=0;
    for(int i=0; i<3; i++){
        cin>>x[i];
        total+=x[i];
    }
    if(total==180){
        if(x[0]==x[1]&&x[0]==x[2]){
            cout<<"Equilateral"<<endl;
        }
        else if(x[0]==x[1]&&x[0]!=x[2]){
            cout<<"Isosceles"<<endl;
        }
        else if(x[0]==x[2]&&x[1]!=x[2]){
            cout<<"Isosceles"<<endl;
        }
        else if(x[1]==x[2]&&x[0]!=x[2]){
            cout<<"Isosceles"<<endl;
        }
        else if(x[0]!=x[1]&& x[1]!=x[2]&&x[0]!=x[2]){
            cout<<"Scalene"<<endl;
        }
    }
    else{
        cout<<"Error"<<endl;
    }
    return 0;
}
