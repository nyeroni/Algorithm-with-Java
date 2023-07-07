#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
#include <stack>
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
    cin>>N;
    for(int i=0; i<N; i++){
        vector<char> v;
        string str;
        cin>>str;
        int cnt=0;
        for(int j=0; j<str.length(); j++){
            if(str[j]=='('){
                v.emplace_back(str[j]);
            }
            else if(str[j]==')'){
                if(v.size()==0 || v.back()==')'){
                    cnt++;
                    break;
                }
                v.pop_back();
            }
        }
        if(v.size()==0&&cnt==0) cout<<"YES\n";
        else  cout<<"NO\n";
    }

    return 0;
}