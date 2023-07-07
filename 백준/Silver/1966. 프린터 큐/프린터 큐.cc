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

    int T;
    cin>>T;
    int N,M,cnt=0;
    for(int i=0; i<T; i++) {
        queue<pair<int, int>> q;
        vector<int> v;
        cin >> N >> M;
        cnt=0;
        for (int j = 0; j < N; j++) {
            int x;
            cin >> x;
            v.emplace_back(x);
            if (j == M) {
                q.push(pair<int, int>(x, 1));
            } else {
                q.push(pair<int, int>(x, 0));
            }


        }
        sort(v.begin(), v.end());
        while (true) {
           /* for(auto ve:v){
                cout<<ve<<" ";
            }
            cout<<"\n";
            cout<<q.front().first<<" "<<q.front().second<<'\n';
            cout<<"\n";*/
            if(v[v.size()-1]==q.front().first){
                cnt++;
                if(q.front().second==1){
                    q.pop();
                    v.erase(v.end()-1);
                    break;
                }
                q.pop();
                v.erase(v.end()-1);
            }
            else{
                q.push(q.front());
                q.pop();
            }
        }
        cout<<cnt<<'\n';
    }

    return 0;
}