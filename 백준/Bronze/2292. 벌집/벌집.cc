#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int N,a=1, i=1;
    cin>>N;
    if(N==1)cout<<"1"<<endl;
    else{
        //2~7(6*1), 8~19(12=6*2)
        while(true){
            a+=6*i;
            if(a>=N){
                cout<<i+1<<endl;
                break;
            }
            i++;
        }
    }
    return 0;
}