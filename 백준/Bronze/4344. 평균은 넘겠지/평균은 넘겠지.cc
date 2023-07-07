#include<iostream>
#include<string>
using namespace std;
float average(int *arr, int N){
    int total=0;
    for(int i=0; i<N; i++){
        total+=arr[i];
    }
    float avg=(float)total/(float)N;
    return avg;
}
int main()
{

    int C,N;
    cin>>C;
    for(int i=0; i<C; i++){
        cin>>N;
        int cnt=0;
        int *arr=(int*)malloc(sizeof(int)*N);
        if(arr==NULL)cout<<"no memory\n";
        for(int j=0; j<N; j++){
            cin>>arr[j];
        }
        float avg = average(arr, N);
        cout.precision(3);
        cout.setf(ios::fixed);
        for(int j=0; j<N; j++){
            if(avg<arr[j]) {
                cnt++;
            }
        }
        float result=((float)cnt/(float)N)*100;
        cout<<result<<"%"<<endl;
    }
    return 0;
}