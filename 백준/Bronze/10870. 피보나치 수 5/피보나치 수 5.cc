#include<iostream>
#include<string>
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
int fibo(int N){
    if(N==0)return 0;
    else if(N==1)return 1;
    else return fibo(N-1)+fibo(N-2);
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;
    cout<<fibo(N);
    return 0;
}