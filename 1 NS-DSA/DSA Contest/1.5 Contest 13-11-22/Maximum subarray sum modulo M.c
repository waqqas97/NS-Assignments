// Maximum subarray sum modulo M


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array of N integers, your task is to find the maximum value of the sum of its subarray modulo M, i. e., find the sum of each subarray mod M and print the maximum value of this after modulo operation.
// Input
// The first line of input contains two space-separated integers N and M, the next line of input contains N space-separated integers depicting value of the array.

// Constraints:-
// 1 < = N < = 100000
// 1 < = M < = 10000000000
// 1 < = Arr[i] < = 10000000000
// Output
// Print the maximum value of sum modulo m.
// Example
// Sample Input:-
// 5 13
// 6 6 11 15 2

// Sample Output:-
// 12

// Explanation:
// [6, 6] is subarray is maximum sum modulo 13

// Sample Input:-
// 3 15
// 1 2 3

// Sample Output:-
// 6

// Explanation:
// Max sum occurs when we take the whole array



#include <bits/stdc++.h>
using namespace std;

int maxSubarry(int arr[], int n,int m){
    int x, prefx=0;
    auto maxSumMod =0;

set<int> sums;
sums.insert(0);
for(int i=0; i<n; i++){
    prefx =(prefx + arr[i])%m;
    maxSumMod = max(maxSumMod, prefx);
    auto it = sums.lower_bound(prefx+1);
    if(it!= sums.end())
        maxSumMod = max(maxSumMod, prefx - (*it)+m);
        sums.insert(prefx);
}
return maxSumMod;
}
int main(){
    int n;
    int m;
    cin>>n;
    cin>>m;
    int arr[n];

    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    cout<<maxSubarry(arr,n,m);
    return 0;
}