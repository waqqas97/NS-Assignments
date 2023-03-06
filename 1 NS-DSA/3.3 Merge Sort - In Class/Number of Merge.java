// Number of Merge


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an unsorted array of length n and must sort it using merge sort while also printing the amount of merges that occur throughout the sorting process.
// Input
// The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

// Constraints:
// 0<= n <=100000
// Output
// First- line should be the sorted array and the second should be the number of mergers that occurs when the array is sorted using merge sort.
// Example
// Sample Input:
// 5
// 5 1 2 7 3

// Output:
// 1 2 3 5 7
// 4


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

         for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\n" + (n-1));
    }
}