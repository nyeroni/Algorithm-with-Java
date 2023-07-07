#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;

long long binomialCoefficient(int n, int k){
    if(k>n-k){
        k=n-k;
    }
    long long result=1;
    for(int i=0; i<k; i++){
        result*=(n-i);
        result/=(i+1);
    }
    return result;
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int T,N,M;
    long long int A=1,B=1;
    cin>>T;
    for(int i=0; i<T; i++){
        cin>>N>>M;

        cout<<binomialCoefficient(M, N)<<'\n';
    }

    return 0;
}