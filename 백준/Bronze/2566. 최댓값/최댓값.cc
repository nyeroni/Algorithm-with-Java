#include<iostream>
#include<string>
using namespace std;

int main()
{
    int max=-1, k=-1,l=-1;
    int arr[9][9];
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            cin>>arr[i][j];
            if(max<arr[i][j]){
                max=arr[i][j];
                k=i+1,l=j+1;
            }
        }
    }
    cout<<max<<'\n'<<k<<" "<<l<<endl;

    return 0;
}