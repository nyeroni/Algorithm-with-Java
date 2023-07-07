#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
typedef unsigned long long INT;
bool prime(INT n){
    if(n<=1)return false;
    for(INT i=2; i*i<=n; i++){
        if(!(n%i))return false;
    }
    return true;
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    INT n,k;
    cin>>n;
    while(n--){
        cin>>k;
        while(!prime(k)){
            k++;
        }
        cout<<k<<"\n";
    }

    return 0;
}