// Problem Statement:
// Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. 
// But, multiples of 100 which are not multiples of 400 are not leap years.

// Input:
// The input contains a single integer N

// Constraint:
// 1 <= n <= 5000

// Output:
// Print "YES" if the year is a leap year else print "NO".

// Example:
// Sample Input: 1
// 2000

// Sample Output: 1
// YES

// Sample Input: 2
// 2003

// Sample Output: 2
// NO

// Sample Input: 3
// 1900

// Sample Output: 3
// NO


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Ifleapyear 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%400==0)
        {
            System.out.println("YES");
        }
        else if(y%100==0)
        {
            System.out.println("NO");
        }
        else if(y%4==0)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}