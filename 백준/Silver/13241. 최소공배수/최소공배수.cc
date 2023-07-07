#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
long long int GCD(long long int a, long long int b){
    long long int c=a%b;
    while(c!=0){
        a=b;
        b=c;
        c=a%b;
    }
    return b;
}
long long int LCM(long long int a, long long int b){
    return a*b/GCD(a,b);
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    long long int a,b;
    cin>>a>>b;
    cout<<LCM(a,b)<<'\n';
    return 0;
}