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
bool cmp(pair<int, string> a, pair<int, string> b){
    if(a.first==b.first){
        if(a.second.length()==b.second.length()){
            return a.second<b.second;
        }
        else return a.second.length()>b.second.length();
    }
    else return a.first>b.first;
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    vector<int>v;
    cin>>N;
    for(int i=0; i<N; i++){
        string str;
        int x;
        cin>>str;
        if(str=="push"){
            cin>>x;
            v.emplace_back(x);
        }
        else if(str=="pop"){
            if(v.empty())cout<<"-1\n";
            else {
                int k = v.back();
                v.pop_back();
                cout << k << '\n';
            }

        }
        else if(str=="size"){
            cout<<v.size()<<'\n';
        }
        else if(str=="empty"){
            if(v.empty())cout<<"1\n";
            else cout<<"0\n";
        }
        else if(str=="top"){
            if(v.empty())cout<<"-1\n";
            else cout<<v.back()<<'\n';
        }
    }
    return 0;
}