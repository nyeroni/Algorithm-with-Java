#include<iostream>
#include<string>
using namespace std;
int main()
{
    string S="";
    int cnt=0;
    getline(cin,S);
    for(int i=0; i<S.length(); i++){
        if(S[i]==' '){
            cnt++;
        }
    }
    if(S[0]==' '){
        if(S[S.length()-1]==' '){
            cnt--;
        }
    }
    else{
        if(S[S.length()-1]!=' '){
            cnt++;
        }
    }
    cout<<cnt;
    return 0;
}