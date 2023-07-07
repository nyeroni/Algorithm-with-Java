#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main()
{
    long int n;
    cin>>n;
    //1=밑변1 옆면 2 윗면 1, 2=밑변 2 옆면 2+2 윗면2
    //3 = 밑변 3 옆면 3*2 윗면 3

    long int ans = n+2*n+n;
    cout<<ans<<endl;
    return 0;
}
