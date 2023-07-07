#include<iostream>
#include<cstring>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
#include <stack>
#include<queue>
#include<deque>

using namespace std;
int cnt1=0,cnt2=0;
int f[40];
int fib(int n){
    if(n==1 || n==2){
        cnt1++;
        return 1;
    }
    else{
        return fib(n-1)+fib(n-2);
    }
}
int fiboancci(int n){
    f[1]=1,f[2]=1;
    for(int i=3; i<=n; i++){
        cnt2++;
        f[i]=f[i-1]+f[i-2];
    }
    return f[n];
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin>>n;
    fib(n);
    fiboancci(n);
    cout<<cnt1<<" "<<cnt2;


    return 0;
}