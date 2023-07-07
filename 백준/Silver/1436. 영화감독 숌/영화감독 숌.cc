#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;

int main()
{

    int N;
    cin>>N;
    int tmp=0,cnt=0, num=666;
    while(true){
        tmp=num;
        while(tmp>=666){
            if(tmp%1000==666){
                cnt++;
                break;
            }
            tmp/=10;
        }
        if(N==cnt)break;
        else num++;
    }
    cout<<num;
    return 0;
}

