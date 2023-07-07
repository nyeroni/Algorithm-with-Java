#include<iostream>
#include<string>
using namespace std;
int main()
{
    int cnt=0;
    string str="";
    cin>>str;
    for(int i=0; i<str.length()/2; i++){
        if(str[i]!=str[str.length()-1-i]){
            cnt++;
        }
    }
    if(cnt==0)cout<<"1";
    else cout<<"0";
    return 0;
}