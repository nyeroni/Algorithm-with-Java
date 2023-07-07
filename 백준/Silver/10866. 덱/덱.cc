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

    int N;
    cin>>N;
    deque<int>d;
    for(int i=0; i<N; i++){
        string str;
        int x;
        cin>>str;
        if(str=="push_front"){
            cin>>x;
            d.push_front(x);
        }
        else if(str=="push_back"){
            cin>>x;
            d.push_back(x);
        }
        else if(str=="pop_front"){
            if(d.empty())cout<<"-1\n";
            else {
                int k = d.front();
                d.pop_front();
                cout << k << '\n';
            }

        }
        else if(str=="pop_back"){
            if(d.empty())cout<<"-1\n";
            else {
                int k = d.back();
                d.pop_back();
                cout << k << '\n';
            }

        }
        else if(str=="size"){
            cout<<d.size()<<'\n';
        }
        else if(str=="empty"){
            if(d.empty())cout<<"1\n";
            else cout<<"0\n";
        }
        else if(str=="front"){
            if(d.empty())cout<<"-1\n";
            else cout<<d.front()<<'\n';
        }
        else if(str=="back"){
            if(d.empty())cout<<"-1\n";
            else cout<<d.back()<<'\n';
        }
    }
    return 0;
}