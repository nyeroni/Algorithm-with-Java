#include<iostream>
#include<string>
using namespace std;
int main()
{
    int A[26]={0,};
    string str="";
    cin>>str;
    for(int i=0; i<str.length(); i++){
        if(str[i]>='a'&&str[i]<='z'){
            str[i]=str[i]-32;
        }
        A[str[i]-65]++;
    }
    int max=0, j=0,cnt=-1;
    for(int i=0; i<26; i++){
        if(A[i]>=max){
            if(A[i]>max){
                cnt=0;
                max=A[i];
                j=i;
            }
            else{
                cnt++;
            }
        }
    }
    if(cnt!=0)cout<<"?";
    else cout<<static_cast<char>(j+65);
    return 0;
}