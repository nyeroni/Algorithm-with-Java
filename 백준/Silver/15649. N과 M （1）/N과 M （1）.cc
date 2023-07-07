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
vector<int> v;
bool *visited;
void dfs(int k){
    if(k==M){
        for(int i=0; i<M; i++){
            cout<<v[i]<<' ';
        }
        cout<<'\n';
        return ;
    }
    for(int i=0; i<N; i++){
        if(visited[i]){
            continue;
        }
        visited[i]=true;
        v.push_back(arr[i]);
        dfs(k+1);
        v.pop_back();
        visited[i]=false;
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin>>N>>M;

    visited = new bool[N];
    arr = new int[N];

    for(int i=0; i<N; i++){
        arr[i]=i+1;
        visited[i] = false;
    }
    dfs(0);
    return 0;
}