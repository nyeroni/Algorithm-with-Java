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
int LCM(int a, int b){
    return a*b/GCD(a,b);
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a,b,c,d;
    cin>>a>>b;
    cin>>c>>d;

    int B=LCM(b,d);
    int A=a*(B/b)+c*(B/d);
    
    int g = GCD(A,B);
    A/=g;
    B/=g;
    cout<<A<<" "<<B<<'\n';
    return 0;
}