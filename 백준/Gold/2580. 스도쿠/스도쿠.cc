#include<iostream>
#include<cstring>
#include<cmath>
#include<algorithm>
#include<vector>
#include<iterator>
#include<map>
#include<set>
#include<unordered_set>
#include <stack>
#include<queue>
#include<deque>

using namespace std;
int arr[9][9];
bool check(int x, int y, int num){
    for(int i=0; i<9; i++){ //행 검사
        if(arr[x][i]==num)return false;
    }
    for(int i=0; i<9; i++){ //열 검사
        if(arr[i][y]==num)return false;
    }
    for(int i=0; i<3; i++){ //3x3 검사
        for(int j=0; j<3; j++){
            if(arr[(x/3)*3+i][(y/3)*3+j]==num)return false;
            //9칸을 3등분하여 3칸짜리를 3세트로 만들기 위해
        }
    }
    return true;
}
void backtracking(int index){
    if(index==81){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                cout<<arr[i][j]<<" ";
            }
            cout<<'\n';
        }
        exit(0);
    }
    if(arr[index/9][index%9]!=0){
        backtracking(index+1);
        return ;
    }
    for(int i=1; i<=9; i++){
        if(!check(index/9,index%9,i))continue;
        arr[index/9][index%9]=i;
        backtracking(index+1);
        arr[index/9][index%9]=0;
    }
}
int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    for(int i=0; i<81; i++){
        cin>>arr[i/9][i%9];
    }
    backtracking(0);
    return 0;
}