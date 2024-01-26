#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;


bool compare(string a, string b){
    if(a.length()==b.length()){
        return a<b;
    }
    else{
        return a.length()<b.length();
    }
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin>>N;
    string arr[20000];

    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    sort(arr, arr+N, compare);
    for(int i=0; i<N; i++){
        if(arr[i]==arr[i-1])continue;
        else cout<<arr[i]<<'\n';
    }
    return 0;
}

