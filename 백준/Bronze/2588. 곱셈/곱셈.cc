#include<iostream>
using namespace std;
int main() {
    int A, B;
    cin>>A>>B;
    int a,b,c,d;
    a = A*(B%10);
    b = A*((B/10)%10);
    c = A*(B/100);
    d = A*B;
    cout<<a<<'\n'<<b<<'\n'<<c<<'\n'<<d<<'\n';
    return 0;
}