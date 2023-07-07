#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
int arr[1000001]={0};

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    long long int N;
    cin>>N;
    int cnt=0;
    for(long long int i=1; i*i<=N; i++){
        cnt++;
    }
    cout<<cnt;

    return 0;
}