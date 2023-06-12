#include <iostream>
using namespace std;
const int N = 200005;
int a[N], b[N];

int main(){
    int c;
    cin >> c;
    int x = 0;
    for(int i = 0; i < c; i++) {
        cin >> a[i];
        x += a[i];
    }
    for(int i = 0; i < c; i++) {
        cin >> b[i];
        x += b[i];
    }
    int cnt = x * 3;
    if(a[0] == 1 && b[0] == 1) {
        cnt -= 2;
    }
    for(int i = 1; i < c; i++) {
        if(a[i] == 1 && a[i - 1] == 1) {
            cnt -= 2;
        }
        if(b[i] == 1 && b[i - 1] == 1) {
            cnt -= 2;
        }
        if(i % 2 == 0 && a[i] == 1 && b[i] == 1) {
            cnt -= 2;
        }
    }
    cout << cnt << endl;
    return 0;
}
