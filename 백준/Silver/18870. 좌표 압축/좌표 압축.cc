#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
using namespace std;

bool cmp(int a, int b){
    return a<b;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin>>N;

    vector<int> v;

    for(int i=0; i<N; i++){
        int x;
        cin>>x;
        v.emplace_back(x);
    }
    vector <int> tmp=v;
    sort(tmp.begin(), tmp.end());
    tmp.resize(unique(tmp.begin(), tmp.end())-tmp.begin());

    for(auto&& x : v){
        cout<<lower_bound(tmp.begin(), tmp.end(), x)-tmp.begin()<<' ';
    }
    cout<<"\n";
    return 0;
}

