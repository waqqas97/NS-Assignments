// Problem Statement:
// your task is to take input of the given string and print the same string.

// Input:
// The input contains a single string S.

// Output:
// Print the string S.

// Example:
// Sample Input: 1
// NewtonSchool

// Sample Output: 1
// NewtonSchool

// Sample Input: 2
// Hello

// Sample Output: 2
// Hello




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Simplestringinput
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
    }
}