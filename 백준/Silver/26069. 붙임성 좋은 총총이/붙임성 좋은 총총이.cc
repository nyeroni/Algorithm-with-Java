#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;
    string A,B;
    unordered_set<string> dance;
    dance.insert("ChongChong");
    for(int i=0; i<N; i++){
        cin>>A>>B;

        if(dance.count(A)==0&&dance.count(B)!=0)dance.insert(A);
        else if(dance.count(B)==0&&dance.count(A)!=0)dance.insert(B);
    }
    cout<<dance.size()<<'\n';

    return 0;
}