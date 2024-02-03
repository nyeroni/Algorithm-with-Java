#include <iostream>
#include <algorithm>
using namespace std;
int home[1001][3];
int main() {
    
    int N;
    int cost[3];
    
    home[0][0] = 0;
    home[0][1] = 0;
    home[0][2] = 0;
    
    cin >> N;
    
    for(int i = 1; i <= N; ++i)
    {
        cin >> cost[0] >> cost[1] >> cost[2];
        home[i][0] = min(home[i-1][1],home[i-1][2]) + cost[0];
        home[i][1] = min(home[i-1][0],home[i-1][2]) + cost[1];
        home[i][2] = min(home[i-1][1],home[i-1][0]) + cost[2];
    }
    
    cout << min(home[N][2],min(home[N][0],home[N][1]));
    return 0;
}