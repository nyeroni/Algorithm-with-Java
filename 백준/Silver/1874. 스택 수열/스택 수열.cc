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

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin>>n;

    string result="";
    vector<int>v;
    for(int i=0; i<n; i++){
        int x;
        cin>>x;
        v.emplace_back(x);
    }
    vector<int>num;
    int j=0;
    for(int i=1; i<=n; i++){
        num.emplace_back(i);
        result+='+';
        while(!num.empty()&&num.back()==v[j]){
            num.pop_back();
            result+='-';
            j++;
        }

    }
    if(!num.empty()){
        cout<<"NO\n";
    }
    else{
        for(int i=0; i<result.length(); i++){
            cout<<result[i]<<'\n';
        }
    }

    return 0;
}