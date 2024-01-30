#include<iostream>
#include "algorithm"
#include "deque"
using namespace  std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;

    deque<pair<int, int>> dq;

    for(int i=0; i<N; i++)
    {
        int tmp; cin>>tmp;
        dq.push_back(make_pair(tmp, i+1)); //이동할 값, 위치값
    }

    while(!dq.empty()){
        int num = dq.front().first;
        cout<<dq.front().second<<" ";
        dq.pop_front();

        if(dq.empty())break;
        if(num > 0){
            //양수일 경우 맨 앞의 것을 맨 뒤로 옮기기
            for(int i=0; i<num-1; i++){
                dq.push_back(dq.front());
                dq.pop_front();
            }
        }
        else{
            //음수일 경우 맨 뒤의 것을 맨 앞으로 옮기기
            for(int i=0; i<(-1)*num; i++){
                dq.push_front(dq.back());
                dq.pop_back();
            }
        }

    }
    return 0;
}
