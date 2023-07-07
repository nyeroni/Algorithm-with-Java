#include<iostream>
#include<string>
using namespace std;
int main()
{
    char A[4], B[4];
    cin>>A;
    cin>>B;
    int ans=0;

    if(A[2]>B[2]){
        ans+=(A[2]-48)*100;
        ans+=(A[1]-48)*10;
        ans+=A[0]-48;
    }
    else if(A[2]<B[2]){
        ans+=(B[2]-48)*100;
        ans+=(B[1]-48)*10;
        ans+=B[0]-48;
    }
    else{
        if(A[1]>B[1]){
            ans+=(A[2]-48)*100;
            ans+=(A[1]-48)*10;
            ans+=A[0]-48;
        }
        else if(A[1]<B[1]){
            ans+=(B[2]-48)*100;
            ans+=(B[1]-48)*10;
            ans+=B[0]-48;
        }
        else{
            if(A[0]>B[0]){
                ans+=(A[2]-48)*100;
                ans+=(A[1]-48)*10;
                ans+=A[0]-48;
            }
            else if(A[0]<B[0]){
                ans+=(B[2]-48)*100;
                ans+=(B[1]-48)*10;
                ans+=B[0]-48;
            }
        }
    }
    cout<<ans;
    return 0;
}