// Problem Statement:
// Some Data types are given below:-
// Integer
// Long
// float
// Double
// char
// Your task is to take input in the given format and print them in the same order.

// InputL:
// The input contains the following values separated by lines:- integer, Long, float, double, char

// Output:
// Print each element in a new line in the same order as input.

// Note:- Print float round off to two decimal places and double to 4 decimal places.

// Example
// Sample Input:-
// 2
// 2312351235
// 1.21
// 543.1321
// c

// Sample Output:-
// 2
// 2312351235
// 1.21
// 543.1321
// c


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Datatypes
{
    public static void main (String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        float c = sc.nextFloat();
        double d = sc.nextDouble();
        char e = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(e);    
    }
}