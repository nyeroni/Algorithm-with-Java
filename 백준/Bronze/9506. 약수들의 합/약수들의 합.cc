#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    int N,total=0;
    int *arr, *tmp;
    
    while(true){
        cin>>N;
        if(N==-1)break;
        arr = new int[N];
        if(arr==nullptr){
            cout<<"No memory!"<<endl;
            return 0;
        }
        int cnt=0;
        for(int i=1; i<N; i++){
            if(N%i==0){
                arr[cnt]=i;
                total+=i;
                cnt++;
            }
        }

        if(total==N){
            cout<<N<<" = ";
            for(int i=0; i<cnt-1; i++){
                cout<<arr[i]<<" + ";
            }
            cout<<arr[cnt-1]<<endl;
        }
        else{
            cout<<N<<" is NOT perfect."<<endl;
        }
        delete(arr);
        cnt=0;
        total=0;
    }
    return 0;
}
