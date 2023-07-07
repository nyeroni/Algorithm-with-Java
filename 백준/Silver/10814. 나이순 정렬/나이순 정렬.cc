#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;
typedef struct{
    int age;
    string name;
}member;
bool cmp(member a, member b){
    return a.age<b.age;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin>>N;
    member m[N];
    for(int i=0; i<N; i++){
        cin>>m[i].age>>m[i].name;
    }
    stable_sort(m, m+N, cmp);
    for(int i=0; i<N; i++){
        cout<<m[i].age<<" "<<m[i].name<<"\n";
    }
    return 0;
}

