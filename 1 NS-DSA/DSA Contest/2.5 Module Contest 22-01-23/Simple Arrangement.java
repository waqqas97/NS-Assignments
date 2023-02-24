// Simple Arrangement


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once), output an array such that A[i] becomes A[A[i]].
// Make sure you don't use extra memory than the array itself.
// Input
// The first line of the input contains a number n, the number of integers in the array.
// The second line of the input contains n numbers, the elements of A.

// Constraints:
// 1 <= n <= 100000
// 0 <= A[i] <= n-1
// Output
// Output the required array of n integers.
// Example
// Sample Input 1:
// 5
// 4 2 3 0 1

// Sample Output 1:
// 1 3 0 4 2

// Sample Input 2:
// 10
// 9 5 1 4 7 8 0 6 3 2

// Sample Output 2:
// 2 8 5 7 6 3 9 0 4 1

// Explanation 1:
// A[0] will be A[A[0]]=A[4]=1
// A[1] will be A[A[1]]=A[2]=3
// A[2] will be A[A[2]]=A[3]=0
// A[3] will be A[A[3]]=A[0]=4
// A[4] will be A[A[4]]=A[1]=2




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int newArr[] = new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            newArr[j++] = arr[arr[i]];
        }
        for(int i=0; i<j; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}