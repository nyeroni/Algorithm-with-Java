#include<iostream>
#include "deque"
#include<algorithm>
using namespace  std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

   int N;
   deque<int> dq;
   
   cin>>N;
   
   for(int i=0; i<N; i++){
       int num, x;
       cin>>num;
       if(num==1){
           cin>>x;
           dq.push_front(x);
       }
       else if(num==2){
           cin>>x;
           dq.push_back(x);
       }
       else if(num==3){
           if(dq.empty())cout<<-1<<'\n';
           else{
               cout<<dq.front()<<'\n';
               dq.pop_front();
           }
       }
       else if(num==4){
           if(dq.empty())cout<<-1<<'\n';
           else{
               cout<<dq.back()<<"\n";
               dq.pop_back();
           }
       }
       else if(num==5){
            cout<<dq.size()<<'\n';
       }
       else if(num==6){
            if(dq.empty()){
                cout<<1<<'\n';
            }
            else{
                cout<<0<<'\n';
            }
       }
       else if(num==7){
           if(dq.empty())cout<<-1<<'\n';
           else cout<<dq.front()<<'\n';
       }
       else if(num==8){
           if(dq.empty())cout<<-1<<'\n';
            else cout<<dq.back()<<'\n';
       }
   }
   return 0;
}
