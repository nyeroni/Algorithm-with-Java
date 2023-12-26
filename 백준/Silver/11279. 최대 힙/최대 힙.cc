#include<iostream>
#include "algorithm"
#include "queue"
using namespace  std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;cin>>N;

    priority_queue<int, vector<int>> heap;
    for(int i=0; i<N; i++){
        int x;
        cin>>x;
        if(x>0){
            heap.push(x);
        }
        else if(x==0){
            if(heap.empty())cout<<"0\n";
            else{
                cout<<heap.top()<<'\n';
                heap.pop();
            }
        }
    }
    return 0;
}
