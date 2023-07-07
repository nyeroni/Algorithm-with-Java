#include<iostream>
using namespace std;
int main()
{
    string s="";
    cin>>s;
    int cnt=0,k=0;
    for(int i=0; i<26; i++){
        cnt=0;
        for(int j=0; j<s.size(); j++){
            if(i+97==s[j]) {
                cnt++;
                k = j;
                break;
            }
        }
        if(cnt==0){
            cout<<"-1 ";
        }
        else{
            cout<<k<<" ";
        }
    }

    return 0;
}