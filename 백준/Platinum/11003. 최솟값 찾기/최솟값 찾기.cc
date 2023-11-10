#include<iostream>
#include<deque>
#include<algorithm>
using namespace  std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N,L;
    cin>>N>>L;
    deque<pair<int, int>> dq;

    for(int i=0; i<N; i++){
        int tmp; cin>>tmp;
        if(!dq.empty()&&i-L == dq.front().first){
            dq.pop_front();
        }
        while(!dq.empty()&&tmp<dq.back().second){
            dq.pop_back();
        }
        dq.push_back(make_pair(i, tmp));
        cout<<dq.front().second<<" ";
    }

    return 0;
}
