// Problem Statement:
// Write a program to input three numbers from user and find maximum between three numbers using ternary operator

// Input:
// The first line of the input contains three numbers a, b and c.

// Constraints:
// 1<= a, b, c <= 1e9

// Output:
// Print the maximum Number

// Example:
// Sample Input:1
// 12 14 15

// Sample Output;1
// 15


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxInThreeNo 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        // int a = 20; b = 10; c= 30; result;
        result = ((a>b) ? (a>c) ? a: c: (b>c) ? b: c);
        System.out.println(result);
    }
}