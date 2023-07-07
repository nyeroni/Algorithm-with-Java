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

int N,M;
int *arr;

void BackTracking(int k, int num){
    if(k==M){
        for(int i=0; i<M; i++){
            cout<<arr[i]<<" ";
        }
        cout<<'\n';
        return ;
    }
    for(int i=num; i<N; i++){
        arr[k]=i+1;
        BackTracking(k+1,i+1);
    }

}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin>>N>>M;

    arr = new int[N];
    BackTracking(0,0);
    return 0;
}