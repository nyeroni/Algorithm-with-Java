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
using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N,K;
    cin>>N>>K;
    queue <int>q;
    for(int i=1; i<=N; i++){
        q.push(i);
    }
    cout<<"<";
    int cnt=1;
    while(true){
        if(q.empty())break;
        if(cnt%K==0){
            int a=q.front();
            q.pop();
            if(q.empty())cout<<a<<">\n";
            else cout<<a<<", ";
        }
        else{
            int a=q.front();
            q.push(a);
            q.pop();
        }
        cnt++;
    }
    return 0;
}