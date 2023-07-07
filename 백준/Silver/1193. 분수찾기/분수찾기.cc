#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int x;
    cin>>x;
    int r=1; //수열의 줄
    //1~r-1의 합<x<=1~r의 합

    while(true){
        if(r*(r+1)/2>=x)break;
        r++;
    }
    //분모 분자의 합이 r(줄)+1임
    //홀수 줄은 분자가 r에서 1로 줄어들고 분모는 1에서 r로 늘어남
    //짝수는 그 반대
    int a = (r-1)*r/2;
    int i = x-a;
    int j = r+1-i;
    if(r%2!=0){
        cout<<j<<"/"<<i<<endl;
    }
    else{
        cout<<i<<"/"<<j<<endl;
    }
    return 0;
}