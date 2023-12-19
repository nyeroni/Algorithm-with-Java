#include<iostream>
#include "stack"
#include<algorithm>
using namespace  std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

   int N;
   cin>>N;


   stack<int> s;
   for(int i=0; i<N; i++){
       int num;cin>>num;
       if(num==1){
           int X;
           cin>>X;
           s.push(X);
       }
       else if(num==2){
           if(s.size()==0)cout<<"-1\n";
           else {
               cout<<s.top()<<'\n';
               s.pop();
           }
       }
       else if(num==3){
            cout<<s.size()<<'\n';
       }
       else if(num==4){
            if(s.size()==0)cout<<"1\n";
            else cout<<"0\n";
       }
       else if(num==5){
            if(s.size()!=0)cout<<s.top()<<'\n';
            else cout<<"-1\n";
       }
   }

    return 0;
}
