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
void hanoi(int from, int to, int n){
    if(n==0)return;

    int mid=6-from-to;
    hanoi(from,mid, n-1);
    cout<<from<<' '<<to<<'\n';
    hanoi(mid,to,n-1);
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;

    cin>>N;
    long long int a = pow(2,N)-1;
    cout<<a<<'\n';
    hanoi(1,3,N);

    return 0;
}