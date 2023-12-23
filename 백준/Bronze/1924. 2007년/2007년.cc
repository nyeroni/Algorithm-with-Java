#include<iostream>
using namespace  std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string str[7] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int day[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int x, y, totalDay=0;
    cin>>x>>y;

    for(int i=0; i<x-1; i++){
        totalDay+=day[i];
    }
    totalDay+=y;

    cout<<str[totalDay%7];

    return 0;
}
