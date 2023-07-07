#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<map>
using namespace std;
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N, M;
    cin>>N>>M;

    map<string, bool> m;

    for(int i=0; i<N; i++){
        string x;
        cin>>x;
        m[x]=true;
    }
    int cnt=0;
    for(int i=0; i<M; i++){
        string x;
        cin>>x;
        if(m[x]==true)cnt++;
    }
    cout<<cnt<<"\n";
    return 0;
}