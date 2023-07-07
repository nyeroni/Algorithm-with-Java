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
#include<queue>
#include<deque>

using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int T;
    cin>>T;
    for(int i=0; i<T; i++){
        deque<int>d;

        string str,arr;
        bool err=false;
        bool reverse=false;
        int x;
        cin>>str;
        cin>>x;
        cin>>arr;

        string tmp="";

        for(int j=1; j<arr.length(); j++){
            if((arr[j]==','||(arr[j]==']')&&tmp!="")){
                d.push_back(stoi(tmp));
                tmp="";
            }
            else if(arr[j]>='0'&&arr[j]<='9'){
                tmp+=arr[j];
            }

        }
        for(int j=0; j<str.length(); j++){
            if(str[j]=='R'){
                if(reverse==true)reverse=false;
                else reverse=true;

            }
            else if(str[j]=='D'){
                if(d.empty()){
                    err=true;
                    break;
                }
                if(reverse==false){
                    d.pop_front();
                }
                else{
                    d.pop_back();
                }
            }
        }


        if(err==true){
            cout<<"error\n";
            continue;
        }
        else{
            if(d.empty()){
                cout<<"[]\n";
                continue;
            }
            cout<<"[";
            if (reverse == false) {
                for (int j = 0;j < d.size() - 1;j++) cout << d[j] << ",";
                cout << d[d.size() - 1] << "]\n";
            }
            else {
                for (int j = d.size()-1;j > 0;j--) cout << d[j] << ",";
                cout << d[0] << "]\n";
            }



        }

    }

    return 0;
}