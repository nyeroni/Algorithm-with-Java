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
int cnt=0,K,result=-1;
void mergeSort(int p, int r, int *arr){
    if(p>=r)return ;
    int q=(p+r)/2;
    mergeSort(p,q,arr);
    mergeSort(q+1,r,arr);
    int i=p,j=q+1,k=1;
    int tmp[r];
    while(i<=q&&j<=r){
        if(arr[i]<=arr[j]){
            tmp[k++]=arr[i++];
        }
        else{
            tmp[k++]=arr[j++];
        }
    }
    while(i<=q){
        tmp[k++]=arr[i++];

    }
    while(j<=r)tmp[k++]=arr[j++];
    i=p,k=1;
    while(i<=r){
        arr[i]=tmp[k];
        cnt++;
        if(cnt==K)result=arr[i];
        i++,k++;
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N>>K;
    int arr[N];
    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    mergeSort(0,N-1,arr);
    cout<<result;
    return 0;
}