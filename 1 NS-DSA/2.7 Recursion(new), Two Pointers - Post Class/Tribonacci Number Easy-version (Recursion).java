// Tribonacci Number: Easy-version (Recursion)



// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Fibonacci numbers are interesting but Tribonacci numbers are more interesting.
// A Tribonacci number T(n) is the sum of the preceding three elements in a series. Consider its first three numbers to be 0, 0, and 1. i. e T(1) = 0, T(2) = 0, T(3) = 1.
// Given a number N, your task is to return the nth Tribonacci number.
// Input
// The input contains a single integer N.

// Constraints:-
// 1 <= N <= 20
// Output
// Return the Nth Tribonacci number.
// Example
// Sample Input:-
// 4

// Sample Output:-
// 1

// Sample Input:-
// 7

// Sample Output:-
// 7




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static int fun(int n){
        if(n == 1 || n == 2)
            return 0;
        if(n == 3)
            return 1;
        
        return fun(n-1) + fun(n-2) + fun(n-3);
    }

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fun(n));
    }
}