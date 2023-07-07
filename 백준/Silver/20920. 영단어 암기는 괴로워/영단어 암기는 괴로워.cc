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

    int N, M;
    cin>>N>>M;
    map<string, int>check;
    for(int i=0; i<N; i++){
        string x;
        cin>>x;
        if(x.size()<M){
            continue;
        }
        check[x]++;
    }
    vector<pair<int, string>> words;
    for(auto&& word : check){
        words.emplace_back(word.second,word.first);
    }
    sort(words.begin(),words.end(),cmp);
    for(auto&& word : words){
        cout<<word.second<<'\n';
    }

    return 0;
}