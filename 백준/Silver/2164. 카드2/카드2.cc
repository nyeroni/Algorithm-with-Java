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

    int N;
    cin>>N;
    queue<int>q;
    if(N==1){
        cout<<"1\n";
        return 0;
    }
    for(int i=1; i<=N; i++){
        q.push(i);
    }
    while(true){
        if(q.front()==q.back())break;
        q.pop();

        int k=q.front();
        q.push(k);
        q.pop();
    }
    cout<<q.front()<<'\n';
    return 0;
}