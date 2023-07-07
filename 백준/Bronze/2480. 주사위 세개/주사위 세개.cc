#include<iostream>
using namespace std;
int main()
{
    int a, b,c;
    int m=0;
    cin>>a>>b>>c;
    if(a==b &&a==c){
        m=10000+1000*a;
    }
    else if(a==b &&b!=c){
        m=1000+a*100;
    }

    else if(a==c &&b!=c){
        m=1000+a*100;
    }

    else if(c==b &&a!=c){
        m=1000+c*100;
    }
    else{
        if(a>b&&a>c){
            m=a*100;
        }
        else if(b>a&&b>c){
            m=b*100;
        }
        else if(c>a&&c>b) {
            m=c*100;
        }
    }
    cout<<m<<endl;
    return 0;

}