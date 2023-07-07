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



    int N, M;
    cin>>N>>M;
    map<int,string> m1;
    map<string, int>m2;
    for(int i=0; i<N; i++){
        string x;
        cin>>x;
        m1[i+1]=x;
        m2[x]=i+1;
    }
    for(int i=0; i<M; i++){
        string x;
        cin>>x;
        if(isdigit(x[0])){
            cout<<m1[stoi(x)]<<'\n';
        }
        else{
            cout<<m2[x]<<'\n';
        }
    }
    return 0;
}