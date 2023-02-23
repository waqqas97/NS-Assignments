// Nearest Smaller Element


// easy
// asked in interviews by 1 company
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array A, find the nearest smaller element S[i] for every element A[i] in the array such that the element has an index smaller than i.

// More formally,
// S[i] for an element A[i] = an element A[j] such that
// j is maximum possible AND
// j < i AND
// A[j] <= A[i]
// Elements for which no smaller element exist, consider next smaller element as -1.
// Input
// The first line contains the size of array, n
// The next line n elements of the integer array, A[i]

// Constraints:
// 1 <= n <= 10^5
// 1 <= A[i] <= 10^6
// Output
// Print the integer array S such that S[i] contains nearest smaller number than A[i] such than index of S[i] is less than 'i'. If no such element occurs S[i] should be -1.
// Example
// Input:
// 5
// 4 5 2 10 8

// Output:
// -1 4 -1 2 2

// Explanation 1:
// index 1: No element less than 4 in left of 4, G[1] = -1
// index 2: A[1] is only element less than A[2], G[2] = A[1]
// index 3: No element less than 2 in left of 2, G[3] = -1
// index 4: A[3] is nearest element which is less than A[4], G[4] = A[3]
// index 4: A[3] is nearest element which is less than A[5], G[5] = A[3]

// Input:
// 5
// 1 2 3 4 5

// Output:
// -1 1 2 3 4



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void printPreviousSmaller(int a[], int n){
        System.out.print(-1+" ");
        for(int i=1; i<n; i++){
            int j;
            for(j=i-1; j>=0; j--){
                if(a[j] <= a[i]){
                    System.out.print(a[j]+" ");
                    break;
                }
            }
            if(j== -1){
                System.out.print(-1+" ");
            }
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        printPreviousSmaller(a, n);
    }
}