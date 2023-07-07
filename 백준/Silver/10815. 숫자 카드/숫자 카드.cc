#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N,M;
    cin >> N;
    vector<int> v;
    for(int i=0; i<N; i++){
        int x;
        cin>>x;
        v.emplace_back(x);
    }
    sort(v.begin(), v.end());

    cin>>M;
    for(int i=0; i<M; i++){
        int x;
        cin>>x;
        if(binary_search(v.begin(), v.end(), x)){
            cout<<1<<" ";
        }
        else cout<<0<<" ";
    }
    return 0;
}