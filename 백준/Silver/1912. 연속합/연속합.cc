#include<iostream>
#include "algorithm"
using namespace  std;
#define MAX 100001
int series[MAX], dp[MAX]={0,};

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, i;
    
    cin>>n;
    
    for(i=0; i<n; i++) {
        
        cin>>series[i];
        dp[i]=series[i];
        
    }
    
    int maxSum=dp[0];
    
    for(i=1; i<n; i++) {
        
        dp[i]=max(dp[i], dp[i-1]+series[i]);
        
        if(dp[i]>maxSum) {
            
            maxSum=dp[i];
            
        }
    }
    
    cout<<maxSum<<endl;
    
    return 0;
}
