#pragma warning (disable : 4996) //scanf() 보안 오류를 비활성화
#include<stdio.h>  //헤더파일 포함
#include<string.h>//헤더파일 포함
int main() { //main함수 시작
	int N,cnt=0;
	scanf("%d", &N);
	if (N % 5 == 0) {
		printf("%d", N / 5);
		return 0;
	}
	while (N>0) {
		N = N - 3;
		cnt++;
		if (N % 5 == 0) {
			cnt += (N / 5);
			printf("%d", cnt);
			return 0;
		}
	}
	printf("-1");
	return 0;
}//main함수 끝
