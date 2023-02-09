// Problem Statement:
// Given three integers A, B, and C, your task is to print the sum of these three integers.

// Input:
// The input contains 3 integers separated by spaces A, B, and C.

// Constraints:-
// 1 <= A, B, C <= 100

// Output:
// Print the sum of A, B and C.

// Example
// Sample Input: 1
// 1 2 3

// Sample Output: 1
// 6

// Sample Input: 2
// 5 4 2

// Sample Output: 2
// 11


import java.io.*; 
import java.util.*;

public class Simplesum
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+b+c);
        
        // int a = 2;
        // int b = 3;
        // int sum = a + b;
        // System.out.println(sum);
    }
}