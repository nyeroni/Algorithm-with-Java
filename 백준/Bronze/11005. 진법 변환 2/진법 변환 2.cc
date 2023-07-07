#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
    int N,B,i=0;
    char tmp[37];
    cin>>N>>B;

    while(N!=0){
        if(N%B>=0&&N%B<=9){
            tmp[i]=N%B+'0';
        }
        else if(N%B>=10&&N%B<=35){
            tmp[i]=N%B+55;
        }
        N=N/B;
        i++;

    }

    for(int j=i-1; j>=0; j--){
        cout<<tmp[j];
    }
    cout<<endl;
    return 0;
}