#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
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

    int n,m;
    cin>>n>>m;
    int total=n+m;
    map<int,bool> M;
    for(int i=0; i<n; i++){
        int x;
        cin>>x;
        M[x]=true;
    }
    int cnt=0;
    for(int i=0; i<m; i++){
        int x;
        cin>>x;
        if(M[x]==true){
            cnt++;
        }
    }
    cout<<total-2*cnt<<"\n";
    return 0;
}