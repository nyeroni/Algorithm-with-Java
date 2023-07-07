#include<iostream>
using namespace std;
int main()
{
    int A,B,C;
    int h,w;
    cin>>A>>B;
    cin>>C;
    if(B+C>=60){
        h=A+(B+C)/60;
        w=(B+C)%60;
        if(h>=24){
            h=h-24;
        }

    }
    else{
        h=A;
        w=B+C;
    }
    cout<<h<<" "<<w<<endl;
    return 0;

}