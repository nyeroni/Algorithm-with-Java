#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{

    int N;
    cin>>N;
    int i=2;
    while(true){
        if(N%i==0){
            N/=i;
            cout<<i<<'\n';
        }
        else if(N==1)break;
        else{
            i++;
        }
    }
    return 0;
}
