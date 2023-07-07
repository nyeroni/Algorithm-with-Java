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
void cantor(int N){
    if(N==1){
        cout<<'-';
        return;
    }
    cantor(N/3);
    for(int i=0; i<N/3; i++){
        cout<<' ';
    }
    cantor(N/3);
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    while(cin>>N){
        int p=1;
        for(int i=0; i<N; i++){
            p*=3;
        }
        cantor(p);
        cout<<'\n';
    }
    return 0;
}