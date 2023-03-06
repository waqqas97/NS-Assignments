// Maximum difference array


// medium
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array of integers of size N, your task is to find the maximum parity index of this array.
// Parity Index is the maximum difference between two indices i and j (1 <= i < j <= N) of an array A such that Ai < Aj.
// Input
// The first line contains a single integer N, next line contains N space-separated integers depicting the values of the array.

// Constraints:-
// 1 < = N < = 105
// 1 < = Arr[i] < = 105
// Output
// Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
// Example
// Sample Input 1:-
// 5
// 1 2 3 4 5

// Sample Output 1:-
// 4

// Sample Input 2:-
// 5
// 5 4 3 2 1

// Sample Output 2:-
// -1

// Explanation 1:
// The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]




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

        int prefixMin[] = new int[n];
        prefixMin[0] = a[0];
        for(int i=1; i<n; i++) {
            prefixMin[i] = Math.min(a[i], prefixMin[i-1]);
        }

        int prefixMax[] = new int[n];
        prefixMax[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--) {
            prefixMax[i] = Math.max(a[i], prefixMax[i+1]);
        }


        int ans = -1;

        int i=0;
        int j=1;
        while(j < n){
            if(prefixMin[i] < prefixMax[j]){
                int diff = j-i;
                ans = Math.max(diff, ans);
                j++;
            }
            else{
                i++;
                if(i>=j){
                    j = i+1;
                }
            }
        }

        System.out.println(ans);
    }
}