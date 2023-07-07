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
using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;
    queue<int>q;
    for(int i=0; i<N; i++){
        string str;
        int x;
        cin>>str;
        if(str=="push"){
            cin>>x;
            q.push(x);
        }
        else if(str=="pop"){
            if(q.empty())cout<<"-1\n";
            else {
                int k = q.front();
                q.pop();
                cout << k << '\n';
            }

        }
        else if(str=="size"){
            cout<<q.size()<<'\n';
        }
        else if(str=="empty"){
            if(q.empty())cout<<"1\n";
            else cout<<"0\n";
        }
        else if(str=="front"){
            if(q.empty())cout<<"-1\n";
            else cout<<q.front()<<'\n';
        }
        else if(str=="back"){
            if(q.empty())cout<<"-1\n";
            else cout<<q.back()<<'\n';
        }
    }

    return 0;
}