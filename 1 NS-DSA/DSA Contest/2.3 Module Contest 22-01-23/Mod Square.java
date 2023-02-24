// Mod Square


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array P of size N. You have to find the maximum value of Pi % Pj for all possible i, j pairs.
// Input
// First line contains a single integer N.
// The second line of the input contains N space seperated integers.

// Constraints:
// 2 <= N <= 105
// 1 <= Pi <= 109
// Output
// Print the maximum value of Pi % Pj for all possible i, j pairs in the array.
// Example
// Sample Input:
// 5
// 8 6 7 9 4

// Sample Output:
// 8

// Explanation:
// i = 1, j = 4 (1-based indexing) will give the maximum possible result over all (i, j) pairs.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int modSquare(int a[], int n){
        int l, r;
        if(n<2){
            return 0;
        }
        l=r = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>l){
                r=l;
                l=a[i];
            }
            else if(a[i]>r && a[i]!=l){
                r=a[i];
            }
        }
        if(r==Integer.MIN_VALUE){
            return 0;
        }
        else{
            return r;
        }
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print(modSquare(a,n));
        
    }
}