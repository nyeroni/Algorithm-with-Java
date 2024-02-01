#include<iostream>
#include "algorithm"
using namespace  std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    long long int dp[100] = {1,1,1,2,2};
    int T,N;

    cin>>T;
    for(int i=5;i<100;i++)
        dp[i] = dp[i-1] + dp[i-5];

    while(T--){
        cin>>N;

        cout<<dp[N-1]<<'\n';
    }

    return 0;
}
