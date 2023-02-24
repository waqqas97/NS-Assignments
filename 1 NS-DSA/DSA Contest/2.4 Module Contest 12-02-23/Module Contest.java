// Maximizing Difference


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an integer N and two arrays A and B each of size N. In one move, you can swap any integer from array A with that of array B, they don't need to have the same index. Let sumA be the sum of elements of array A and sumB be the sum of the elements of array B. Find the maximum possible value of sumA - sumB possible after applying optimal moves.
// Input
// First line of the input contains an integer N,
// The second line of the input contains N space seperated integers of array A,
// The third line of the input contains N space seperated integers of array B.

// Constraints:
// 1 <= N <= 105
// 1 <= Ai, Bi <= 109
// Output
// Print the maximum possible value of sumA - sumB possible after apply optimal moves.
// Example
// Sample Input:
// 5
// 7 9 4 4 2
// 8 3 2 4 1

// Sample Output:
// 20

// Explaination:
// We swap B1 with A5, This makes A = [7, 9, 4, 4, 8], B = [2, 3, 2, 4, 1]. sumA = 32.
// sumB = 12.
// sumA - sumB = 20
// It can be proved that this is the maximum possible difference.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] a1 = new long[n*2];
        for(int i=0;i<(n*2);i++){
            a1[i]= sc.nextLong();
         
        } long sum1=0, sum2=0;;
        Arrays.sort(a1);
        for(int i=0;i<n;i++){
            sum1 +=a1[i];
        }
        for(int i=n;i<n*2;i++){
             sum2 +=a1[i];
        }
        long ans= sum2-sum1;
        System.out.print(ans);
    }
    }