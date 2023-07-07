#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
bool prime(int n){
    if(n<=1)return false;
    for(int i=2; i*i<=n; i++){
        if(!(n%i))return false;
    }
    return true;
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a;
    while(true){
        cin>>a;
        if(a==0)break;
        int cnt=0;

        for(int i=a+1; i<=2*a; i++){
            if(prime(i))cnt++;
        }
        cout<<cnt<<'\n';
    }


    return 0;
}