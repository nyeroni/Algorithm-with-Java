#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int N,cnt=1;
    cin>>N;
    //9 25 81 => 3(2) 5(4) 9
    for(int i=1; i<=N; i++){
        cnt*=2;
    }
    cnt++;
    cout<<cnt*cnt<<endl;
    return 0;
}