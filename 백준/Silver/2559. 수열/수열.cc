#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int N, K; 
    int sum[100004];
    int ret = -10000001;
    cin >> N >> K;
	
	for(int i = 1; i <= N; i++){
		int num;
		cin >> num;
		sum[i] = sum[i - 1] + num;
	}
	
	for(int i = K; i <= N; i++){
		ret = max( ret, sum[i] - sum [i - K] );
	}
	
	cout << ret;
    return 0;
}