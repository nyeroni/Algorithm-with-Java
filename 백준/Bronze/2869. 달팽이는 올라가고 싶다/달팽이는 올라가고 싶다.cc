#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{

    int A,B,V, days=1;
    cin>>A>>B>>V;
    
    days+=(V-A)/(A-B);
    if((V-A)%(A-B)!=0)days++;
    if(V==A)cout<<"1"<<endl;
    else cout<<days<<endl;
    return 0;
}