#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int N,M,total=0,max=0;
    cin>>N>>M;
    int arr[100];
    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    for(int i=0; i<N; i++){
        for(int j=i+1; j<N; j++){
            for(int k=j+1; k<N; k++){
                total=arr[i]+arr[j]+arr[k];
                if(total>M){
                    continue;
                }
                else{
                    if(total>max){
                        max=total;
                    }
                }
            }
        }
    }
    cout<<max<<endl;
    return 0;
}

