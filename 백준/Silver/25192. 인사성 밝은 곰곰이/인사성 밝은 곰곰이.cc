#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;
    unordered_set<string> v;
    int cnt=0;
    for(int i=0; i<N; i++){
        string name;
        cin>>name;
        if(name=="ENTER"){
            cnt+=v.size();
            v=unordered_set<string> {};

        }
        else{
            v.insert(name);
        }
    }
    cnt+=v.size();
    cout<<cnt<<'\n';

    return 0;
}