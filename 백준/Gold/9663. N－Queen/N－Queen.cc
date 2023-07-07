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

int N, result=0;
int *arr;
bool check(int index){
    for(int i=0; i<index; i++){
        if(abs(arr[i]-arr[index])== index-i || arr[i]==arr[index]){
            return false;
        }
    }        
    return true;

}
void solution(int index){
    if(index==N){
        result++;
        return;
    }
    for(int i=0; i<N; i++){
        arr[index]=i;
        if(check(index)){
            solution(index+1);
        }
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin>>N;
    arr=new int[N];
    solution(0);
    cout<<result;

    return 0;
}