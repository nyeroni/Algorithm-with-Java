#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int factor(int a, int b){
    if(b%a==0) return 1;
    else return 0;
}
int main()
{
    int a,b;
    while(true){
        cin>>a>>b;
        int num=-1;
        int fm=-1;
        if(a==0&&b==0)break;
        if(a>b){
            num= factor(b,a);
            if(num==1){
                cout<<"multiple"<<endl;
            }
            else {
                num= factor(a,b);
                if(num==1){
                    cout<<"multiple"<<endl;
                }
                else{
                    cout<<"neither"<<endl;
                }
            }
        }
        else{
            num= factor(a,b);
            if(num==1){
                cout<<"factor"<<endl;
            }
            else {
                num= factor(b,a);
                if(num==1){
                    cout<<"multiple"<<endl;
                }
                else{
                    cout<<"neither"<<endl;
                }
            }        }
        if(num==1){

        }
    }
    return 0;
}