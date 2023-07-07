#include<iostream>
using namespace std;
int main()
{
    int N,v,total=0;
    cin>>N;
    int arr[100];
    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    cin>>v;
    for(int i=0; i<N; i++){
        if(arr[i]==v){
            total++;
        }
    }
    cout<<total<<endl;
    return 0;
}