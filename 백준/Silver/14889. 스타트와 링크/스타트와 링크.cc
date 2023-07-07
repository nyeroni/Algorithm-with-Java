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
int N,minS=1000000000;
int arr[21][21];
bool check[22];
void dfs(int c, int num){
    if(c==N/2){// 카운트 수가 N/2가 됐다면
        int start=0, link=0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(check[i]==true&&check[j]==true)start+=arr[i][j];
                if(check[i]==false&&check[j]==false)link+=arr[i][j];
            }
        }
        int tmp = abs(start-link);
        if(minS>tmp)minS=tmp;
        return;
    }
    for(int i=num; i<N; i++){
        check[i]=true;
        dfs(c+1, i+1);
        check[i]=false;
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin>>N;

    for(int i=1; i<=N; i++){
        for(int j=1; j<=N; j++){
            cin>>arr[i][j];
        }
    }
    dfs(0,1);
    cout<<minS;
    return 0;
}