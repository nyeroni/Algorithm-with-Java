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

    int K;
    vector<int>v;
    cin>>K;
    int total=0;
    for(int i=0; i<K; i++){
        int x;
        cin>>x;
        if(x==0){
            total-=v.back();
            v.pop_back();

        }
        else{
            total+=x;
            v.emplace_back(x);
        }
    }
    cout<<total<<'\n';
    return 0;
}