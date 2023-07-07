#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
#include <stack>
using namespace std;
bool cmp(pair<int, string> a, pair<int, string> b){
    if(a.first==b.first){
        if(a.second.length()==b.second.length()){
            return a.second<b.second;
        }
        else return a.second.length()>b.second.length();
    }
    else return a.first>b.first;
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    while(true){
        string str;
        getline(cin, str);
        stack<char> s;
        if(str[0]=='.')break;
        int flag=1;
        for(int i=0; i<str.length(); i++){
            if(str[i]=='('||str[i]=='['){
                s.push(str[i]);
            }

            if(str[i]==')'){
                if(!s.empty()&&s.top()=='('){
                    s.pop();
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(str[i]==']'){
                if(!s.empty()&&s.top()=='['){
                    s.pop();
                }
                else{
                    flag=0;
                    break;
                }
            }
        }
        if(s.empty()&&flag==1)cout<<"yes\n";
        else cout<<"no\n";
    }
    return 0;
}