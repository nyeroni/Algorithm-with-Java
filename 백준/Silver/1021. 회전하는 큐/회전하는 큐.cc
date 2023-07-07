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

    int N,M,count=0;
    cin>>N>>M;
    deque<int>d;
    for(int i=0; i<N; i++){
        d.push_back(i+1);
    }
    for(int i=0; i<M; i++){
        int x;
        cin>>x;
        int cnt=1;
        for(auto num:d){
            if(x==num){
                break;
            }
            cnt++;
        }
        int left=cnt-1;
        int right=d.size()-cnt+1;
        if(left<right){
            while(true){
                if(d.front()==x){
                    d.pop_front();
                    break;
                }
                d.push_back(d.front());
                d.pop_front();
                count++;
            }
        }
        else{
           while(true){
               if(d.front()==x){
                   d.pop_front();
                   break;
               }
               d.push_front(d.back());
               d.pop_back();
               count++;
           }
        }
    }
    cout<<count<<'\n';

    return 0;
}