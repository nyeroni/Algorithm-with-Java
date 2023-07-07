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
    int total=0;
    vector<int>v;
    int arr[8001]={0};
    for(int i=0; i<N; i++){
        int x;
        cin>>x;
        v.emplace_back(x);
        total+=x;
        arr[x+4000]++;
    }
    sort(v.begin(), v.end());

    vector <int> vec;
    int max=*max_element(arr,arr+8001);
    for(int i=0; i<8001; i++){
        if(arr[i]==max){
            vec.emplace_back(i-4000);
        }
    }
    double age = (double)total/(double)N;

    if(round(age)==0)cout<<0<<'\n';
    else cout<<round(age)<<'\n';
    cout<<v[N/2]<<'\n';
    if(vec.size()>1)cout<<vec[1]<<'\n';
    else cout<<vec[0]<<'\n';

    cout<<v[N-1]-v[0]<<'\n';
    return 0;
}