#include<iostream>
using namespace std;
int main()
{
    int  arr[42]={0,},k,cnt=0,result=0;
    for(int i=0; i<10; i++){
        cin>>k;
        arr[k%42]++;
    }
    for(int i=0; i<42; i++){
        if(arr[i]>0){
            result++;
        }
    }
    cout<<result;

    return 0;
}