#include<iostream>
#include<string>
#include<cmath>
#include<algorithm>
using namespace std;

int main()
{
    int M,N;
    cin>>M>>N;

    char arr[51][51];

    for(int i=0; i<M; i++){
        for(int j=0; j<N; j++){
            cin>>arr[i][j];
        }
    }


    int min=2501;
    for(int k=0; k<M-7; k++){
        for(int l=0; l<N-7; l++){
            int cnt_e=0, cnt_o=0,cnt=0;
            for(int i=0; i<8; i++){
                for(int j=0; j<8; j++) {
                    if ((i + k + j + l) % 2 == 0 && arr[i+k][j+l]=='W'||(i + k + j + l) % 2 == 1 && arr[i+k][j+l]=='B') {
                        cnt_e++;

                    } else if((i + k + j + l) % 2 == 0 && arr[i+k][j+l]=='B'||(i + k + j + l) % 2 == 1 && arr[i+k][j+l]=='W'){
                        cnt_o++;
                    }
                }
            }
            cnt_e=64-cnt_e;
            cnt_o=64-cnt_o;
            if(cnt_e<cnt_o){
                cnt=cnt_e;
            }
            else{
                cnt=cnt_o;
            }
            if(cnt<min){
                min=cnt;
            }

        }
    }
    cout<<min<<endl;
    return 0;
}

