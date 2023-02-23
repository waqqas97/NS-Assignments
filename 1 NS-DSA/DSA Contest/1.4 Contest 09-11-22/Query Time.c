// Query Time


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array Arr of N integers. You have to process Q queries on the array. Each query contains L and R, for each query you have to report the number of indices i in the array such that L <= Arr[i] <= R.
// Input
// First line of input contains two integers N and Q representing number of elements in the array and number of queries.
// Second line of input contains N integers representing the array Arr.
// Next Q lines of input contains L and R for that query.

// Constraints
// 1 <= N,Q <= 100000
// 1 <= Arr[i] <= 100000
// 1 <= L <= R <= 100000
// Output
// For each query you have to print the number of index i in the array such that L <= Arr[i] <= R in a seperate line.
// Example
// Sample input
// 10 10
// 3 6 7 4 9 1 7 10 9 4
// 1 9
// 4 6
// 4 7
// 4 6
// 6 8
// 5 8
// 2 6
// 2 3
// 9 9
// 2 5

// Sample output
// 9
// 3
// 5
// 3
// 3
// 3
// 4
// 1
// 2
// 3

// Explanation :
// For range 1 to 9 : all indexes except index 8 (with value 10) have values in the range 1 to 9
// For range 4 to 6 : indexes 2(with value 6), 4(with value 4) and 10(with value 4) have value in the range 4 to 6

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
	// Your code here
    int n,q;
    cin>>n>>q;
    map<int, int>m;
    int arr[n+1]={0};
    for(int i=0; i<n; i++){
        int x;
        cin>>x;
        arr[x]++;
    }
    for(int i=1; i<=n; i++){
        arr[i]=arr[i]+arr[i-1];
    }
    while(q--){
        int l,r;
        cin>>l>>r;
        cout<<arr[r]-arr[l-1]<<endl;
    }
}