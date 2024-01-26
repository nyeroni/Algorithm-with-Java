#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
int GCD(int a, int b){
    int c=a%b;
    while(c!=0){
        a=b;
        b=c;
        c=a%b;
    }
    return b;
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    vector<int>v;
    cin>>N;
    int arr[N];
    for(int i=0; i<N; i++){
        int x;
        cin>>arr[i];
    }
    sort(arr, arr+N);
    for(int i=1; i<N; i++){
        v.push_back(arr[i]-arr[i-1]);
    }
    int tmp=v[0];
    for(int i=1; i<v.size(); i++){
        tmp=GCD(tmp, v[i]);
    }
    int cnt=0;
    for(int i=0; i<v.size(); i++){
        cnt+=v[i]/tmp-1;
    }
    cout<<cnt<<'\n';
    return 0;
}