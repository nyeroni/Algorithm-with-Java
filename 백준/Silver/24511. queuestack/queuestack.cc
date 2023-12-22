#include<iostream>
#include<algorithm>
#include "deque"
#include "vector"
using namespace  std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

   int N, M;
   deque<int> dq;
   vector<bool>v;

   cin>>N;
   for(int i=0; i<N; i++){
       int num;cin>>num;
       v.push_back(num);
   }
    for(int i=0; i<N; i++){
        int num; cin>>num;
        if(v.at(i)) continue;
        dq.push_front(num);
    }
    cin>>M;
    for(int i=0; i<M; i++){
        int num; cin>>num;
        dq.push_back(num);
        cout<<dq.front()<<' ';
        dq.pop_front();
    }


   return 0;
}
