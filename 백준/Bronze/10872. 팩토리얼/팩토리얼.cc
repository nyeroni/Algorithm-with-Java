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

    int N;
    cin>>N;
    if(N==0){
        cout<<1<<endl;
        return 0;
    }
    int total=1;
    for(int i=1; i<=N; i++){
        total*=i;
    }
    cout<<total<<endl;
    return 0;
}