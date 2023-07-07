#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<map>
#include<set>
using namespace std;
bool cmp(string a, string b){
    return a<b;
}

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N,M;
    cin>>N>>M;
    map<string, bool> m;
    vector<string> result;
    for(int i=0; i<N; i++){
        string x;
        cin>>x;
        m[x]=true;
    }
    int cnt=0;
    for(int i=0; i<M; i++){
        string x;
        cin>>x;
        if(m[x]==true){
            cnt++;
            result.emplace_back(x);
        }
    }
    cout<<cnt<<'\n';
    sort(result.begin(), result.end(), cmp);
    for(auto&&alp : result){
        cout<<alp<<'\n';
    }
    return 0;
}