// Array Proximity (Contest)


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array A of size N. Over all pairs of (l, r) (1 <= l < r <= n), find the maximum value of max(Al, Al+1,... , Ar) * min(Al, Al+1,... , Ar).
// Input
// The first line of the input contains a single integer N.
// The second line of the input contains N space seperated integers.

// Constraints:
// 1 <= N <= 105
// 1 <= Ai <= 109
// Output
// Over all pairs of (l, r) (1 <= l < r <= n), print the maximum value of max(Al, Al+1,. , Ar) * min(Al, Al+1,. , Ar).
// Example
// Sample Input:
// 4
// 2 3 2 1

// Sample Output:
// 6

// Explaination:
// Let l = 1, r = 3
// max = 3, min = 2
// value = 3*2 = 6.
// It can be verified that this is the maximum such value possible.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long [n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }

        long ans =0;
        for(int i=0; i<n-1; i++){
            if(ans < (a[i]*a[i+1]))
            ans = a[i]*a[i+1];
        }
        System.out.print(ans);




    // long ans =0;
    // for(int i=0; i<n-1; i++){
    //     long max =a[i];
    //     long min =a[i];
    //     for(int j=i+1; j<n; j++){
    //         if(a[j]>max)
    //             max = a[j];
    //         if(a[j]<min)
    //             min = a[j];
    //         if(max*min>ans)
    //             ans= max*min;
    //     }
    // }
    // System.out.print(ans);


    }
}