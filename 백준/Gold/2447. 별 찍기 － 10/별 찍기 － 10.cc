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
void star(int n, int x, int y){
    if((x/n)%3==1&&(y/n)%3==1){
        cout<<" ";
    }
    else{
        if(n/3==0){
            cout<<"*";
        }
        else{
            star(n/3, x, y);
        }
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            star(N,i,j);
        }
        cout<<'\n';

    }


    return 0;
}