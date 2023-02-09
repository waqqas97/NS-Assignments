// Problem Statement:
// Given a temperature F in Farenheit, your task is to convert it into Celsius using the following equation:-
// T(°c) = (T(°f) - 32)*5/9


// Input:
// The input contains a single integer F.

// Constraints:
// -10^3 <= F <= 10^3

// Note:- It is guaranteed that F - 32 will be a multiple of 9.

// Output:
// Print an integer containing converted temperature in Fahrenheit.

// Example:
// Sample Input : 1
// 77

// Sample Output: 1
// 25

// Sample Input: 2
// -40

// Sample Output: 2
// -40


import java.util.*; // contains Collections framework
// import java.io.*; // for handling input/output


class Fahrenheit 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int far = sc.nextInt();
        int celsius = (far-32)*5/9;
        System.out.println(celsius);
        
    }
}