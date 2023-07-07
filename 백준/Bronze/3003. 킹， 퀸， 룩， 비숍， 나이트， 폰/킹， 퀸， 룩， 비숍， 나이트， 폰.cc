#include<iostream>
#include<string>
using namespace std;
int main()
{
    int a[6], b[6]={1,1,2,2,2,8};
    int k;
    for(int i=0; i<6; i++){
        cin>>k;
        a[i]=b[i]-k;
    }
    for(int i=0; i<6; i++){
        cout<<a[i]<<" ";
    }
    return 0;
}