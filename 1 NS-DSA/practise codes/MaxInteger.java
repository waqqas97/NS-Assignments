// Problem Statement;
// Given three integers your task is to calculate the maximum integer among the given integers.

// Input;
// The input contains three integers a, b, and c

// Constraint:
// 1<=integers<=10000

// Output:
// Print the maximum integer among the given integers.

// Example:
// Sample Input: 1
// 2 6 3

// Sample Output:1
// 6

// Sample Input:2
// 48 100 100

// Sample Output:2
// 100


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxInteger 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        if(a>b)
        {
            if(a>c)
            {
                result=a;
            }
            else
            {
                result=c;
            }
        }
        else
        {
            if(b>c)
            {
                result= b;
            }
            else
            {
                result = c;
            }
        }
        // result = ((a>b) ? (a>c) ? a: c: (b>c) ? b: c);
        System.out.println(result);   
    }
}