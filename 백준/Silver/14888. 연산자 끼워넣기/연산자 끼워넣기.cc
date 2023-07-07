#include<iostream>
#include<cstring>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
#include <stack>
#include<queue>
#include<deque>

using namespace std;
int N, minN=1000000000, maxN=-1000000000;
int arr[100], os[4];
void calculate(int c, int num){
    if(c==N-1){
        if(minN>num){
            minN=num;
        }
        if(maxN<num){
            maxN=num;
        }
        return;
    }
    for(int i=0; i<4; i++){
        if(os[i]==0)continue;

        os[i]--;
        if(i==0) calculate(c+1,num+arr[c+1]);
        else if(i==1) calculate(c+1,num-arr[c+1]);
        else if(i==2) calculate(c+1, num*arr[c+1]);
        else if(i==3) calculate(c+1,num/arr[c+1]);

        os[i]++;
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin>>N;

    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    for(int i=0; i<4; i++){
        cin>>os[i];
    }
    calculate(0, arr[0]);

    cout<<maxN<<'\n'<<minN;

    return 0;
}