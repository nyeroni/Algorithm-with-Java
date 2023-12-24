#include<iostream>
#include<string>
using namespace  std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string str, num;
    cin>>str;
    bool check= false;
    int result=0;

    for(int i = 0; i<=str.size(); i++){
        if(str[i]=='+' || str[i]=='-'||i==str.size()){
            if(check){
                result-= stoi(num);
                num="";
            }
            else{
                result+= stoi(num);
                num="";
            }
            if(str[i]=='-')check=true;
        }
        else{
            num+=str[i];
        }
    }
    cout<<result;

    return 0;
}
