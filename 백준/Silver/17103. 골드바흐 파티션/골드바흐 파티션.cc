#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
int arr[1000001]={0};

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int T;
    cin>>T;

    for(int i=2; i<1000000; i++){
        arr[i]=i;
    }
    for(int i=2; i<1000000; i++){
        if(arr[i]==0)continue;
        else{
            for(int j=i*2; j<=1000000; j+=i){
                arr[j]=0;
            }
        }
    }
    while(T>0){
        int x;
        cin>>x;
        int a, sum=0;
        for(int i=2; i<=x; i++){
            a=i;
            if(x==(arr[a]+arr[x-a])){
                sum++;
                if(arr[a]==arr[x-a]){
                    sum++;
                }
            }
        }
        cout<<sum/2<<'\n';
        T--;
    }


    return 0;
}