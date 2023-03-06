// Implementing Merge Sort


// easy
// asked in interviews by 33 companies
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an unsorted array, your task is to sort the array using merge sort.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
// arr: input array
// start: starting index which is 0
// end: ending index of array

// Constraints
// 1 <= T <= 100
// 1 <= N <= 106
// 0 <= Arr[i] <= 109

// Sum of 'N' over all test cases does not exceed 106
// Output
// You need to return the sorted array. The driver code will print the array in sorted form.
// Example
// Sample Input:
// 2
// 3
// 3 1 2
// 3
// 4 5 6

// Sample Output:
// 1 2 3
// 4 5 6



public static int[] implementMergeSort(int a[], int l, int h)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose
        int m = l + (h-l)/2;

        if(l < h){
            implementMergeSort(a, l, m);
            implementMergeSort(a, m+1, h);
            merge(a, l, m, h);
        }

      return a;
    }

    static void merge(int a[], int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //Copy values from a to L
        for(int i=0; i<n1; i++){
            L[i] = a[l+i];
        }

        //Copy values from a to R
        for(int i=0; i<n2; i++){
            R[i] = a[m+1+i];
        }


        //Merge back the values from L and R to a
        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                a[k++] = L[i++];
            }
            else{
                a[k++] = R[j++];
            }
        }

        while(i<n1){
            a[k++] = L[i++];
        }

        while(j<n2){
            a[k++] = R[j++];
        }
    }