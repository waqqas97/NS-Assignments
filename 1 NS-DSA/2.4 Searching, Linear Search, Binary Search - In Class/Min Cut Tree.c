// Min Cut Tree

// medium
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an integer K and an array height[] of size N, where height[i] denotes the height of the ith tree in a forest. The task is to make a cut of height X from the ground such that at max K units wood is collected. Find the minimum value of X
// If you make a cut of height X from the ground then every tree with a height greater than X will be reduced to X and the remaining part of the wood can be collected
// Input
// The first line contains two integers N and K.
// The next line contains N integers denoting the elements of the array height[]

// Constraints
// 1 ≤ N ≤ 105
// 1 ≤ arr[i] ≤ 105
// 1 ≤ K ≤ 107
// Output
// Print a single integer with the value of X.
// Example
// Sample Input:
// 4 2
// 1 2 1 2

// Sample Output:
// 1

// Explanation:
// Make a cut at height 1, the updated array will be {1, 1, 1, 1} and
// the collected wood will be {0, 1, 0, 1} i. e. 0 + 1 + 0 + 1 = 2.


#include <bits/stdc++.h>
using namespace std;

int woodCollected(int height[], int n, int m)
{
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
        if (height[i] - m <= 0)
            break;
        sum += (height[i] - m);
    }

    return sum;
}


int collectKWood(int height[], int n,  int k)
{

    sort(height, height + n);


    int low = 0, high = height[n - 1];


    while (low <= high) {
        int mid = low + ((high - low) / 2);

        int collected = woodCollected(height, n, mid);

        if (collected == k)
            return mid;


        if (collected > k)
            low = mid + 1;

        else
            high = mid - 1;
    }

    return low;
}


int main()
{

	int n;
    int k;
	cin>>n>>k;

	int arr[n];

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

    cout << collectKWood(arr, n, k);

    return 0;
}