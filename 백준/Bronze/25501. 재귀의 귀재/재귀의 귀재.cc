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
int cnt=0;
int recursion(char* s, int l, int r){
    cnt++;
    if(l>=r) return 1;
    else if(s[l]!=s[r])return 0;
    else return recursion(s, l+1, r-1);
}
int isPalindrome(char* s){
    return recursion(s,0, strlen(s)-1);
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int T;
    cin>>T;
    for(int i=0; i<T; i++){
        char s[1001];
        cnt=0;
        cin>>s;
        cout<<isPalindrome(s)<<' '<<cnt<<'\n';

    }
    return 0;
}