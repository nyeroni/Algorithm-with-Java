#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int a1, a0 , c, n0;
    cin>>a1>>a0;
    cin>>c;
    cin>>n0;
    //기울기로 접근
    int f_n=a1*n0+a0;
    if(f_n<=c*n0 && c>=a1)cout<<"1"<<endl;
    else cout<<"0"<<endl;
    return 0;
}

