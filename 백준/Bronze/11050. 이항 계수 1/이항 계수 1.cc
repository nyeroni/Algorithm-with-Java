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

    int N,K;
    cin>>N>>K;
    int A=1,B=1;
    for(int i=1; i<=K; i++){
        A*=N;
        N--;
        B*=i;
    }
    cout<<A/B<<endl;
    return 0;
}