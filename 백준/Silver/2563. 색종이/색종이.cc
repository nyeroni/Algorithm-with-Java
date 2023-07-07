#include<iostream>
#include<string>
using namespace std;

int main()
{
    int N, xy[101][101]={0,};//101로 해야 배열의 인덱스가 100번까지 나타남
    int x, y;
    cin>>N;
    for(int i=0; i<N; i++){
        cin>>x>>y; 
        for(int j=x; j<x+10; j++){//해당 색종이의 가로 좌표
            for(int k=y; k<y+10; k++){//해당 색종이의 세로 좌표
                xy[j][k]=1;//그 색종이의 넓이부분에 속한 좌표를 이중배열을 이용해 1로 표시해둠
            }
        }
    }
    int cnt=0;
    for(int i=0; i<101; i++){
        for(int j=0; j<101; j++){
            if(xy[i][j]==1){ //표시된 넓이
                cnt++; //수 만큼 cnt 증가
            }
        }
    }
    cout<<cnt<<endl;

    return 0;
}