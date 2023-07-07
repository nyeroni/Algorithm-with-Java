#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    string str1="",str2="", result="";
    cin>>str1>>str2;
    int size1=str1.length();
    int size2=str2.length();
    
    int c=0;
    while(size1>0||size2>0){
        int a=0,b=0;
        if(size1>0){
            a=str1[--size1]-'0';
        }
        if(size2>0){
            b=str2[--size2]-'0';
        }
        
        int add = a+b+c;
        c=add/10;
        add=add%10;
        
        result+=add+'0';
    }
    if(c>0){
        result+=c+'0';
    }
    
    for(int i=result.length()-1; i>=0; i--){
        cout<<result[i];
    }
    return 0;
}