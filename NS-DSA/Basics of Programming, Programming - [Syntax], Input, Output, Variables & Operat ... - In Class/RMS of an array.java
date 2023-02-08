// RMS of an array
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array A of size N. You need to find the root mean square (RMS) of the array i. e you first need to square all values of array and take its mean. Then you need to return the square root of mean. Print the answer with precision upto 6 decimal places.
// Input
// The first line contains an integer N - the size of the array
// The next line contains N space-separated integers - the elements of the array.

// Constraints:
// 1 <= N <= 100
// 1 <= Ai <= 100
// Output
// Print the RMS value of the array.
// Example
// Sample Input 1:
// 4
// 1 2 3 4

// Output:
// 2.738613

// Sample Input 2:
// 2
// 7 13

// Output:
// 10.440307

// Explanation 1:
// Sum of squares = 1 + 4 + 9 + 16 = 30
// Mean = 30 / 4 = 7.5
// Taking a square root of 7.5 gives 2.738613

// Explanation 2:
// Sum of squares = 49 + 169 = 218
// Mean = 218 / 2 = 109
// Taking the square root of 109 gives 10.440307



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.*;
// don't change the name of this class
// you can add inner classes if needed
class Main 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double mean=0.0,sum=0.0;
        int arr [] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
            sum+= arr[i]*arr[i];
        }
        sum/=n;
        mean = Math.sqrt(sum);
        System.out.printf("%.6f",mean);
    }
}