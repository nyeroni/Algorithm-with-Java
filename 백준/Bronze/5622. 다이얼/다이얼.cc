#include<iostream>
#include<string>
using namespace std;
int main()
{
    string str;
    int total=0;
    cin>>str;
    for(int i=0; i<str.length(); i++){
        if(str[i]=='A'||str[i]=='B'||str[i]=='C'){
            total+=3;
        }
        else if(str[i]=='D'||str[i]=='E'||str[i]=='F'){
            total+=4;
        }
        else if(str[i]=='G'||str[i]=='H'||str[i]=='I'){
            total+=5;
        }
        else if(str[i]=='J'||str[i]=='K'||str[i]=='L'){
            total+=6;
        }
        else if(str[i]=='M'||str[i]=='N'||str[i]=='O'){
            total+=7;
        }
        else if(str[i]=='P'||str[i]=='Q'||str[i]=='R'||str[i]=='S'){
            total+=8;
        }
        else if(str[i]=='T'||str[i]=='U'||str[i]=='V'){
            total+=9;
        }
        else if(str[i]=='W'||str[i]=='X'||str[i]=='Y'||str[i]=='Z'){
            total+=10;
        }
    }
    cout<<total;
    return 0;
}