#include<iostream>
#include<string>
using namespace std;

int main()
{
    string str="";
    int N;
    int count=0;
    cin>>N;
    for(int i=0; i<N; i++){
        cin>>str;
        int cnt=0;
        if(str.length()==1){
            count++;
            continue;
        }
        for(int j=0; j<str.length()-2; j++){
            if(str[j]!=str[j+1]){
                for(int k=j+2; k<str.length(); k++){
                    if(str[j]==str[k]){
                        cnt++;
                    }
                }
            }
        }
        if(cnt==0){
            count++;
        }
    }
    cout<<count<<endl;
    return 0;
}