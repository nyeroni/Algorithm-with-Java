#include<iostream>
#include<string>
using namespace std;

int main()
{
    string table[8]={"c=","c-","dz=","d-","lj","nj","s=","z="};
    string str="";
    cin>>str;
    int index;
    for(int i=0; i<8; i++){
        while(1){
            index=str.find(table[i]);
            if(index==string::npos){
                break;
            }
            str.replace(index, table[i].length(), "!");

        }
    }
    cout<<str.length()<<endl;

    return 0;
}