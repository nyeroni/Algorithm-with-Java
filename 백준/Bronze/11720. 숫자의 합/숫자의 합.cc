#include<iostream>
using namespace std;
int main()
{
    int N;
    int total=0;
    char arr[101];
    cin>>N;
    for(int i=0; i<N; i++){
        cin>>arr[i];
    }
    for(int i=0; i<N; i++){
        total+=(static_cast<int>(arr[i])-48);
    }
    cout<<total;
    return 0;
}