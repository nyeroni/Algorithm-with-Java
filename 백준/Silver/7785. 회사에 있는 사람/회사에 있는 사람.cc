#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<map>
#include<set>

using namespace std;
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin>>n;

    map< string, bool>m;
    set<string, greater<string>> s;
    for(int i=0; i<n; i++){
        string x, y;
        cin>>x>>y;
        if(y=="enter")m[x]=true;
        else if(y=="leave")m[x]=false;
        s.insert(x);
    }
    for(auto it=s.begin(); it!=s.end(); it++){
        string tmp = *it;
        if(m[tmp])cout<<tmp<<'\n';
    }
    return 0;
}