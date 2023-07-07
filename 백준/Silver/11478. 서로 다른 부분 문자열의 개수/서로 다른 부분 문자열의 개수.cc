#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
using namespace std;
bool cmp(string a, string b){
    return a<b;
}

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    map<string, bool> m;
    string str;
    cin>>str;
    int cnt=0;
    for(int i=0; i<str.length(); i++){
        string tmp="";
        for(int j=i; j<str.length(); j++){
            tmp+=str[j];
            if(m[tmp]==false){
                m[tmp]=true;
                cnt++;
            }
        }
    }
    cout<<cnt<<"\n";
    return 0;
}