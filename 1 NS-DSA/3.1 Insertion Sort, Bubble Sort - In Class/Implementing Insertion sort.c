// Implementing Insertion sort


// easy
// asked in interviews by 3 companies
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.
// Input
// First line of the input denotes number of test cases T. First line of the testcase is the size of array N and second line consists of array elements separated by space.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 10^3
// 1 <= A[i] <= 10^3
// Output
// For each testcase print the sorted array in a new line.
// Example
// Input:
// 2
// 5
// 4 1 3 9 7
// 10
// 10 9 8 7 6 5 4 3 2 1

// Output:
// 1 3 4 7 9
// 1 2 3 4 5 6 7 8 9 10

// Explanation:
// Testcase 1: The array after perfoming insertion sort: 1 3 4 7 9.
// Testcase 2: The array after performing insertion sort: 1 2 3 4 5 6 7 8 9 10.



#include<bits/stdc++.h>
using namespace std;
void merge(int arr[], int p, int q, int r) {
  int n1 = q - p + 1;
  int n2 = r - q;

  int L[n1], M[n2];

  for (int i = 0; i < n1; i++)
    L[i] = arr[p + i];
  for (int j = 0; j < n2; j++)
    M[j] = arr[q + 1 + j];

  int i, j, k;
  i = 0;
  j = 0;
  k = p;
  while (i < n1 && j < n2) {
    if (L[i] <= M[j]) {
      arr[k] = L[i];
      i++;
    } else {
      arr[k] = M[j];
      j++;
    }
    k++;
  }


  while (i < n1) {
    arr[k] = L[i];
    i++;
    k++;
  }

  while (j < n2) {
    arr[k] = M[j];
    j++;
    k++;
  }
}
void mergeSort(int arr[], int l, int r) {
  if (l < r) {
    int m = l + (r - l) / 2;

    mergeSort(arr, l, m);
    mergeSort(arr, m + 1, r);

    merge(arr, l, m, r);
  }
}

void printArray(int arr[], int size) {
  for (int i = 0; i < size; i++)
    cout << arr[i] << " ";
  cout << endl;
}

int main() {

    int n;
    cin>>n;

    for(int p=0;p<n;p++){
        
        int size;
        cin>>size;
        int arr[size];
        for(int i=0;i<size;i++){
            cin>>arr[i];
        }
          mergeSort(arr, 0, size - 1);
          printArray(arr, size);


           // this code contributed by Abhishek Chauhan
    }

  return 0;
}