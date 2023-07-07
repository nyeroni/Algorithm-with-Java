#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;
    int arr[N];
    for(int i=0; i<N;i++){
        cin>>arr[i];
    }
    sort(arr, arr+N);
    cout<<arr[0]*arr[N-1]<<'\n';


    return 0;
}