#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
    string N="";
    int B;
    cin>>N>>B;

    int a=0, total=0, tmp=N.length()-1;
    for(int i=0; i<N.length(); i++){
        if(N[i]>='0'&&N[i]<='9'){
            a=N[i]-'0';
        }
        else if(N[i]>='A'&&N[i]<='Z'){
            a=N[i]-55;
        }
        total+=(pow(B,tmp)*a);
        tmp--;
    }
    cout<<total<<endl;
    return 0;
}
