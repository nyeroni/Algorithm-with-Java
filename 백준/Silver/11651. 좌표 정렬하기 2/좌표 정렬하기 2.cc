#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;

bool cmp(int a, int b){
    return a>b;
}
typedef struct xy{
   int x,y;
}xy;

bool compare(xy a, xy b){
    if(a.y==b.y)return a.x<b.x;
    return a.y<b.y;
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin>>N;
    xy z[100000];
    for(int i=0; i<N; i++){
        cin>>z[i].x>>z[i].y;
    }
    sort(z, z+N, compare);
    for(int i=0; i<N; i++){
        cout<<z[i].x<<" "<<z[i].y<<"\n";
    }
    return 0;
}

