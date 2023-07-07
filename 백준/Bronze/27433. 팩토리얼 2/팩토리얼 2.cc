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

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    long long int result=1;
    cin>>N;
    if(N==0){
        cout<<1<<'\n';
        return 0;
    }
    for(int i=1; i<=N; i++){
        result*=i;
    }
    cout<<result<<'\n';

    return 0;
}