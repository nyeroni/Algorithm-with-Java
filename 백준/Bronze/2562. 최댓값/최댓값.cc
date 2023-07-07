#include<iostream>
using namespace std;
int main()
{
    int arr[9];
    int max=0,j=0;
    for(int i=0; i<9; i++){
        cin>>arr[i];
        if(arr[i]>max){
            max=arr[i];
            j=i+1;
        }
    }
    cout<<max<<'\n'<<j<<'\n';
    return 0;
}