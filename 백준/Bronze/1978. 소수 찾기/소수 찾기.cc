#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int N, arr[100],cnt=0, c=0;
    cin>>N;
    for(int i=0; i<N; i++){
        cin>>arr[i];
        if(arr[i]==1){
            
            continue;
        }
        c=0;
        for(int j=1; j<arr[i]; j++){
            if(arr[i]%j==0){
                c++;
            }
        }
        if(c==1){
            cnt++;
        }
    }
    cout<<cnt<<endl;
    return 0;
}
