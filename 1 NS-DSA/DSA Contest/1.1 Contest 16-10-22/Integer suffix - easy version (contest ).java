// Integer suffix - easy version (contest )


// easy
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// An integer x is called suffix of integer y if binary form of x is suffix of binary form of y.
// For example, 3 (binary = 11) is suffix of 7( binary = 111) and 11 ( binary = 1011).

// You are given an integer array of size n and an Integer x. You have to count the number of integers y in the given array such that x is suffix of y.

// NOTE : Leading zeroes are not considered in binary form for this problem .
// For example : 5 in binary is 101 , not 0101 .
// Input
// First line contains n.
// Second line contains n space separated.
// Next line contains a single integer x.

// Constraints
// 1 <= n <= 105
// 1 <= arr[i], x = 109
// Output
// A single integer denoting the required answer.
// Example
// Input:
// 5
// 11 13 3 9 7
// 3

// Output:
// 3

// Explanation :
// 11 => 1011
// 13 => 1101
// 3 => 11
// 9 => 1001
// 7 => 111

// 3 in binary form is "11". 3 is suffix of [ 11, 3, 7 ].


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr[] =new String[n];

    for (int i=0; i<n; i++)
    arr[i]= Integer.toString(sc.nextInt(),2);
    String x= Integer.toString(sc.nextInt(),2);
    long count=0;
    for(String s:arr){
        if(s.length()>=x.length()){
            if(s.substring(s.length()-x.length()).equals(x))count++;
        }
    }
    System.out.println(count);                
    }
}