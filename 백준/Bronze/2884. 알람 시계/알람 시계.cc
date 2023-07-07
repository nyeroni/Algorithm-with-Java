#include<iostream>
using namespace std;
int main()
{
    int H,M;
    cin>>H>>M;
    if(M>=45){
        M-=45;
    }
    else{
        M=M+60-45;
        if(H>0)H-=1;
        else H=23;
    }
    cout<<H<<" "<<M<<endl;
    return 0;

}