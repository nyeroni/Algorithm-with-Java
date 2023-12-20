#include<iostream>
#include "stack"
#include<algorithm>
#include "queue"
using namespace  std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

   int N,  start=1;
   cin>>N;
   queue<int> q;
   stack<int> s;
   vector<int>v;
   for(int i=0; i<N; i++){
       int num;
       cin>>num;
       q.push(num);
   }

   while(!q.empty()){
       if(q.front()==start){
           v.push_back(start);
           start++;
           q.pop();
       }
       else if(!s.empty() && s.top()==start){
           s.pop();
           v.push_back(start);
           start++;
       }
       else{
           s.push(q.front());
           q.pop();
       }
   }
   while(!s.empty()){
       v.push_back(s.top());
       s.pop();
   }
   bool pos=true;
//   for(int i=0; i<v.size(); i++){
//       cout<<v.at(i)<<'\n';
//   }
   for(int i=0; i<v.size()-1; i++){
        if(v.at(i)>v.at(i+1)){
            pos = false;
            break;
        }
   }
   if(pos)cout<<"Nice\n";
   else cout<<"Sad\n";
    return 0;
}
