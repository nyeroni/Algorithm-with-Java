#include<iostream>
#include<string>
using namespace std;

int main()
{
    cout.precision(6);
    cout.setf(ios::fixed);
    string str="", g="";
    float s, total=0,cnt=0;
    for(int i=0; i<20; i++){
        cin>>str>>s>>g;
        if(g.find("A+")!=string::npos){
            total+=4.5*s;
        }
        else if(g.find("A0")!=string::npos){
            total+=4.0*s;
        }
        else if(g.find("B+")!=string::npos){
            total+=3.5*s;
        }
        else if(g.find("B0")!=string::npos){
            total+=3.0*s;
        }
        else if(g.find("C+")!=string::npos){
            total+=2.5*s;
        }
        else if(g.find("C0")!=string::npos){
            total+=2.0*s;
        }
        else if(g.find("D+")!=string::npos){
            total+=1.5*s;
        }
        else if(g.find("D0")!=string::npos){
            total+=1.0*s;
        }
        else if(g.find("F")!=string::npos){
            total+=0.0*s;
        }
        else if(g.find("P")!=string::npos){
            s=0;
        }
        cnt+=s;
    }
    cout<<total/cnt<<endl;

    return 0;
}